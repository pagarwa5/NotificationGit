package com.notification.common;

public class JsonError {

	private int errorCode;

	private String message;

	public JsonError() {
		super();

	}

	public JsonError(int errorCode, String message) {
		super();
		this.errorCode = errorCode;
		this.message = message;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
