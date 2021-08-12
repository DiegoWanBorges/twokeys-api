package com.twokeys.twokeysapi.entities.enums;

import javax.validation.ValidationException;

public enum ClientType {
	PESSOA_FISICA(0),
	PESSOA_JURIDICA(1);
	
	private int clientType;
	
	private ClientType(int clientType) {
		this.clientType=clientType;
	}
	
	public int getClientType() {
		return clientType;
	}
	public static ClientType valueOf(int type) {
		for (ClientType value : ClientType.values()) {
			if (value.getClientType()==type) {
				return value;
			}
		}
		throw new ValidationException();
	}
}
