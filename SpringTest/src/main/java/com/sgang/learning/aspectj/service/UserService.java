package com.sgang.learning.aspectj.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 用户Service.对应SgangAspectJ.java
 * 
 * 
 * 
 * @author zj
 *
 */

@Component
public class UserService {

	private final static Logger logger = LoggerFactory.getLogger(UserService.class);
	
	
	public void doService()
	{
		logger.info("UserService.doService");
	
	}
	
	public void doService(String userName,int age)
	{
		logger.info("UserService.doService(String userName,int age)" +userName+":"+age);
	
	}
	
	public void doService(String userName)
	{
		logger.info("UserService.doService(String userName)" +userName);
	}
	
	

	public String doMethod(String userName)
	{
		logger.info("UserService.doMethod(String userName) " + userName);
		return userName;

	}
	
}
