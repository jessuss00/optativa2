package com.daw.service.exeptions;

public class ClienteNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1078066828959265230L;

	public ClienteNotFoundException(String message) {
		super(message);
	}

}
