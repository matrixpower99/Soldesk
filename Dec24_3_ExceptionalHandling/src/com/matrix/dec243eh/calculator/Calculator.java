package com.matrix.dec243eh.calculator;

public class Calculator {

	// 정상 : 7 - 8 - 9 - 14 - 15 - 10
	// 터질 때 : 7 - 8 - 9[터짐] - 11 - 12 - 14 - 15 - 13 
	public static int divide(int a, int b) {
		try {
			int c = a / b;
			return c;
		} catch (Exception e) {
			System.out.println("나누기 0없음");
			return -999;
		} finally {
			System.out.println("메리 크리스마스"); // 지금과 같은 상황에 사용하는게 finally
		}
//		System.out.println("메리 크리스마스"); // return 이후로 실행 안되는 코드
	}
}
