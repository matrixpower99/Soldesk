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
	// �ڱ� �̸��� ����ϴ� ���
	public void showName() {
//		System.out.println(name); ���� ������ Human�̶� �̷��Դ� �Ұ���
		System.out.println(this.getName()); // this.�� ��������
	}
}
	