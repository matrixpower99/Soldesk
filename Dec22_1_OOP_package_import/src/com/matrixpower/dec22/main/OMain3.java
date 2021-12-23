package com.matrixpower.dec22.main;

// 객체 생성
//		패키지명.클래스명 변수명 = new 패키지명.클래스명(); -> 원래 문법

// 패키지명을 생략 가능한 상황
//		같은 팩키지 소속이면 생략가능
//		Java의 기본패키지(java.lang) 소속
//		import 했으면

// OMain3에서 Scanner는 java것만 쓰겠다 -> import
import java.util.Scanner;

public class OMain3 {
	public static void main(String[] args) {
		com.matrixpower.dec22.animal.Dog d = new com.matrixpower.dec22.animal.Dog();
	}
	
	Mouse m = new Mouse();
	String s = new String("ㅋ");
//	java.lang.System.out.println("adfdasf");
	
	Scanner k = new Scanner(System.in); // import한것으로 해석함
	
}
