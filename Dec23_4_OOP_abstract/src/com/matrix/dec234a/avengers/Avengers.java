package com.matrix.dec234a.avengers;

import com.matrix.dec234a.human.Smoker;

// 개발자
// 서버/네트워크 -> 나중에 여기까지 경험

// abstract 클래스 : 객체를 만들 수 없음.
// abstract 메소드 : 미완성 메소드(내용부분이 없음)
//		하위클랙스에서 완성을 시켜줘야함 -> overriding해야 함.
// 		abstract 메소드가 하나라도 있다면 -> 그 클래스가 abstract 클래스여야
// 어떤 클래스가 추상 class일 수 있음
// 아이언맨,헐크 같은 애들이 만든 조직 -> 추상적인 개념 -> 실존하지 않으며 형태가 없음

// 인터페이스를 상속받을 때는 implements 사용
public abstract class Avengers implements Smoker {
	private String name;
	private int age;
	
	public Avengers() {
		// TODO Auto-generated constructor stub
	}

	public Avengers(String name, int age) {
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
	
	public void print() {
		System.out.println(name);
		System.out.println(age);
	}
	
	// 어벤져스들의 공통적인 기능이니 만들어 놓기는 했는데 -> 다형성에서 사용
	// 어벤져스라는게 그저 추상적인 개념일 뿐이니
	public abstract void attack(); // 추상메소드
	public abstract void smoke(); 
}
