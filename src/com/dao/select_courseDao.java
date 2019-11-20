package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.po.Select_course;


@Repository("select_coursedao")
@Mapper
public interface select_courseDao {

	public Map<String,String> selectUserByid(Integer id); 
	public List<Map<String,String>> selectAllUser(); 
	public int addUser(Map<String,String> map); 
	public int updateUser(Select_course select); 
	public int deleteUser(Integer id);
}
