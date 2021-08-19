package com.twokeys.twokeysapi.entities.enums;

import javax.validation.ValidationException;

public enum OrderStatus {
	ABERTO(0),
	INTEGRADO(1),
	CANCELADO(2),;
	
	private int orderStatus;
	
	private OrderStatus(int orderStatus) {
		this.orderStatus=orderStatus;
	}
	
	public int getOrderStatus() {
		return orderStatus;
	}
	
	public static OrderStatus valueOf(int status) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getOrderStatus()==status) {
				return value;
			}
		}
		throw new ValidationException();
	}
}	
