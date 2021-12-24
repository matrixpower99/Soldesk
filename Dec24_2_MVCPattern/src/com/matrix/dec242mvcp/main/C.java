package com.matrix.dec242mvcp.main;

// 패턴프로그래밍 - 커리큘럼 아님
// Spring 보강 -> 

// java -> jsp -> spring
// java -> jsp
// 		-> JSP에 MVC패턴 적용시킨거 : JSP Model 2
// 		-> JSP Model 2 발전형 : Spring
//
// MVC패턴
//		파일을 나눠서 파일 하나가 M/V/C중에 하나의 역할만
//			A.java -> M
//			B.java -> V
//			C.java -> C
// 		파일 하나는 한명이 작업하는게 편함
// 		프로젝트에는 다양한 직업의 사람들이 참여함
//		
//		리더급 개발자
//		신입 개발자
//		디자이너
//		고객

// Controller
// 		사용자들에게 보여지지는 않음
//		흐름제어(M이 필요하면 M 소환, V가 필요하면 V 소환)
//		리더급 개발자의 작업영역

public class C {
	public static void main(String[] args) {
		int x = V.getX();
		String result = M.judge(x);
		V.printResult(result);
	}
}
