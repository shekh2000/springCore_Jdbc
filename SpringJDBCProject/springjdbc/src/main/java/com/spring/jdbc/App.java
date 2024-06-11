package com.spring.jdbc;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Learning Spring jdbc......." );
        // spring jdbc => JdbcTemplate
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
//        Student student = new Student();
//        student.setId(4);
//        student.setName("Prakhar");
//        student.setCity("uttrakhand");
//        int r = studentDao.delete(4);
//        System.out.println(r);
//        student = studentDao.getStudent(3);
//        System.out.println(student.toString());
        List<Student> students = studentDao.getAllStudent();
        
        for(Student s:students) {
        	System.out.println(s);
        }
        
    }
}
