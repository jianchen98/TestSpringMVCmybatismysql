package com.chen.daoimpl;


import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.chen.IDAO.IStundentDao;
import com.chen.entity.Student;
import com.chen.mapper.StudentMapper;

@Component
public class StudentIMPL implements IStundentDao {
	@Autowired  
	private JdbcTemplate jdbcTemplate;  
	
	
	 @Autowired  
	 private StudentMapper rateMapper;  
	public void insert(Student stu) {
		System.out.println("================ִ�в������================");  
        jdbcTemplate.update("INSERT INTO Rate VALUES(" + stu.getName()
                + ", '" + stu.getSex()+ "', '" +stu.getAge()
                + "', '" +stu.getId() + "')");  
                

	}

	public Student getStudent(Integer id) {
		 System.out.println("================ִ�в��ҵ������ݲ���================");  
	     /* String SQL = "select * from Rate where id = ?";  
	       Rate Rate = jdbcTemplate.queryForObject(SQL,new Object[]{id},new RateMapper());  
	          return Rate;  */
	          
		 Student Rate = rateMapper.selectUserById(id);  
	     return Rate;   
	}

	public List<Student> listRates() {
		System.out.println("================ִ�в���ȫ������================");  
//        List rows = jdbcTemplate.queryForList("SELECT * FROM Rate");    
		List rows= null;
        Iterator it = rows.iterator();    
        while(it.hasNext()) {    
            Map RateMap = (Map) it.next();    
            System.out.print("ѧ��id:"+RateMap.get("id") + "; ");    
            System.out.print("ѧ��name:"+RateMap.get("name") + "; ");    
            System.out.print("ѧ��age:"+RateMap.get("age") + "; ");    
            System.out.println("ѧ��sex:"+RateMap.get("sex"));    
        }    
        return rows;  
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	public void update(Student Rate) {
		// TODO Auto-generated method stub

	}

}
