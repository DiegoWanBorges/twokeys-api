package com.twokeys.twokeysapi.services;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.twokeys.twokeysapi.dto.RoleDTO;
import com.twokeys.twokeysapi.entities.Role;
import com.twokeys.twokeysapi.repositories.RoleRepository;

@Service
public class RoleService {
	@Autowired
	private RoleRepository repository;
	
	@Transactional(readOnly=true)
	public List<RoleDTO> findAll(){
		List<Role> list =  repository.findAll();
		return list.stream().map(x -> new RoleDTO(x)).collect(Collectors.toList());
	}
}
