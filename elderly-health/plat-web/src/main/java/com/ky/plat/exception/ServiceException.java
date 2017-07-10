package com.ky.plat.exception;

public class ServiceException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int errCode;
	
	public ServiceException(Throwable paramThrowable){
		super(paramThrowable);
	}

	public ServiceException() {
		
	}

	public ServiceException(int errCode,String paramString) {
		super(paramString);
		this.errCode = errCode;
	}

	public ServiceException(int errCode,String paramString, Throwable paramThrowable) {
		super(paramString, paramThrowable);
		this.errCode = errCode;
	}

	public ServiceException(int errCode,Throwable paramThrowable) {
		super(paramThrowable);
		this.errCode = errCode;
	}

	public ServiceException(int errCode) {
		this.errCode = errCode;
	}

	public int getErrCode() {
		return errCode;
	}
}
