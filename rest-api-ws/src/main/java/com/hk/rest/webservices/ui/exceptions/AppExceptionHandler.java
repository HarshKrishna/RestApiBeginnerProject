package com.hk.rest.webservices.ui.exceptions;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.hk.rest.webservices.ui.model.response.ErrorMessage;

@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<Object> handleExceptions(Exception ex, WebRequest request) {
		String errorMessage = ex.getMessage();

		return new ResponseEntity<Object>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = NullPointerException.class)
	public ResponseEntity<Object> handleNullExceptions(NullPointerException ex, WebRequest request) {

		String errorMessage = ex.getLocalizedMessage();
		if (errorMessage.isEmpty()) {
			errorMessage = ex.toString();
		}
		ErrorMessage em = new ErrorMessage(new Date(), errorMessage);
		return new ResponseEntity<Object>(em, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = UserServiceException.class)
	public ResponseEntity<Object> handleUserExceptions(UserServiceException ex, WebRequest request) {

		String errorMessage = ex.getLocalizedMessage();
		if (errorMessage.isEmpty()) {
			errorMessage = ex.toString();
		}
		ErrorMessage em = new ErrorMessage(new Date(), errorMessage);
		return new ResponseEntity<Object>(em, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
