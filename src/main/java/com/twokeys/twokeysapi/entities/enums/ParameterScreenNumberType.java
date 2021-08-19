package com.twokeys.twokeysapi.entities.enums;

import javax.validation.ValidationException;

public enum ParameterScreenNumberType {
	DOUBLE(0),
	INTEGER(1);
	
	private int type;
	
	private ParameterScreenNumberType(int type) {
		this.type=type;
	}
	
	public int getType() {
		return type;
	}
	public static ParameterScreenNumberType valueOf(int type) {
		for (ParameterScreenNumberType value : ParameterScreenNumberType.values()) {
			if (value.getType()==type) {
				return value;
			}
		}
		throw new ValidationException();
	}
}
