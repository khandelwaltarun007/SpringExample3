package com.spring.example3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring3Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Organisation organisation = (Organisation) context.getBean("organisationBean");
		System.out.println(organisation.displayInfo());
	}
}
