import java.util.Scanner;

// �Ž����� ���
// ���űݾ� : 48300
// �� �� : 50000
// ----------------
// �Ž��ҵ�: 1700��
// 5���� : 
// 1���� : 
// 5õ�� : 
// 1õ�� : 
// 5��� : 
// 1��� : 
// 10�� : 

public class PMain2 {

	public static void main(String[] args) {
//		Scanner k = new Scanner(System.in);
//		System.out.print("���űݾ� : ");
//		int pm = k.nextInt();
//		System.out.print("�� �� : ");
//		int im = k.nextInt();
//		System.out.println("----------------");
//		int cm = pm - im;
//		System.out.println("�Ž��� �� : " + cm);
//		System.out.println();

		int cm = 178630;
		int mu = 50000, count = 1;
		while (cm > 10) {
			if (cm > mu) {
				System.out.printf("%d�� : %d��\n", mu, cm / mu);
				cm %= mu;
				mu = (count % 2 == 1) ? mu / 5 : mu / 2;
				count++;
			}
		}
		System.out.println("---------------");

		//		for (int m : money) {
//			System.out.printf("%d�� : %d��\n", m, cm / m);
//			cm %= m;
//		}
		
		
//		if (cm > 50000) {
//			int t50000 = cm / 50000;
//			System.out.println("5����" + t50000);
//			cm %= 50000;
//		}
//		if (cm > 10000) {
//			int t10000 = cm / 10000;
//			System.out.println("1����" + t10000);
//			cm %= 10000;
//		}
//		if (cm > 5000) {
//			int t5000 = cm / 5000;
//			System.out.println("5õ��" + t5000);
//			cm %= 5000;
//		}
//		if (cm > 1000) {
//			int t1000 = cm / 1000;
//			System.out.println("1õ��" + t1000);
//			cm %= 1000;
//		}
//		if (cm > 500) {
//			int t500 = cm / 500;
//			System.out.println("5���" + t500);
//			cm %= 500;
//		}
//		if (cm > 100) {
//			int t100 = cm / 100;
//			System.out.println("1���" + t100);
//			cm %= 100;
//		}
//		if (cm > 10) {
//			int t10 = cm / 10;
//			System.out.println("1�ʿ�" + t10);
//			cm %= 10;
//		}
		
//		int[] arr = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
//		for (int i = 0; i < arr.length; i++) {
//			// �ݾ��� �����ؼ� �ڵ����
//			if (cm / arr[i] > 0) {
//				System.out.println(arr[i] + "�� : " + cm / arr[i] + " �� ");
//				cm %= arr[i];
//			}
//		}
	}
}
