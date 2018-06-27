package com.sgang.learning.test.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sgang.learning.aop.controller.AroundAspect;
import com.sgang.learning.aop.service.AroudBusinessService;

/**
 * �������������.
 * 
 * 
 * 
 * @author zj
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:conf/applicationContextForaRoundAop.xml" })
public class AroundAspectTest {

	private final static Logger logger = LoggerFactory.getLogger(AroundAspectTest.class);
	
	@Autowired
	AroudBusinessService aroudBusinessService;
	
	/**
	 * ���Ի���֪ͨ.
	 * <p>
	 * ��������ִ��һ�ξͷ���.
	 * �쳣����ִ��5�κ��׳��쳣.
	 * 
	 */
	@Test
	public void test() {
		
		int result =aroudBusinessService.doInvoke();
		logger.info(""+result);
		logger.info("------------------------------");
		aroudBusinessService.doExceptionInvoke();

	}
	
}
