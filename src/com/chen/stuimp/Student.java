package com.chen.stuimp;

import com.chen.istu.Istu;

public class Student implements Istu {
	private String name;
	private int  age;
	private String sex;
	public void printinfo() {
		        System.out.println("姓名:" + name);  
		        System.out.println("年龄:" + age);  
		        System.out.println("性别:" + sex);  

	}
	
	public Student(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	

}
