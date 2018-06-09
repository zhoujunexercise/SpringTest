package com.sgang.learning.aop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 被AOP的业务实现类.
 * 
 * 
 * @author zj
 *
 */
@Component
public class BusinessService {

	private final static Logger logger = LoggerFactory.getLogger(BusinessService.class);
	
	public void doService()
	{
		logger.info("BusinessService doService method");
	}
}
