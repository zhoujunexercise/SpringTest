package com.sgang.learning.aop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 被AroundAspect切面的类.
 * 
 * 该类中包含一个正常执行的方法，另一个是抛出异常的方法.
 * 
 * @author zj
 *
 */
@Service
public class AroudBusinessService {

	private final static Logger logger = LoggerFactory.getLogger(AroudBusinessService.class);
	
	
	/**
	 * 正常业务逻辑处理方法.
	 * 
	 * @return  10000
	 */
	public int doInvoke()
	{
		logger.info("doInvoke");
		
		return 10000;
	}
	
	
	/**
	 * 
	 * 执行一个抛出异常的方法.
	 * @return
	 */
	public int doExceptionInvoke()
	{
		logger.info("doExceptionInvoke");
		return 1/0;
	}
	
}
