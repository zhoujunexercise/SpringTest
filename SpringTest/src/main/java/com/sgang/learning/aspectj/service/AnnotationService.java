package com.sgang.learning.aspectj.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.sgang.learning.aspectj.MoocMethod;

/**
 * 使用自定义注解MoocMethod的服务类.
 * 
 * 
 * @author zj
 *
 */

@Service
public class AnnotationService {

	private final static Logger logger = LoggerFactory.getLogger(AnnotationService.class);
	
	@MoocMethod("MoocMethod save")
	public String save(String name)
	{
		logger.info("AnnotationService.save:" +name);
		return name;
	}
}
