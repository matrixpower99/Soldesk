
public class FMain3 {
	// 본인 이름 출력하는 함수 - 입출력 없이 기능만 구현
	public static void printName() {
		System.out.println("이름 : 이지상");
	}
	
	// 정수를 2개 넣으면 그 평균을 구하는 함수
	// 		in : 정수 2개
	//		out : 그 평균값
	public static double getAvg(int x, int y) {
		double avg = (double)(x + y) / 2; // 정수형을 입력받았으므로 좌항이나 우항 중 하나에 double을 붙여줘야 함.
		// or double avg = (x + y) / 2.0; // 이렇게 해도 double 값이 나옴
		return avg;
	}
	
	// 실수를 3개 넣으면 그 평균을 수소점 이하 3자리까지 출력하는 함수
	//		in : 실수 3개
	public static void printAvg(double x, double y, double z) {
		double avg = (x + y + z) / 3.0; // 입력 자료형이 double이므로 굳이 double을 붙이지 않아도 된다.
		System.out.printf("평균 : %.3f\n", avg);
	}
	
	// 본인이 사는 곳을 구하는 함수
	// 		out 사는 곳
	// 구한다는 것과 출력한다는 것은 전혀 다른 이야기.
	public static String getHome() {
		String address = "남양주시";
		return address;
	}
	
	public static void main(String[] args) {
		// 내 이름 출력 함수 호출
		printName();
	
		// 243, 456의 평균값을 출력
		int a = 243, b = 456;
		double resultAvg = getAvg(a, b);
		System.out.println(resultAvg);
		
		// (243, 456의 평균값)+ 1.1, 3.14의 평균값 소수점 3자리까지 출력
		double x = 1.1, y= 3.14;
		printAvg(resultAvg, x, y);
				
		// 본인 집 출력
		String home1 = getHome();
		System.out.println(home1);
		
		
	}

}
