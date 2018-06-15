package com.sgang.learning.aop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * ��AOP��ҵ��ʵ����.
 * 
 * 
 * @author zj
 *
 */
@Component
public class ExceptionBusinessService {

	private final static Logger logger = LoggerFactory.getLogger(ExceptionBusinessService.class);
	
	public void doService()
	{
		logger.info("BusinessService doService method");
		throw new RuntimeException();
	}
}
