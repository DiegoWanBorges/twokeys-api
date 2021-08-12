package com.twokeys.twokeysapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twokeys.twokeysapi.dto.RoleDTO;
import com.twokeys.twokeysapi.services.RoleService;

@RestController
@RequestMapping(value="/roles")
public class RoleResource {
	@Autowired
	RoleService service;

	@GetMapping
	public ResponseEntity<List<RoleDTO>> findAll(){
		return ResponseEntity.ok().body(service.findAll());
	}
}

