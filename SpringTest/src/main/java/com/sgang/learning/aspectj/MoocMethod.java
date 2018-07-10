package com.sgang.learning.aspectj;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解.
 * <p>
 * 使用该注解的Service为AnnotationService.java
 * 
 * 
 * @author zj
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MoocMethod {

	//注解的属性值，写在括号里的值
	String value();
	
}
