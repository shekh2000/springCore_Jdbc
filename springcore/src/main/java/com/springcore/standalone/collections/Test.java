package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args){
		
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/config.xml");
        Person person2 = context.getBean("person1",Person.class);
        System.out.println(person2);
	}
}
