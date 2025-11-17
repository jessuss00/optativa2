package com.daw.service.exeptions;

public class PizzaPedidoNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7239101262919209494L;

	public PizzaPedidoNotFoundException(String message) {
		super(message);
	}

}