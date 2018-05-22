package com.sgang.learning.junit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * Junit实体类.
 * <p>
 * Junit依赖的jar包：junit、spring-test
 * @author zj
 *
 */

@Component
public class JunitEntity {


	public void printName()
	{
		System.out.println("Hello Junit");
		
	}
	
}
