
public class FMain2 {
	// ������ �� �� ������ ���� ����ϴ� �Լ�
	
	public static void printSum(int a, int b) {
		int sum = (int)a + b;
		System.out.printf("%d + %d = %d\n", a, b, sum);
	}
	
	// ������ 2�� ������ �� ���� ���ϴ� �Լ�
	public static int getSum(int x, int y) {
		int sum = (int)x + y; // �Լ����� �۾��ؼ� ���� ��� : sum
							  // �ϰ�  ���� �۾� : ���� �ִ� �� ���(sum)�� main���� ���� ����		
		return sum;  // �Լ��� ����� ȣ���� ������ ������ ���� ��
		// return �ؿ� ����� �ڵ�� ������ ���� �ʴ´�. Error
	}
	
	// ���� �ϳ� ������, * 1000�� ���� ���ϴ� �Լ�
	public static int getMulti(int x) {
		int calcMulti = x * 1000;
		return calcMulti;
	}
	
	// ������ �ϳ� ������ Ȧ������ ¦������ �����ִ� �Լ�
	public static String getOE(int x) {
		String checkOE = (x % 2 == 0) ? "¦��" : "Ȧ��";
		return checkOE;
	}
	
	public static void main(String[] args) throws InterruptedException {
		// �ۼ��� �Լ� ȣ��
		// �� �Լ��� ����Ͽ� 10,3 �� �� ���
		printSum(10, 3);
		
		// �� �Լ��� ����Ͽ� 345, 123�� �� ���
		printSum(345, 123);
		
		// 10,3 �� �ո�ŭ ���α׷� ���߱�
		int slpTime = getSum(1, 3);
//		System.out.println(slpTime);
		slpTime = getMulti(slpTime);
//		Thread.sleep(slpTime);
//		System.out.println("Done.");
		
		// 5, -3�� ���� Ȧ/¦ ����ϱ�
		int num1 = 5, num2 = -3;
		int resultSum = getSum(num1, num2);
		String resultOE = getOE(resultSum);
		System.out.printf("%d�� %s�Դϴ�.", resultSum, resultOE);
		
	}

}
