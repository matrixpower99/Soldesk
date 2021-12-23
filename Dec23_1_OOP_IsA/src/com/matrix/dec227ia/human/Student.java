package com.matrix.dec227ia.human;

public class Student extends Human {
	private String school;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}



	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println(school);
	}
	
}
