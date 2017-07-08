package com.chen.IDAO;

import java.util.List;



import com.chen.entity.Student;

public interface IStundentDao {

	 public void insert(Student stu);  
	    /** 
	     * 通过主键取得对象 
	     * @param id 
	     * @return Rate 
	     */  
	    public Student getStudent(Integer id);  
	    /** 
	     * 取得表中所有的学生 
	     * @param id 
	     * @return Rate 
	     */  
	    public List<Student> listRates();  
	    /** 
	     * 通过主键删除对象 
	     * @param id 
	     */  
	    public void delete(Integer id);  
	    /** 
	     * 通过主键更改对象 
	     * @param id 
	     */  
	    public void update(Student Rate);  
	  
}
