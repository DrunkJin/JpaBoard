package com.study.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
	@ExceptionHandler(RuntimeException.class)
	public String handleRuntimeException(final RuntimeException e) {
		log.error("handleRuntimeException : {}", e.getMessage());
		return e.getMessage();
	}
}
