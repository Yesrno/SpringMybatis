package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.po.Student;

@Repository("studentdao")
@Mapper
public interface studentDao {

	public Student selectStudentByid(Integer id); 
	public List<Student> selectAllStudent(); 
	public int addStudent(Student student); 
	public int updateStudent(Student student); 
	public int deleteStudent(Integer id);
}
