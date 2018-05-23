package com.sgang.learning.test.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sgang.learning.annotation.CollectionEntity;

/**
 * CollectionEntity≤‚ ‘¿‡.
 * <p>
 * 
 * 
 * @author zj
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:conf/applicationContext.xml" })
public class CollectionEntityTest {

	@Autowired
	CollectionEntity collectionEntity;
	
	@Test
	public void test() {
		
		collectionEntity.printList();
		
	}
}
