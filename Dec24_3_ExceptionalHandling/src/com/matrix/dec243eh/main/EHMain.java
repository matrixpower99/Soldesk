package com.matrix.dec243eh.main;

import java.util.InputMismatchException;
import java.util.Scanner;

// error : java문법에 맞지 않아서 기계어로 번역이 불가능한 상태(컴파일 불가능 상태)
//			프로그램이 완성되지 못함
//			개발자 잘못

// warning : 지저분한 소스(정리가 안된)
//			프로그램이 완성됨, 정리해주는게 좋다
//			개발자 잘못

// exception : 프로그램에는 문제 없음, 실행할 때 외부적인 요인에 의해 정상실행이 안되는 
//			프로그램은 완성됨
//			개발자 잘못은 아니지만, 대비는 해놔야
//		try {
//			위험한 구문
//		} catch (Exception이름 변수명) {
//			그 Exception이 발생하면 여기 실행
//		} catch (Exception이름 변수명) {
//			그 Exception이 발생하면 여기 실행
//		} ...
//		} finally {
//			Exception 발생여부와 상관없이 실행, return보다 먼저
//			중간에 return이 있을 때 사용
//		}	

// exception 처리할 마음 없음
// java - 무조건 해야 함 -> 안하면 에러
// python -> 하든 말든 자유

public class EHMain {

	public static void main(String[] args) {
		// 나누기 0은 없음 : 수학 이론
		// 내 동생 :초딩 -> 숙제하기 싫어서
		// 친구들한테 자랑
		try {
			
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력해주세요");
		}
		Scanner k = new Scanner(System.in);
		System.out.print("x : ");
		int x = k.nextInt();
		System.out.print("y : ");
		int y = k.nextInt();
		System.out.println("--------------");

//		try {
//			int d = x / y;
//			System.out.printf("%d / %d = %d\n", x, y, d);
//
//			int[] ar = { 123, 234 };
//			System.out.println(ar[y]);
//			
//		} catch (ArithmeticException e) {
//			System.out.println("나누기 0은 없다");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열에 그거 없음");
//		}

		try {
			int d = x / y;
			System.out.printf("%d / %d = %d\n", x, y, d);

			int[] ar = { 123, 234 };
			System.out.println(ar[y]);
			
		} catch (Exception e) {
			System.out.println("하여튼 문제 발생");
			e.printStackTrace(); // 사유 출력(개발자용). 프로그램 완성 후 삭제
		} finally {
			System.out.println("무조건 실행");
		}
		
		int a = x + y;
		int b = x - y;
		int c = x * y;

		System.out.printf("%d + %d = %d\n", x, y, a);
		System.out.printf("%d - %d = %d\n", x, y, b);
		System.out.printf("%d * %d = %d\n", x, y, c);
	}
}
