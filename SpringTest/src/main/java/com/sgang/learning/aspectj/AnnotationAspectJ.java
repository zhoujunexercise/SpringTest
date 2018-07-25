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
	
	@Pointcut(value="execution(* com.sgang.learning.aspectj.service.AnnotationService.*(..)) && @annotation(moocMethod)" ,argNames="moocMethod")
	public void pointCut(MoocMethod moocMethod) {
		
		
	}
	
	//��ȡ�Զ���ע��MoocMethod��valueֵ
	@Before(value="pointCut(moocMethod)")
	public void before(MoocMethod moocMethod)
	{
		
		logger.info("AnnotationAspectJ.before"+moocMethod.value());
		
	}
	
	
	
}
