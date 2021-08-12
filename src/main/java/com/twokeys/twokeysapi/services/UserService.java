package com.twokeys.twokeysapi.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.ValidationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.twokeys.twokeysapi.dto.RoleDTO;
import com.twokeys.twokeysapi.dto.UserDTO;
import com.twokeys.twokeysapi.dto.UserInsertDTO;
import com.twokeys.twokeysapi.dto.UserUpdateDTO;
import com.twokeys.twokeysapi.entities.Role;
import com.twokeys.twokeysapi.entities.User;
import com.twokeys.twokeysapi.repositories.RoleRepository;
import com.twokeys.twokeysapi.repositories.UserRepository;
import com.twokeys.twokeysapi.services.exceptions.DatabaseException;
import com.twokeys.twokeysapi.services.exceptions.ResourceNotFoundException;

@Service
public class UserService implements UserDetailsService {
	private static Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserRepository repository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	@Autowired
	private RoleRepository roleRepository;

	@Transactional(readOnly = true)
	public List<UserDTO> findByName(String name) {
		String nameConcat = "%" + name + "%";
		List<User> list = repository.findByNameLikeIgnoreCase(nameConcat);
		return list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
	}
	@Transactional(readOnly=true)
	public Page<UserDTO> findAllPaged(String name,PageRequest pageRequest){
	String nameConcat ="%"+name+"%";
	Page<User> list = repository.findByNameLikeIgnoreCase(nameConcat,pageRequest);
		return list.map(x -> new UserDTO(x));
	}

	@Transactional(readOnly = true)
	public UserDTO findById(Long id) {
		Optional<User> obj = repository.findById(id);
		User entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));

		return new UserDTO(entity);
	}

	@Transactional
	public UserDTO insert(UserInsertDTO dto) {
		User entity = new User();
		copyDtoToEntity(dto, entity);
		entity.setPassword(passwordEncoder.encode(dto.getPassword()));
		return new UserDTO(repository.save(entity));
	}
	
	@Transactional
	public UserDTO update(Long id, UserUpdateDTO dto) {
		User entity = repository.findById(id).get();
			
		if (entity.getLogin().equals(dto.getLogin())==false)  {
			if (repository.findByLogin(dto.getLogin()) != null) { 
				throw new ValidationException("Email já cadastrado");
			}
		}
		copyDtoToEntity(dto, entity);
		logger.info(dto.getPassword());
		if (dto.isUpdatePassword()) {
			entity.setPassword(passwordEncoder.encode(dto.getPassword()));
		}
		return new UserDTO(repository.save(entity));
	}
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Id not found: " + id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Integrity violation");
		}

	}

	private void copyDtoToEntity(UserDTO dto, User user) {
		user.setName(dto.getName());
		user.setLogin(dto.getLogin());
		user.getRoles().clear();
		for (RoleDTO rolDTO : dto.getRoles()) {
			Role role = roleRepository.getById(rolDTO.getId());
			user.getRoles().add(role);
		}
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repository.findByLogin(username);
		if (user == null) {
			logger.error("Usuario não encontrado: " + username);
			throw new UsernameNotFoundException("Usuario não encontrado: " + username);
		}
		logger.info("Usuario encontrado: " + username);
		return user;
	}
}
