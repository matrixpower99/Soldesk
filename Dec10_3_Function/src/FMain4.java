import java.util.Scanner;
// �Լ� overloading
// 		�Լ��� �ߺ��Ǹ� �ȵ�
//		�Ķ���� ������ �ڷ����� �ٸ��� ���(ȣ���� �� ������ �����ϹǷ�)

public class FMain4 {
	
	// ������ 2�� ������ �� ū ���� ��� �ϴ� �Լ�
	public static void printBigger(int x, int y) {
		// ���̵��(����)�� ����
		int bigger = (x > y) ? x : y;
		System.out.printf("%d�� %d�� ū ���� %d �Դϴ�.\n", x, y, bigger);
	}
		
	// ������ 3�� ������ �� ū ���� ��� �ϴ� �Լ�
	
//	public static void printBigger(int x, int y, int z) { // ���޹޴� ���ڰ� �ٸ��� ��� ����
	public static void printBigger(int x, int y, int z) {
		int bigger = (x > y) ? x : y;
		bigger = (bigger > z) ? bigger : z;
//		System.out.println(bigger);
		System.out.printf("%d, %d, %d �� ū ���� %d �Դϴ�.\n", x, y, z, bigger);
	}
	public static void main(String[] args) {
//		Scanner k = new Scanner(System.in);
//		
//		System.out.print("���� 2���� �Է�: ");
//		int a = k.nextInt();
//		int b = k.nextInt();
//		
//		printBigger(a, b);
		printBigger(10, 3);
		printBigger(1000, 111111);
		printBigger(12,13, 66);
		printBigger(1000, 111111, 22222);
	}

}
