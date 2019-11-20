package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.po.Course;

@Repository("coursedao")
@Mapper
public interface courseDao {

	public Course selectCourseByid(Integer id); 
	public List<Course> selectAllCourse(); 
	public int addCourse(Course course); 
	public int updateCourse(Course course); 
	public int deleteCourse(Integer id);
}
