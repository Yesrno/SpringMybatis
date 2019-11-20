package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dao.UserDao;
import com.dao.courseDao;
import com.dao.select_courseDao;
import com.dao.studentDao;
import com.po.Course;
import com.po.MyUser;
import com.po.Student;

@Controller("userController")
public class UserController {
	
	@Autowired
	private select_courseDao select;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private studentDao studentdao;
	
	@Autowired
	private courseDao coursedao;
	
	public void test() {
		/*MyUser auser=userDao.selectUserByid(1);
		System.out.println(auser);
		MyUser pam=new MyUser();
		pam.setUname("fke");
		pam.setUsex("nv");
		userDao.addUser(pam);
		MyUser pams=new MyUser();
		pams.setId(1);
		pams.setUname("fss");
		pams.setUsex("nva");
		userDao.updateUser(pams);
		userDao.deleteUser(1);
		Map<String,String> map=select.selectUserByid(1);
		System.out.println(map);*/
		Student s=studentdao.selectStudentByid(1);
		System.out.println(s);
		Course c=coursedao.selectCourseByid(1);
		System.out.println(c);
	}
}
