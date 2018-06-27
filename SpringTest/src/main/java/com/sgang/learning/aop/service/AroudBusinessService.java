package com.sgang.learning.aop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * ��AroundAspect�������.
 * 
 * �����а���һ������ִ�еķ�������һ�����׳��쳣�ķ���.
 * 
 * @author zj
 *
 */
@Service
public class AroudBusinessService {

	private final static Logger logger = LoggerFactory.getLogger(AroudBusinessService.class);
	
	
	/**
	 * ����ҵ���߼�������.
	 * 
	 * @return  10000
	 */
	public int doInvoke()
	{
		logger.info("doInvoke");
		
		return 10000;
	}
	
	
	/**
	 * 
	 * ִ��һ���׳��쳣�ķ���.
	 * @return
	 */
	public int doExceptionInvoke()
	{
		logger.info("doExceptionInvoke");
		return 1/0;
	}
	
}
