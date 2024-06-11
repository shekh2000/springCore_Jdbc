package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main (String [] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
//		Student student = con.getBean("student1",Student.class);
//		System.out.println(student.hashCode());
//		Student student1 = con.getBean("student1",Student.class);
//		System.out.println(student1.hashCode());
		Teacher t1 = con.getBean("t1",Teacher.class);
		System.out.println(t1.hashCode());
		Teacher t2 = con.getBean("t1",Teacher.class);
		System.out.println(t2.hashCode());
	}
}
