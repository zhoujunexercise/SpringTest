package com.sgang.learning.annotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * BeanInterface实现类二.
 * 
 * 
 * @author zj
 *
 */

@Component
public class BeanSecondImpl implements BeanInterface {

	private final static Logger logger = LoggerFactory.getLogger(BeanSecondImpl.class);
	public void printBeanName() {
		logger.info(this.getClass().getName());
	}

}
