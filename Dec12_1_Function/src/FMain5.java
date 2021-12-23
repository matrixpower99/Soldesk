import java.util.Scanner;

// 함수 recursive 호출 :
//		함수속에서 자기자신을 호출해서, 반복이 생기도록 하는 테크닉

// 함수를 언제 사용하나? 설계가 어려운 이유
// 함수 :
// 인간(개발자)의 입장 : 소스정리 차원에서 -> 좋음
// 		컴퓨터의 입장 : 함수를 찾아가서 실행해야 하는(jump) -> 느려짐 -> 별로
// 		대체할만한 것이 있다면 함수는 안쓰는 것이 좋다.
// -> 계산, 반복 문제 : 반복문으로 해결하는 것이 맞음.
// -> recursive 테크닉으로 상대하면 -> 느려짐.

// -> 원하는 값이 나올때까지 반복하는 용도.
public class FMain5 {
	public static double getHeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("키: ");
		double uHeight = k.nextDouble();
		// while 사용하지 않고 3항연산자로도 while 루틴을 구현할 수 있다.
		// 키가 1보다 작거나 300을 넘으면 재입력 요구
		uHeight = (uHeight < 1 || uHeight > 300) ? getHeight() : uHeight;
		return uHeight;
	}

	public static int getAge() {
		Scanner k = new Scanner(System.in);
		System.out.print("나이: ");
		int uAge = k.nextInt();
		// 나이가 1살보다 적거나 130살이 넘으면 재입력 요구 
		uAge = (uAge >= 0 && uAge <= 200 ) ? uAge : getAge();
		return uAge;
	}
	
	public static void printResult(double prtHeight, int prtAge) {
		System.out.println("-----------------");
		System.out.printf("키는 %.1fcm, 나이는 %d살\n", prtHeight, prtAge);
		
	}
	public static void main(String[] args) {
		// 반환된 키와 나이를 출력
		double height = getHeight();
		int age = getAge();
		printResult(height, age);
	}

}
