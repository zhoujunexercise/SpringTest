package com.sgang.learning.aop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sgang.learning.logback.LogbackEntity;

/**
 * «–√Ê¿‡.
 * 
 * 
 * @author zj
 *
 */
@Component
public class SgangAspect {

	private final static Logger logger = LoggerFactory.getLogger(SgangAspect.class);
	
	public void before()
	{
		
		logger.info("SgangAspect before method!");
		
	}
	
}
