package com.matrix.dec227ia.human;

public class Soldier extends Human {
	private String grade;
	
	public Soldier() {
		// TODO Auto-generated constructor stub
	}

	public Soldier(String name, int age, String rank) {
		super(name, age);
		this.grade = rank;
	}

	public String getRank() {
		return grade;
	}

	public void setRank(String rank) {
		this.grade = rank;
	}
	
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println(grade);
	}
	// 자기 이름만 출력하는 기능
	public void showName() {
//		System.out.println(name); 판정 기준이 Human이라서 이렇게는 불가능
		System.out.println(this.getName()); // this.은 생략가능
	}
}
	