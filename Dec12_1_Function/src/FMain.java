// JVM(Java Virtual Machine)
//		JRE(Java Runtime Environment) : 자바로 만든 프로그램 실행하려면 설치되어 있어야 함.
//		JAVA프로그램 실행 -> JRE가 실행환경에 맞게 JVM을 생성하여 실행함.
//		JAVA개발자는 JVM환경에서 실행되는 프로그램을 만드는 것.
//		-> 프로그램 하나 만들어놓으면 어떤 OS에서든지 실해오딤 (JAVA의 자랑)
//		-> WORA(Write Once Run Anywhere) : 너무 맹신하지 말것. 조금 수정해야 함.

// 어떤 함수는 다른 함수 내부에 만들면 안됨
// 순서 상관 없음. (현재는)

public class FMain {
	// 정수를 하나 넣으면, "홀수"인지 "짝수"인지 출력해주는 함수
	
	public static void printOddEven(int x) { // 일반함수 : 호출해야 실행
		// 2로 나눈 나머지가 0이면 짝수, 아니면 홀수
		String oeCheck = ((x % 2) == 0) ? "짝수" : "홀수"; // 내 코드
		// String oeCheck = ((x % 2) == 1) ? "홀수" : "짝수"; // 강사님 코드
		System.out.printf("%d는 %s입니다.\n", x, oeCheck); 
	}
		
	public static void main(String[] args) { // main함수 : JVM이 자동 호출
		printOddEven(654); // 함수 호출
		printOddEven(343);
		
	}
}
