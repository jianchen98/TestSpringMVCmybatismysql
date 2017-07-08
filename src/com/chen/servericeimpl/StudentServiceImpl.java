package com.chen.servericeimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chen.IDAO.IStundentDao;
import com.chen.entity.Student;
import com.chen.service.IStudentService;

@Service
public class StudentServiceImpl   implements IStudentService{
	
	@Autowired
	private IStundentDao studao;

	public void add() {
		// TODO Auto-generated method stub
		
	}

	public List findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Student find(Student stu) {
		Student stureturn = studao.getStudent(stu.getId());
		return stureturn;
	}
	
}
