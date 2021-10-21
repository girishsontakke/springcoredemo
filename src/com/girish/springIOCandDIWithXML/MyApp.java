package com.girish.springIOCandDIWithXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// create object
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("myCoach", Coach.class);

		// use the object
		coach.getDailyWorkout();
		System.out.println(coach.getfortune());
		// close the context
		context.close();
	}

}
