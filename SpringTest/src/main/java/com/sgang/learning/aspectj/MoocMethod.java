package com.sgang.learning.aspectj;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * �Զ���ע��.
 * <p>
 * ʹ�ø�ע���ServiceΪAnnotationService.java
 * 
 * 
 * @author zj
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MoocMethod {

	//ע�������ֵ��д���������ֵ
	String value();
	
}
