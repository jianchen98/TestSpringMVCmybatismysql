package com.chen.IDAO;

import java.util.List;



import com.chen.entity.Student;

public interface IStundentDao {

	 public void insert(Student stu);  
	    /** 
	     * ͨ������ȡ�ö��� 
	     * @param id 
	     * @return Rate 
	     */  
	    public Student getStudent(Integer id);  
	    /** 
	     * ȡ�ñ������е�ѧ�� 
	     * @param id 
	     * @return Rate 
	     */  
	    public List<Student> listRates();  
	    /** 
	     * ͨ������ɾ������ 
	     * @param id 
	     */  
	    public void delete(Integer id);  
	    /** 
	     * ͨ���������Ķ��� 
	     * @param id 
	     */  
	    public void update(Student Rate);  
	  
}
