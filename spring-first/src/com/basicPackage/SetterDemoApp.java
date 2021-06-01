package com.basicPackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// load the bean
		CricketCoach theCoach = context.getBean("MyCricketCoach",CricketCoach.class);
		
		// call methods on bean 
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getTeamDetails());
		
		// close the context
		context.close();
	}

}
