package com.twokeys.twokeysapi.dto;

import java.io.Serializable;

import com.twokeys.twokeysapi.entities.Section;

public class SectionDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	public SectionDTO() {
	}

	public SectionDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	public SectionDTO(Section entity) {
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
