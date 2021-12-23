// 클래스명 중복? 자바의 특성상 빈번하게 발생 -> 남이 작업해준거(라이브버리)를 적극적으로 쓰는 Java

// package > class 
// package : 클래스명이 중복될 때 구분할 수단
//		class를 만들 때 꼭 package속에 넣기 -> 이 바닥의 약속
//		package명까지 중복되면 구분할 수단이 없음 -> 최후의 보루
//			-> package 명은 전세계적으로 유일해야(유니크)
//			com.회사명(웹사이트 주소를 거꾸로).프로그램명.카테고리 -> 개발자들간의 약속(Java 바닥의 약속)
// ex)
// com.soldesk.calculator
// com.soldesk.bmi.main
// com.soldesk.bmi.doctor
// com.soldesk.bmi.calc
public class OMain2 {
	public static void main(String[] args) {
		// 객체 생성
		// 		클래스명 변수명 = new 생성자; -> 축약형
		//		패키지명.클래스명 변수명 = new 패키지명.클래스명(); -> 원래 문법
		java.lang.String s = new java.lang.String("ㅋ"); // 원래 문법
		
		java.util.Scanner k = new java.util.Scanner(java.lang.System.in); // 원래 문법 -> 클래스명 중복시 처리방법
		System.out.print("뭐: ");
		String msg = k.next();
		System.out.println(msg);
		
		Scanner sc = new Scanner("캐논123", 500000, 10);
		sc.print();
		
	}
}
