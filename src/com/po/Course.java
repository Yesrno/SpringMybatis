package com.po;

import java.util.List;

public class Course {

	private int id;
	private String title;
	private double credits;
	private List<Student> student;
	private List<Select_course> selects;
	
	public void setId(int pid) {id=pid;}
	public int getId() {return id;}
	public void setTitle(String titles) {title=titles;}
	public String getTitle() {return title;}
	public void setCredit(double credit) {credits=credit;}
	public double getCredits() {return credits;}
	
	public String toString() {
		String str="";
		String stt="";
		for(Student cou:student)
			str=str+cou.getId()+cou.getName()+cou.getGrade();
		for(Select_course sel:selects)
			stt=stt+sel.getId()+sel.getTimes();
		return id+title+credits+str+stt;
	}
}
