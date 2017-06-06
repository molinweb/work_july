package com.molinweb.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {

	
	@Test
	public void testUser(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applitionContext.xml");
		UserSpring1 user=(UserSpring1)context.getBean("userSpring1");
		System.out.println(user);
		UserSpring1 user2=(UserSpring1)context.getBean("userSpring1");
		System.out.println(user2);
		user.add();
	}
	
	
	
	
	
	
}
