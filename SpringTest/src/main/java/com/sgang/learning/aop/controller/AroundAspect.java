package com.sgang.learning.aop.controller;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 环绕切面类.
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
	 * 若环绕的方法执行正常，则放回方法执行结果;若方法执行异常，则重复尝试maxRetries次后，抛出异常.
	 * 
	 * 
	 * @param proceedingJoinPoint
	 *            spring aop 连接点类
	 * @return 程序返回值
	 * @throws Throwable
	 *             异常
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
