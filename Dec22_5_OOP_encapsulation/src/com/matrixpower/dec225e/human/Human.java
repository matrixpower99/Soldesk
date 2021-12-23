package com.matrixpower.dec225e.human;

// name, age를 쓰려고 만든것 -> public으로 여는게 당연...

// 캡술화(encapsulation) : 정보를 안전하게 넣기 위해. 객체지향을 하면서 누릴 수 있는 서비스 중 하나
//		멤버 변수를 public으로 하면 -> 외부에서 직접 접근 가능 -> 잘못된 데이터가 그냥 들어감
//		1. 멤버변수를 private로 -> 외부 접근을 막는다
//		2. 멤버변수에 접근할 수 있는 통로를 만듬
//		3. 그 통로에 안전장치

// 		가루는 쓰다, 가루 -> 먹기 힘듬 -> 캡슐에 주면 먹기 편하다
//		가루로 주면 자격없는 사람들이 수정을 가함 -> 캡슐에 주면 -> 그 용량 그대로 먹게 됨

public class Human {
	private String name; // 이 바닥의 약속. 멤버 변수는 잠그고 시작한다.
	private int age; // 기술면접 포인트. 잠그지 않으면 시말서 쓴다
	
	public void setAge(int a) {
		if (a < 0) {
			a *= -1;
		}
		age = a;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(age);
	}
}
