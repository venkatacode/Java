package com.infy.utility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.infy.exception.DreamMakersException;
@Component
@Aspect
public class LoggingAspect {

	
	private static final Log LOGGER = LogFactory.getLog(LoggingAspect.class);
	

	@AfterThrowing(pointcut = "execution(* com.infy.repository.*Impl.*(..))", throwing = "exception")
	public void logRepositoryException(Exception exception) throws DreamMakersException {
		LOGGER.error(exception.getMessage(), exception);
	}
	@AfterThrowing(pointcut = "execution(* com.infy.service.*Impl.*(..))", throwing = "exception")
	public void logServiceException(Exception exception) throws DreamMakersException {
		LOGGER.error(exception.getMessage(), exception);
	}

}