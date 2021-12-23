
public class FMain2 {
	// 정수를 두 개 넣으면 합을 출력하는 함수
	
	public static void printSum(int a, int b) {
		int sum = (int)a + b;
		System.out.printf("%d + %d = %d\n", a, b, sum);
	}
	
	// 정수를 2개 넣으면 그 합을 구하는 함수
	public static int getSum(int x, int y) {
		int sum = (int)x + y; // 함수에서 작업해서 나온 결과 : sum
							  // 하고  싶은 작업 : 여기 있는 그 결과(sum)을 main에서 쓰고 싶음		
		return sum;  // 함수의 결과를 호출한 쪽으로 보내고 싶을 때
		// return 밑에 써놓은 코드는 실행이 되지 않는다. Error
	}
	
	// 정수 하나 넣으면, * 1000한 값을 구하는 함수
	public static int getMulti(int x) {
		int calcMulti = x * 1000;
		return calcMulti;
	}
	
	// 정수를 하나 넣으면 홀수인지 짝수인지 구해주는 함수
	public static String getOE(int x) {
		String checkOE = (x % 2 == 0) ? "짝수" : "홀수";
		return checkOE;
	}
	
	public static void main(String[] args) throws InterruptedException {
		// 작성한 함수 호출
		// 그 함수를 사용하여 10,3 의 합 출력
		printSum(10, 3);
		
		// 그 함수를 사용하여 345, 123의 합 출력
		printSum(345, 123);
		
		// 10,3 의 합만큼 프로그램 멈추기
		int slpTime = getSum(1, 3);
//		System.out.println(slpTime);
		slpTime = getMulti(slpTime);
//		Thread.sleep(slpTime);
//		System.out.println("Done.");
		
		// 5, -3의 합이 홀/짝 출력하기
		int num1 = 5, num2 = -3;
		int resultSum = getSum(num1, num2);
		String resultOE = getOE(resultSum);
		System.out.printf("%d는 %s입니다.", resultSum, resultOE);
		
	}

}
