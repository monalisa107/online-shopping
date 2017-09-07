package net.mnayak2.onlineshopping.exception;

import java.io.Serializable;

public class ProductNotFoundException extends Exception implements Serializable{

	private String message;
	private static final long serialVersionUID = 1L;
	
	public ProductNotFoundException()
	{
		this("Product is not ");
	}

	public ProductNotFoundException(String string) {
		this.message=System.currentTimeMillis()+": "+message;
	}

	public String getMessage() {
		return message;
	}

	
}
