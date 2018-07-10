package com.sgang.learning.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * ʹ��ע���������.
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
	
	@Pointcut("execution(* com.sgang.learning.aspectj.service.AnnotationService.*(..)) && @Annotation(moocMethod)")
	public void pointCut(MoocMethod moocMethod) {
		
		
	}
	
	@Before(value="pointCut(moocMethod)")
	public void before()
	{
		logger.info("AnnotationAspectJ.before");
		
	}
	
	
	
}
