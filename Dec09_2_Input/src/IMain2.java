import java.util.Scanner;

public class IMain2 {
	public static void main(String[] args) {
		// Ű���� �Է¹��� �غ�
		Scanner k = new Scanner(System.in);

		// �Ĵ��̸� �Է¹ޱ�
		System.out.print("�̸� : ");
		String name = k.next();

		// ���̺� �� �Է¹ޱ�
		System.out.print("���̺� �� : ");
		int count = k.nextInt();

		// ���� �Է¹ޱ�
		System.out.print("���� : ");
		double score = k.nextDouble();

		// �������� �Է¹ޱ�
		System.out.print("������ : ");
		boolean open = k.nextBoolean();

		System.out.println("-------------");
		// �̻ڰ� ����ϱ�
		System.out.printf("�Ĵ��\t: %s\n", name);
		System.out.printf("���̺�\t: %d�ڸ�\n", count);
		System.out.printf("����\t: %.1f��\n", score);
		System.out.printf("������\t: %b", open);
	}
}
