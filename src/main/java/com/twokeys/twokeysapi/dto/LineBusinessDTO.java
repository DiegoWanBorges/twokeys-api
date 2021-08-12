package com.twokeys.twokeysapi.dto;

import java.io.Serializable;

import com.twokeys.twokeysapi.entities.LineBusiness;

public class LineBusinessDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	public LineBusinessDTO() {
	}

	public LineBusinessDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public LineBusinessDTO(LineBusiness entity) {
		this.id = entity.getId();
		this.name = entity.getName();
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
}
