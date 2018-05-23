package com.sgang.learning.annotation;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 集合注入类.
 * <p>
 * Spring依赖注入，可以将同一类型的类注入集合中.
 * 该类将接口BeanInterface的两个实现类自动注入到List中.
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
