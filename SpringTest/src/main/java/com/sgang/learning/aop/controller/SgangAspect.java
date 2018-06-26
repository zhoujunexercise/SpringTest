package com.sgang.learning.aop.controller;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 切面类.
 * 
 * 
 * @author zj
 *
 */
@Component
public class SgangAspect {

	private final static Logger logger = LoggerFactory.getLogger(SgangAspect.class);
	
	/**
	 * 方法执行前的通知
	 * 
	 * 
	 */
	public void before()
	{
		logger.info("SgangAspect before method!");
	}
	
	/**
	 * 方法返回后的通知
	 * 
	 */
	public void afterRetruning()
	{
		logger.info("SgangAspect afterRetruning method!");
	}
	
	
	/**
	 * 方法执行后的通知，类似finally
	 * 
	 * 
	 */
	public void after()
	{
		logger.info("SgangAspect after method!");
	}
	
	/**
	 * 方法抛出异常后的通知
	 * 
	 */
	public void afterThorwing()
	{
		logger.info("SgangAspect afterThorwing method!");
	}
	
	
	/**
	 * 环绕通知.无参数的
	 * 
	 */
	public Object aRound(ProceedingJoinPoint proceedingJoinPoint)
	{
		Object object=  null;
		try {
			logger.info("SgangAspect aRound  before method!");
			object =proceedingJoinPoint.proceed();
			logger.info("SgangAspect aRound  after  method!");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return  object;
	}
	
	/**
	 * 环绕通知.带参数的
	 * 
	 */
	public Object aRoundInit(ProceedingJoinPoint proceedingJoinPoint,String userNmae,int age)
	{
		Object object=  null;
		try {
			logger.info("SgangAspect aRoundInit  before method!");
			object =proceedingJoinPoint.proceed();
			logger.info("SgangAspect aRoundInit  after  method!");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return  object;
	}
	
	
	
}
