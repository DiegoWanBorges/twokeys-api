package com.twokeys.twokeysapi.entities.enums;

import javax.validation.ValidationException;

public enum OrderType {
	VENDA(1),
	BONIFICACAO(5);
	
	private int orderType;
	
	private OrderType(int orderType) {
		this.orderType=orderType;
	}
	
	public int getOrderType() {
		return orderType;
	}
	public static OrderType valueOf(int type) {
		for (OrderType value : OrderType.values()) {
			if (value.getOrderType()==type) {
				return value;
			}
		}
		throw new ValidationException();
	}
}
