package com.sgang.learning.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Logbackʵ����.
 * <p>
 * Logback������jar��:logback-classic��logback-ext-spring��jcl-over-slf4j
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
