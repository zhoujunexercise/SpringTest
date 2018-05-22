package com.sgang.learning.test.logback;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sgang.learning.logback.LogbackEntity;

/**
 * 
 * LogbackEntity对应的测试类.
 * 
 * 
 * @author zj
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:conf/applicationContext.xml" })
public class LogbackEntityTest {

	@Autowired
	LogbackEntity logbackEntity;

	@Test
	public void test() {
		
		logbackEntity.printMessage();
		
	}
	
	
}
