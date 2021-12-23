package com.matrix.dec226sp.myself;

// static멤버변수
//		그 객체들의 공통속성

// singleton pattern : 세상에 하나뿐인 객체를 만들때(only one)

public class Myself {
	private String name;
	private int age;
	private String adrs;
	// 2. 객체를 내부에서 만들기, 수정불가능하게
	private static final Myself MY = new Myself("이지상", 51, "남양주");
	
	// 1. 객체를 외부에서 만들지 못하게(생성자들을 private로)
	private Myself() {
		// TODO Auto-generated constructor stub
	}

	private Myself(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.adrs = address;
	}
	
	// 3. 2번의 그 객체를 외부에서 불러다 사용할 수 있게
	public static Myself getMy() {
		return MY;
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

	public String getAdrs() {
		return adrs;
	}

	public void setAdrs(String adrs) {
		this.adrs = adrs;
	}

	public void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(adrs);
		
	}
}
