import java.util.Scanner;

public class BCMain {
	// tab Ű�� ������ ���� �ֿ� ����Ʈ�� �̵��Ѵ�. 
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		// �̸�=name,Ű=height, ������=weight
		System.out.print("�̸�\t: ");
		String name = k.next();

		System.out.print("Ű\t: ");
		double height = k.nextDouble();

		System.out.print("������\t: ");
		double weight = k.nextDouble();
		System.out.println("-------------");

		// obesity = �񸸵�, stdWeight = ǥ��ü��
		// �񸸵� �� ǥ��ü�� ���
		double obesity, stdweight = 0;
		stdweight = (double)((height - 100) * 0.9);
		obesity = (double)((weight / stdweight) * 100);

//		�ݿø� ���� �ڵ�
//		double obesity2, stdweight2 = 0;
//		stdweight2 = (double)Math.round((height - 100) * 0.90);
//		obesity2 = (double)Math.round((weight / stdweight) * 100.00);

		// �� �� ���� ����
		String state = (obesity > 120) ? "��" : "����";

		// ��� Report
		System.out.printf("ǥ��ü�� : %.2fKg\n", stdweight); // ù �ڵ�
		System.out.printf("�񸸵�   : %.2f%%\n", obesity); // ù�ڵ�
		System.out.printf("%s���� %s�Դϴ�.\n", name, state);

		System.out.println("�����Ϸ��� ���� ���ÿ�.");
		k.next();
		k.close();
		
//		System.out.println("�ݿø� ��\t: String.format ���");
//		System.out.println(String.format("ǥ��ü��\t: %.2fKg", stdweight));
//		System.out.println(String.format("�񸸵�\t: %.2f%%", obesity));
//		System.out.printf("%s���� %s�Դϴ�.\n", name, state);
		// �����ؾ� �� ���� String.format, Math.round ���� ����� �α�
		
	}

}
