package com.twokeys.twokeysapi.services.exceptions;

public class StockMovementException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public StockMovementException(String msg) {
		super(msg);
	}
	
}
