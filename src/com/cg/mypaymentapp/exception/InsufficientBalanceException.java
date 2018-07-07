package com.cg.mypaymentapp.exception;

public class InsufficientBalanceException extends RuntimeException {
	
	public InsufficientBalanceException() {
		
	}
	
	public InsufficientBalanceException(String str) {
		super(str);
	}

}
