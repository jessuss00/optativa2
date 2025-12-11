package com.daw.service.exeptions;

public class PizzaPedidoNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3473719105219602848L;

	public PizzaPedidoNotFoundException(String message) {
		super(message);
	}

}
