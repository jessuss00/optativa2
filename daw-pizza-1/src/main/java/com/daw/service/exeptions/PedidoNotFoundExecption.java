package com.daw.service.exeptions;

public class PedidoNotFoundExecption extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2791539739625423049L;

	public PedidoNotFoundExecption(String message) {
		super(message);
	}

}