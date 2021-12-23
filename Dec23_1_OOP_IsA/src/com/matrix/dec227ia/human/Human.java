package com.matrix.dec227ia.human;

//                EJB(Enterprise Java Bean) : Winter  
// Java -> JSP -> Spring(EJB에 빗대어 표현)

// Human클래스 -> Human객체로 사람을 표현가능
// Java : 완벽한 OOL

// DTO(Data Temp/Transfer Object) 클래스
// javaBean -> 클래스
// Java : 커피이름 
public class Human {
	private String name; // 판정 기준이 여기(Human) 상속이 될지라도
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
