package com.matrixpower.dec222pl.animal;

// 지적재산권 -> .java 넘겨주는 게 아님
// 소스를 주는게 아니라 jar파일을 넘기고 공유한다

/**
 * ㅋㅋㅋㅋㅋㅋ
 * @author matrixpower
 *
 */
public class Cat {
	String name;
	int age;

	
	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	/**
	 * 이름과 나이 출력
	 */
	public void print() {
		System.out.println(name);
		System.out.println(age);
	}
	/**
	 * 숫자 2개를 넣으면 합을 반환하는 메소드
	 * @param a - 키
	 * @param b - 몸무게
	 * @return - 평균값
	 */
	public int add(int a, int b) {
		return a + b;
		
	}
}
