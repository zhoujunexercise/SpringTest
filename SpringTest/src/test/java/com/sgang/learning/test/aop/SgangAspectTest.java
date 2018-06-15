package com.sgang.learning.test.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sgang.learning.aop.service.BusinessService;
import com.sgang.learning.aop.service.ExceptionBusinessService;

/**
 * AOP测试类.
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
	 * 测试连接点为before，afterRetruning，after.
	 * <p>
	 * before是在方法执行前.
	 * afterRetruning是在方法执行完正常返回后执行，方法抛异常不执行.
	 * after类似于finally
	 */
	@Test
	public void test() {
		businessService.doService();

	}
	
	
	/**
	 * 测试连接点：afterThorwing，afterRetruning，after
	 * <p>
	 * afterThorwing是在程序抛出异常后
	 * afterRetruning是在方法正常返回之后，抛出异常的时候不执行
	 * after类似于finally
	 */
	@Test
	public void testException()
	{
		exceptionBusinessService.doService();
		
	}
	
	
	
}
