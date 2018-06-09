package com.sgang.learning.test.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sgang.learning.aop.service.BusinessService;

/**
 * AOP≤‚ ‘¿‡.
 * <p>
 * 
 * 
 * @author zj
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:conf/applicationContextForAop.xml" })
public class SgangAspectTest {

	@Autowired
	BusinessService businessService;

	@Test
	public void test() {

		businessService.doService();

	}
}
