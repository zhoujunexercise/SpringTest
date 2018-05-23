package com.sgang.learning.annotation;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ����ע����.
 * <p>
 * Spring����ע�룬���Խ�ͬһ���͵���ע�뼯����.
 * ���ཫ�ӿ�BeanInterface������ʵ�����Զ�ע�뵽List��.
 * 
 * @author zj
 *
 */
@Component
public class CollectionEntity {

	@Autowired
	private List<BeanInterface> list;
	
	public void printList()
	{
		for (BeanInterface beanInterface : list) {
			beanInterface.printBeanName();
		}
		
	}
	
}
