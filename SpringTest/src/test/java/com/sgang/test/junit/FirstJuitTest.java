package com.sgang.test.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sgang.junit.first.JunitEntity;

/**
 * ��һ��Juit������.
 * <p>
 * Junit������jar����junit��spring-test
 * 
 * 
 * 
 * @author zj
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:conf/applicationContext.xml" })
public class FirstJuitTest {

	@Autowired
	JunitEntity junitEntity;

	@Test
	public void test() {
		
		junitEntity.printName();
		
	}
}
