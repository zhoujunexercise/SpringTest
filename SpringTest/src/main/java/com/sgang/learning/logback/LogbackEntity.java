package com.sgang.learning.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Logback实体类.
 * <p>
 * Logback依赖的jar包:logback-classic、logback-ext-spring、jcl-over-slf4j
 * 
 * 
 * @author zj
 *
 */

@Component
public class LogbackEntity {

	private final static Logger logger = LoggerFactory.getLogger(LogbackEntity.class);
	
	public void printMessage()
	{
		logger.info("LogbackEntity");
		
	}
}
