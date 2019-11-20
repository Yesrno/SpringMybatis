package com.dao;

import java.util.List;
import com.po.MyUser;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;


@Repository("userDao")
@Mapper

public interface UserDao {

	public MyUser selectUserByid(Integer uid); 
	public List<MyUser> selectAllUser(); 
	public int addUser(MyUser user); 
	public int updateUser(MyUser user); 
	public int deleteUser(Integer uid);
}
