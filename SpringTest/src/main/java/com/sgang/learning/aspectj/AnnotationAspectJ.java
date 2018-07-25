package com.sgang.learning.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 使用注解的切面类.
 * <p>
 * 
 * 
 * @author zj
 *
 */
@Component
@Aspect
public class AnnotationAspectJ {

	private final static Logger logger = LoggerFactory.getLogger(AnnotationAspectJ.class);
	
	@Pointcut(value="execution(* com.sgang.learning.aspectj.service.AnnotationService.*(..)) && @annotation(moocMethod)" ,argNames="moocMethod")
	public void pointCut(MoocMethod moocMethod) {
		
		
	}
	
	//获取自定义注解MoocMethod的value值
	@Before(value="pointCut(moocMethod)")
	public void before(MoocMethod moocMethod)
	{
		
		logger.info("AnnotationAspectJ.before"+moocMethod.value());
		
	}
	
	
	
}
