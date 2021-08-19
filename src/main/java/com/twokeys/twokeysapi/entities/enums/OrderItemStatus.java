package com.twokeys.twokeysapi.entities.enums;

import javax.validation.ValidationException;

public enum OrderItemStatus {
	ABERTO(0),
	ATENTIDO_PARCIALMENTE(1),
	ATENTIDO_TOTAL(2),
	CANCELADO(3),;
	
	private int orderItemStatus;
	
	private OrderItemStatus(int orderItemStatus) {
		this.orderItemStatus=orderItemStatus;
	}
	
	public int getOrderItemStatus() {
		return orderItemStatus;
	}
	
	public static OrderItemStatus valueOf(int status) {
		for (OrderItemStatus value : OrderItemStatus.values()) {
			if (value.getOrderItemStatus()==status) {
				return value;
			}
		}
		throw new ValidationException();
	}
}	
