package com.twokeys.twokeysapi.dto;

import java.io.Serializable;

import com.twokeys.twokeysapi.entities.City;

public class CityDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String state;
	
	public CityDTO() {
	}
	
	public CityDTO(Long id, String name, String state) {
		this.id = id;
		this.name = name;
		this.state = state;
	}
	
	public CityDTO(City entity) {
		id = entity.getId();
		name = entity.getName();
		state = entity.getState();
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

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
