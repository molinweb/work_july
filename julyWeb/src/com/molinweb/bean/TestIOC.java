package com.molinweb.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {

	
	@Test
	public void testUser(){
		//1.º”‘ÿspring≈‰÷√Œƒº˛
		ApplicationContext context=new ClassPathXmlApplicationContext("applitionContext.xml");
		Bean2 bean2=(Bean2)context.getBean("Bean2");
		System.out.print(bean2);
	//	bean2.add();
	}
	
	
	
	
	
	
}
