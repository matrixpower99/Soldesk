// 함수 overloading -> Java는 지원, Python은 미지원

public class FuncParamMain {
	// 정수 2개 넣으면 그 합을 출력하는 함수

	public static void printSum(int a, int b) {
		System.out.println(a + b);
	}
	
	// 정수 3개 넣으면 그 합을 출력하는 함수
	public static void printSum(int a, int b, int c) { // 함수 오버로딩
		System.out.println(a + b + c);
	}
	
	// 정수 4개를 넣으면 그 합을 출력하는 함수
	public static void printSum(int a, int b, int c, int d) { // 함수 오버로딩
		System.out.println(a + b + c + d);
	}
	
	// 정수를 몇 개 넣든지 그 곱을 출력하는 함수
	// Java 1.5부터 추가된 신기능. Java에만 있는 기능
	// 함수 파라미터 쓸 때 : 자료형... 변수명 -> 갯수 무제한 파라미터
	public static void printGob(int...is) { // 무제한 파라미터
		// 사용할때는 배열형태로. 주로 for 사용
		int a = 1;
		for (int i : is) {
			a *= i;
		}
		System.out.println(a);
	}
	
	public static void main(String[] args) {
//		System.out.println(123 + ""); // -> String 전환. 예전 자바는 무조건 string이 아니면 출력이 안되었음.
		printGob(10);
		printGob(10, 20);
		printGob(10, 20, 30);
		
		printSum(50, 60, 79, 81);
		printSum(10,30);
		printSum(1,3);
		printSum(10,30,50);
		printSum(5,9,17);
		
	}
}
