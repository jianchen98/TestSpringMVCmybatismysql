package com.chen;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.chen.entity.Student;
import com.chen.stuimp.Monitor;

public class TestClient {
	public static void main(String[] args) {
		BeanFactory beanfactory = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		HelloWorld hello = (HelloWorld) beanfactory.getBean("hello");
		System.out.println(hello.getInfo());
		
	
//     BeanFactory beanfactory = new ClassPathXmlApplicationContext("applicationContext.xml");
	/* StudentDAOIMPL studentDaoImpl=(StudentDAOIMPL)beanfactory.getBean("studentDAOIMPL");  
     Student student1=new Student(1,"���","12","Ů");  
     studentDaoImpl.insert(student1);  
//     studentDaoImpl.insert(new Student(2,"����",16,"��"));  
//     studentDaoImpl.insert(new Student(3,"С��",22,"��"));  
//     studentDaoImpl.insert(new Student(4,"С��",15,"��"));  
//     studentDaoImpl.insert(new Student(5,"����",23,"��"));    
     studentDaoImpl.listStudents();  
    System.out.println(studentDaoImpl.getStudent(2));   
    studentDaoImpl.update(new Student(2,"����",15,"��"));  
    System.out.println(studentDaoImpl.getStudent(2));   
    studentDaoImpl.delete(2);  
     studentDaoImpl.listStudents();  */
	}
}
