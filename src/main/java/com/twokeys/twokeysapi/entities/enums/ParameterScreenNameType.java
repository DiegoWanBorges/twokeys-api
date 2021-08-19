package com.twokeys.twokeysapi.entities.enums;

import javax.validation.ValidationException;

public enum ParameterScreenNameType {
	FANTASIA(0),
	RAZAO_SOCIAL(1);
	
	private int type;
	
	private ParameterScreenNameType(int type) {
		this.type=type;
	}
	
	public int getType() {
		return type;
	}
	public static ParameterScreenNameType valueOf(int type) {
		for (ParameterScreenNameType value : ParameterScreenNameType.values()) {
			if (value.getType()==type) {
				return value;
			}
		}
		throw new ValidationException();
	}
}
