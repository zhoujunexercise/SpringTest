package com.sgang.learning.annotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sgang.learning.logback.LogbackEntity;

/**
 * BeanInterface ʵ����һ.
 * 
 * 
 * @author zj
 *
 */
@Component
public class BeanFirstImpl implements BeanInterface {

	private final static Logger logger = LoggerFactory.getLogger(BeanFirstImpl.class);
	
	public void printBeanName() {
		
		logger.info(this.getClass().getName());
	}

}
