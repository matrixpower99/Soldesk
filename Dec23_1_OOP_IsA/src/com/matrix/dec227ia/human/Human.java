package com.matrix.dec227ia.human;

//                EJB(Enterprise Java Bean) : Winter  
// Java -> JSP -> Spring(EJB�� ����� ǥ��)

// HumanŬ���� -> Human��ü�� ����� ǥ������
// Java : �Ϻ��� OOL

// DTO(Data Temp/Transfer Object) Ŭ����
// javaBean -> Ŭ����
// Java : Ŀ���̸� 
public class Human {
	private String name; // ���� ������ ����(Human) ����� ������
	private int age;

	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void showInfo() {
		System.out.println(name);
		System.out.println(age);
	}
}
