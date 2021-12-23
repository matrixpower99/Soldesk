package com.matrix.dec234a.human;

// 일반클래스 : 멤버변수, 멤버상수, 메소드
// 추상클래스 : 멤버변수, 멤버상수, 메소드, 추상메소드 -> 객체는 못만듬
// 인터페이스 : 멤버상수, 추상메소드 -> 객체는 못만듬, 기능이라고 부를만한 게 없음

public interface Smoker {
//	private int a; 				   // 멤버변수 불가능
	public static final int B = 0; // 멤버상수는 가능

//	public void c() { 
//
//	}							 // 메소드 불가능
	public abstract void smoke(); // 추상메소드 가능
		
}