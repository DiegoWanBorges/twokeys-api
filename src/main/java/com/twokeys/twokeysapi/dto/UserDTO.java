package com.twokeys.twokeysapi.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;

import com.twokeys.twokeysapi.entities.User;

public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	@NotBlank(message = "Campo nome obrigatorio")	
	private String name;
	
	private String login;
	
	private List<RoleDTO> roles = new ArrayList<>();
	
	public UserDTO() {
		
	}
		
	public UserDTO(Long id, @NotBlank(message = "Campo nome obrigatorio") String name,
				   String login, List<RoleDTO> roles) {
		super();
		this.id = id;
		this.name = name;
		this.login = login;
		this.roles = roles;
	}


	public UserDTO(User entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.login = entity.getLogin();
		entity.getRoles().forEach(rol -> this.roles.add(new RoleDTO(rol)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public List<RoleDTO> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleDTO> roles) {
		this.roles = roles;
	}
}
