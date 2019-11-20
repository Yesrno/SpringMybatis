package com.po;

import java.util.List;

public class Student {
	
	private int id;
	private String name;
	private double grade;
	private List<Course> course;
	private List<Select_course> select;

	public void setId(int pid) {id=pid;}
	public int getId() {return id;}
	public void setName(String titles) {name=titles;}
	public String getName() {return name;}
	public void setGrade(double credit) {grade=credit;}
	public double getGrade() {return grade;}
	
	public String toString() {
		String str="";
		String stt="";
		if(course.isEmpty())
			str=null;
		else 
			for(Course cou:course)
				str=str+cou.getId()+cou.getTitle()+cou.getCredits();
		if(select.isEmpty())
			stt=null;
		else
			for(Select_course sel:select)
				stt=stt+sel.getId()+sel.getTimes();
		return "["+id+name+grade+"["+str+"]["+stt+"]]";
	}
}
