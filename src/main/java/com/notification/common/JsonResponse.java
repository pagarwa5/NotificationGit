package com.notification.common;

import org.springframework.http.HttpStatus;

public class JsonResponse {

	private Object data;

	private boolean Success;
	
	private HttpStatus status;
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	
	

}
