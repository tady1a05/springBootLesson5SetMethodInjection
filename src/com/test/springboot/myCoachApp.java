package com.test.springboot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myCoachApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); /*get the context from applicationContext.xml*/
		
		swimCoach coach = context.getBean("myCoach", swimCoach.class);/*get spring bean object*/
		/*
		 * due to applicationContext.xml
		 * 
		 * equal to 
		 * Coach coach = new swimCoach(new FortunateServices());
		 * 
		 * */
		System.out.println(coach.doWorkout());
		
		System.out.println(coach.doFortunate());
		
		System.out.println(coach.getName());
		
		System.out.println(coach.getEmail());

	}

}
