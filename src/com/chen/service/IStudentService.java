package com.chen.service;

import java.util.List;

import com.chen.entity.Student;

public interface IStudentService {
	
	
	public void add();
	
	public Student find(Student stu);
	
	public List findAll();
}
