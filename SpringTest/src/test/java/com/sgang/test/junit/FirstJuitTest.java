package com.sgang.test.junit;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
@ContextConfiguration(locations={"classpath:applicationContext.xml"}) 
public class FirstJuitTest {

	
	
	
}
