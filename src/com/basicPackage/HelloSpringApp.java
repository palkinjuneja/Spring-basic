package com.basicPackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve a bean from spring container
		
		Coach theCoach = context.getBean("MyCoach",Coach.class);
		
		// call method on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		
		// close context
		context.close();

	}

}
