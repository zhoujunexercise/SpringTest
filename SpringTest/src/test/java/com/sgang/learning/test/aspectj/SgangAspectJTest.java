package com.sgang.learning.test.aspectj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sgang.learning.aspectj.service.UserService;

/**
 * SgangAspectJ≤‚ ‘¿‡.
 * 
 * 
 * @author zj
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:conf/applicationContextForAspectj.xml" })
public class SgangAspectJTest {

	private final static Logger logger = LoggerFactory.getLogger(SgangAspectJTest.class);
	
	@Autowired
	UserService  userService;
	
	@Test
	public void testdoService()
	{
		String userName="xiao fang";
		userService.doService(userName);
		logger.info("end1");
//		int age =10;
//		userService.doService(userName,age);
//		logger.info("end2");
//		
//		userService.doMethod(userName);
//
//		userService.doService();
		
	}
	
}
