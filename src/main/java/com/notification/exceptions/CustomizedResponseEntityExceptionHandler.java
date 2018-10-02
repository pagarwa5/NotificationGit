package com.notification.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.notification.common.JsonError;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<JsonError> handleAllExceptions(Exception ex, WebRequest request) {
		JsonError jsonError = new JsonError(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getCause().getCause().getMessage());
		return new ResponseEntity<>(jsonError, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
