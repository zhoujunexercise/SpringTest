package com.sgang.junit.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * Junitʵ����.
 * 
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
