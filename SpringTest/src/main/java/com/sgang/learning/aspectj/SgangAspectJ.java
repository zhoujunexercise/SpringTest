package com.sgang.learning.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/***
 * ʹ��AspectJʵ��AOP.
 * <p>
 * ʹ��ע��ķ�ʽ��ʵ��AspectJ��ʹ��@Aspectע��������@Component�������޷�ʹ���Զ�ע��.
 * �ڴ����п��Զ���Advice��֪ͨ����Pointcut������㣩.
 * 
 * ��ӦServiceΪUserService.java
 * @author zj_home
 *
 */

@Component
@Aspect
public class SgangAspectJ {

	private final static Logger logger = LoggerFactory.getLogger(SgangAspectJ.class);
	
	//����һ������������㣬�����������ʹ������������ʽ,�����Ϊcom.sgang.learning.aspectj.service.UserService�µ����з���
	@Pointcut("execution(* com.sgang.learning.aspectj.service.UserService.*(..))")
	public void myPointCut()
	{}
	
	//���幫��������㣬�����Ϊ��������ΪString���͵����з���
	@Pointcut("args(String)")
	public void argsPointCut()
	{}
	
	@Before("myPointCut()")
	public void myBefore()
	{
		logger.info("myBefore");
	}
	
	//AspectJʹ��&&��||����������е���ʽ�����ҿ��Ի�÷����ķ���ֵ
	@AfterReturning(pointcut="myPointCut() && argsPointCut()",returning="returnValue")
	public void myAfterReturning(Object returnValue)
	{
		logger.info("myAfterReturning"+returnValue);
		
	}
	
	//������finally
	@After("myPointCut()")
	public void myAfter()
	{
		logger.info("myAfter");
		
	}
	
	@AfterThrowing(pointcut="myPointCut()",throwing="ex")
	public void myAfterThrowing(RuntimeException ex)
	{
		
		logger.info("myAfterThrowing" +ex.getMessage());
	}
	
	
	//����֪ͨ,�������com.sgang.learning.aspectj.service.UserService��doService������
	@Around("execution(* com.sgang.learning.aspectj.service.UserService.doService())")
	public Object myAround(ProceedingJoinPoint   pjp) throws Throwable
	{
		logger.info("myAround begin");
		Object result =pjp.proceed();
		logger.info("myAround end");
		return result;
	}
	
	
	//����֪ͨ,�������com.sgang.learning.aspectj.service.UserService��doService(String userName,int age)������
	@Around(value="execution(* com.sgang.learning.aspectj.service.UserService.doService(java.lang.String,int))&& args(userName,age)",argNames="userName,age")
	public Object myAroundArgs(ProceedingJoinPoint  pjp,String userName,int age) throws Throwable
	{
		logger.info("myAround begin");
		Object result =pjp.proceed();
		logger.info("myAround end" +userName+age);
		return result;
	}
	
	
	//����ִ��ǰ������㣬������� com.sgang.learning.aspectj.service.UserService.doService(String userName)�����ϣ�����÷����Ĳ���
	@Before(value="execution(* com.sgang.learning.aspectj.service.UserService.doService(java.lang.String))&& args(userName)",argNames="userName")
	public void beforeArgs(String name)
	{
		
		logger.info("beforeArgs begin" +name);
		
		
	}
	
	
	
	
}
