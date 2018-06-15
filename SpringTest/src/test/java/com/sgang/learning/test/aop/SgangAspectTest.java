package com.sgang.learning.test.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sgang.learning.aop.service.BusinessService;
import com.sgang.learning.aop.service.ExceptionBusinessService;

/**
 * AOP������.
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
	@Autowired
	ExceptionBusinessService exceptionBusinessService;

	/**
	 * �������ӵ�Ϊbefore��afterRetruning��after.
	 * <p>
	 * before���ڷ���ִ��ǰ.
	 * afterRetruning���ڷ���ִ�����������غ�ִ�У��������쳣��ִ��.
	 * after������finally
	 */
	@Test
	public void test() {
		businessService.doService();

	}
	
	
	/**
	 * �������ӵ㣺afterThorwing��afterRetruning��after
	 * <p>
	 * afterThorwing���ڳ����׳��쳣��
	 * afterRetruning���ڷ�����������֮���׳��쳣��ʱ��ִ��
	 * after������finally
	 */
	@Test
	public void testException()
	{
		exceptionBusinessService.doService();
		
	}
	
	
	
}
