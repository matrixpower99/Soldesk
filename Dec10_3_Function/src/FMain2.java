// 함수(function)

public class FMain2 {
	public static void printKeke() { // ()안의 내용(parameter, 인자)은 생략 가능
		// 1. 함수정의
		// 				 리턴타입 - 이 함수 수행해서 결과가 뭐가 나오나
		// public static 자료형 함수명(자료형 변수명, 자료형 변수명, ...) {
		//                parameter(인자) - 함수 수행에 필요한 재료
		//        함수 내용;
		//        return 값;
		// } 중괄호로 묶어줌(코드 블럭)
		// public static int(or double or void or etc...)
		// 함수명 짓는 조건은 변수명 짓는 조건과 같음

		// ㅋㅋㅋㅋ 출력하는 함수
		System.out.println("ㅋㅋㅋㅋㅋㅋ");
		System.out.println("ㅎㅎㅎㅎㅎㅎ");
		System.out.println("^^");
	}

	// 본인 이름, 사는 곳 출력하는 함수
	// 함수명 지을 때 액션을 앞에다 붙이면 소스 정렬 때 알파벳 순으로 정렬되어 편함. 유지보수의 편의성
	//
	public static void printMyInfo() {
		System.out.println("이름 : 이지상");
		System.out.println("주소 : 남양주시 금곡동");
	}

	// 사칙연산 결과를 출력하는 함수
	public static void printCalc(int x, int y) {
//		강사님 코드
//		int a = x + y;
//		int b = x - y;
//		int c = x * y;
//		int d = x / y;
//		System.out.printf("%d + %d = %d", x, y, a);
//		System.out.printf("%d - %d = %d", x, y, b);
//		System.out.printf("%d * %d = %d", x, y, c);
//		System.out.printf("%d / %d = %d", x, y, d);

//		내 코드
		System.out.printf("%d + %d = %d\n", x, y, x + y);
		System.out.printf("%d - %d = %d\n", x, y, x - y);
		System.out.printf("%d * %d = %d\n", x, y, x * y);
		System.out.printf("%d / %d = %d\n", x, y, x / y);
		System.out.println("----------");
	}

	// 실수 3개를 넣으면 곱을 출력하는 함수
	public static void printMultiply(double q, double w, double e) {
		double result = (double)q * w * e;
		System.out.printf("%.2f * %.2f * %.2f = %.2f", q, w, e, result);
	}

	// main함수
	public static void main(String[] args) {
		String name = "이지상";
		String home = "남양주";

		// 2. 함수호출 -> 사용
		// main함수 내부에 기술한 내용은 실행되지만 다른 함수에 정의한 내용은 호출해야만 실행
		// 호출방법 -> 함수명();
		printKeke();
		printMyInfo();

		System.out.println("----------");

		printCalc(20, 10);
		printCalc(5, 3);

		printMultiply(1.5, 20.1, 10.3);
		printMultiply(11.1, 22.2, 33.3);

	}
}
