package com.zcbspay.platform.business.exception;

import com.zcbspay.platform.business.commons.exception.AbstractRealnameDescException;

public class BusinessRealnameException extends AbstractRealnameDescException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;
	
	public BusinessRealnameException() {
		super();
	}
	public BusinessRealnameException(String code,Object ... para ) {
        this.params = para;
        this.code = code;
    }

	public BusinessRealnameException(String code) {
		super();
		this.code = code;
	}


	@Override
	public String getCode() {
		return this.code;
	}

}
