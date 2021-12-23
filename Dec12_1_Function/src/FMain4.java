// getSum(1) = 1
// getSum(2) = getSum(1) + 2
// getSum(3) = getSum(2) + 3
// getSum(4) = getSum(3) + 4


public class FMain4 {
	// 정수를 하나 넣으면, 1부터 입력한 숫자까지의 합을 구하는 함수
	// 1+2+3+4+....+n
	
	// 함수 재귀적(recursive) 호출 
	public static int getTotal(int n) {
		int sum = (n == 1) ? 1 : (getTotal(n - 1) + n); // 강사님 코드
		
//		for (int i = 1; i <= n; i++) { // 내코드
//			sum += i;
//		}
		return sum;
	}
	
	// 5!(Factorial) = 5 * 4 * 3 * 2 * 1
	public static int getFactorial(int n) {
		int result = (n == 1) ? 1 : (n * getFactorial(n - 1));
		// 4 * getFactorial(3)
		// 		3 * getFactorial(2)
		// 			2 * getFactorial(1)
		return result;
	}

	// 피보나치 수열 
	// 칸: 1 2 3 4 5 6  7  8 
	// 값: 1 1 2 3 5 8 13 21
	// getFibo(1) = 1
	// getFibo(2) = 1
	// getFibo(3) = getFibo(2) + getFibo(1)
	// getFibo(4) = getFibo(3) + getFibo(2)
	// getFibo(n) = getFibo(n - 1) + getFibo(n - 2)
	
	// 칸 번호를 넣으면 피보나치수열 값 구하는 함수
	// 다른 학원에서 이렇게 마무리 하지만 이렇게 하면 안됨.
	public static int getFibo(int x) {
//		int result = (x < 3) ? 1 : (getFibo(x - 2) + getFibo(x - 1)); // 내 코드
		int result = (x > 2) ? (getFibo(x - 1) + getFibo(x - 2)) : 1; // 강사님 코드
		return result;
	}
	
	public static void main(String[] args) {
		int num = 10;
		int result1 = getTotal(num);
		System.out.println(result1); 
		
		// 정수 1개 넣으면 factorial값 구하는 함수
		int x = 4;
		int result2 = getFactorial(x);
		System.out.println(result2); 
		
		// 정수 1개 넣으면 피보나치 수열 구하기
		int y = 6; 
		int result3 = getFibo(y);
		System.out.println(result3);
		
		
	
	}

}
