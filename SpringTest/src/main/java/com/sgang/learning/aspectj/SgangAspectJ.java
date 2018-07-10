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
 * 使用AspectJ实现AOP.
 * <p>
 * 使用注解的方式，实现AspectJ，使用@Aspect注解必须配合@Component，否则无法使用自动注入.
 * 在此类中可以定义Advice（通知）和Pointcut（切入点）.
 * 
 * 对应Service为UserService.java
 * @author zj_home
 *
 */

@Component
@Aspect
public class SgangAspectJ {

	private final static Logger logger = LoggerFactory.getLogger(SgangAspectJ.class);
	
	//定义一个公共的切入点，多个方法都可使用这个切入点表达式,切入点为com.sgang.learning.aspectj.service.UserService下的所有方法
	@Pointcut("execution(* com.sgang.learning.aspectj.service.UserService.*(..))")
	public void myPointCut()
	{}
	
	//定义公共的切入点，切入点为方法参数为String类型的所有方法
	@Pointcut("args(String)")
	public void argsPointCut()
	{}
	
	@Before("myPointCut()")
	public void myBefore()
	{
		logger.info("myBefore");
	}
	
	//AspectJ使用&&，||，！来组合切点表达式，并且可以获得方法的返回值
	@AfterReturning(pointcut="myPointCut() && argsPointCut()",returning="returnValue")
	public void myAfterReturning(Object returnValue)
	{
		logger.info("myAfterReturning"+returnValue);
		
	}
	
	//类似于finally
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
	
	
	//环绕通知,切入点在com.sgang.learning.aspectj.service.UserService的doService方法上
	@Around("execution(* com.sgang.learning.aspectj.service.UserService.doService())")
	public Object myAround(ProceedingJoinPoint   pjp) throws Throwable
	{
		logger.info("myAround begin");
		Object result =pjp.proceed();
		logger.info("myAround end");
		return result;
	}
	
	
	//环绕通知,切入点在com.sgang.learning.aspectj.service.UserService的doService(String userName,int age)方法上
	@Around(value="execution(* com.sgang.learning.aspectj.service.UserService.doService(java.lang.String,int))&& args(userName,age)",argNames="userName,age")
	public Object myAroundArgs(ProceedingJoinPoint  pjp,String userName,int age) throws Throwable
	{
		logger.info("myAround begin");
		Object result =pjp.proceed();
		logger.info("myAround end" +userName+age);
		return result;
	}
	
	
	//方法执行前的切入点，切入点在 com.sgang.learning.aspectj.service.UserService.doService(String userName)方法上，并获得方法的参数
	@Before(value="execution(* com.sgang.learning.aspectj.service.UserService.doService(java.lang.String))&& args(userName)",argNames="userName")
	public void beforeArgs(String name)
	{
		
		logger.info("beforeArgs begin" +name);
		
		
	}
	
	
	
	
}
