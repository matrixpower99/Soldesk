import java.util.Scanner;

public class CSMain2 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		// �ڹ� ������ ���������� �� �� ����. _mid, _final �� ������� ��� ����
		System.out.print("�߰����: ");
		int mExam = k.nextInt();

		System.out.print("�⸻���: ");
		int fExam = k.nextInt();

		System.out.println("-------------");
		double avg = (double) (mExam + fExam) / 2;
		System.out.printf("��� : %.1f��\n", avg);

		// ���� : ����̾簡�� �з�
		// if (���ǽ� A) {
		//		���ǽ� A�� ������������ ���⸦ ����
		// } else if (���ǽ� B) {
		//		���ǽ� A�� ��, ���ǽ� B�� ������ ���⸦ ����
		// } else if (���ǽ� C) {
		//		���ǽ� A/B �Ѵ� ��, ���ǽ� C�� ����
		// } ...
		// else {
		//		���� �����ϴ°� �ϳ��� ������ ���� ����
		// }
		
		// ���� >= 90 : ��
		// 80 <= ���� < 90 : �� // ���� �ص��� ���ؾ� ��.
		// ���� if ������ ��� ��Ȳ���� ����ұ�?�� ���ؼ� ������ �� ��.
		// else if�� ���°��� ����.(������ x)
		
		if (avg >= 90) {
			System.out.println("��");
		} else if (avg >= 80) {
			System.out.println("��");
		} else if (avg >= 70) {
			System.out.println("��");
		} else if (avg >= 60) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
	}
}
