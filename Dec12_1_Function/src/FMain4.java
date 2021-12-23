// getSum(1) = 1
// getSum(2) = getSum(1) + 2
// getSum(3) = getSum(2) + 3
// getSum(4) = getSum(3) + 4


public class FMain4 {
	// ������ �ϳ� ������, 1���� �Է��� ���ڱ����� ���� ���ϴ� �Լ�
	// 1+2+3+4+....+n
	
	// �Լ� �����(recursive) ȣ�� 
	public static int getTotal(int n) {
		int sum = (n == 1) ? 1 : (getTotal(n - 1) + n); // ����� �ڵ�
		
//		for (int i = 1; i <= n; i++) { // ���ڵ�
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

	// �Ǻ���ġ ���� 
	// ĭ: 1 2 3 4 5 6  7  8 
	// ��: 1 1 2 3 5 8 13 21
	// getFibo(1) = 1
	// getFibo(2) = 1
	// getFibo(3) = getFibo(2) + getFibo(1)
	// getFibo(4) = getFibo(3) + getFibo(2)
	// getFibo(n) = getFibo(n - 1) + getFibo(n - 2)
	
	// ĭ ��ȣ�� ������ �Ǻ���ġ���� �� ���ϴ� �Լ�
	// �ٸ� �п����� �̷��� ������ ������ �̷��� �ϸ� �ȵ�.
	public static int getFibo(int x) {
//		int result = (x < 3) ? 1 : (getFibo(x - 2) + getFibo(x - 1)); // �� �ڵ�
		int result = (x > 2) ? (getFibo(x - 1) + getFibo(x - 2)) : 1; // ����� �ڵ�
		return result;
	}
	
	public static void main(String[] args) {
		int num = 10;
		int result1 = getTotal(num);
		System.out.println(result1); 
		
		// ���� 1�� ������ factorial�� ���ϴ� �Լ�
		int x = 4;
		int result2 = getFactorial(x);
		System.out.println(result2); 
		
		// ���� 1�� ������ �Ǻ���ġ ���� ���ϱ�
		int y = 6; 
		int result3 = getFibo(y);
		System.out.println(result3);
		
		
	
	}

}
