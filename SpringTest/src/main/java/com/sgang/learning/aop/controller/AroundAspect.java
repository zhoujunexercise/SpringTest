package com.sgang.learning.aop.controller;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * ����������.
 * <p>
 * 
 * 
 * 
 * @author zj
 *
 */
@Component
public class AroundAspect {

	private final static Logger logger = LoggerFactory.getLogger(AroundAspect.class);
	@Value("${maxRetries:5}")
	private int maxRetries;

	/**
	 * �����Ƶķ���ִ����������Żط���ִ�н��;������ִ���쳣�����ظ�����maxRetries�κ��׳��쳣.
	 * 
	 * 
	 * @param proceedingJoinPoint
	 *            spring aop ���ӵ���
	 * @return ���򷵻�ֵ
	 * @throws Throwable
	 *             �쳣
	 */
	public Object doRoundConcurrentOperation(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		int index = 0;
		Throwable ex;
		do {
			index++;
			logger.info("Try Times :"+index);
			try {
				return proceedingJoinPoint.proceed();
			} catch (Throwable e) {
				ex = e;
			}
		} while (index <= maxRetries);
		throw ex;
	}

}
