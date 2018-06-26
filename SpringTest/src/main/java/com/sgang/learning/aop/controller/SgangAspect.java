package com.sgang.learning.aop.controller;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * ������.
 * 
 * 
 * @author zj
 *
 */
@Component
public class SgangAspect {

	private final static Logger logger = LoggerFactory.getLogger(SgangAspect.class);
	
	/**
	 * ����ִ��ǰ��֪ͨ
	 * 
	 * 
	 */
	public void before()
	{
		logger.info("SgangAspect before method!");
	}
	
	/**
	 * �������غ��֪ͨ
	 * 
	 */
	public void afterRetruning()
	{
		logger.info("SgangAspect afterRetruning method!");
	}
	
	
	/**
	 * ����ִ�к��֪ͨ������finally
	 * 
	 * 
	 */
	public void after()
	{
		logger.info("SgangAspect after method!");
	}
	
	/**
	 * �����׳��쳣���֪ͨ
	 * 
	 */
	public void afterThorwing()
	{
		logger.info("SgangAspect afterThorwing method!");
	}
	
	
	/**
	 * ����֪ͨ.�޲�����
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
	 * ����֪ͨ.��������
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
