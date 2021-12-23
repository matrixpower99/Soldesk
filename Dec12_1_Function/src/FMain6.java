import java.util.Scanner;

public class FMain6 {
	public static String getName() {
		Scanner k = new Scanner(System.in);
		System.out.print("�̸� : ");
//		String name = k.next();
//		return name;
//		k.close();
		return k.next(); // 1ȸ������ ���Ÿ� ������ ������
	}
	
	public static double getHeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("Ű : ");
		double height = k.nextDouble();
		// while ������� �ʰ� 3�׿����ڷε� while ��ƾ�� ������ �� �ִ�.
		// Ű�� 1���� �۰ų� 300�� ������ ���Է� �䱸
//		height = (height < 1 || height > 300) ? getHeight() : height; // ù �ڵ�
//		return height;
//		k.close();
		return (height < 1 || height > 300) ? getHeight() : height; // ���� �ڵ�
	}
	
	public static double getWeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("������ : ");
		double weight = k.nextDouble();
//		weight = (weight > 0 && weight < 200) ? weight : getWeight(); // ù �ڵ�
//		return weight;
//		k.close();
		return (weight < 0 || weight > 300) ? getWeight() : weight; // ���� �ڵ�
	}
	
	public static double getStdWeight(double h) {
		// ǥ��ü�� ���
		return (double)((h - 100) * 0.9);
	}
	
	public static double getObseity(double sw, double w) {
		// �񸸵� ���
		return (double)((w / sw) * 100);
	}
	
	public static String getResult(double b) {
		// �� �� ���� ����
		return (b > 120) ? "��" : "����";
	}
	
	public static void printReport(double stdweight, double obesity, String name, String state) {
		// ��� ���
		System.out.println("-------------");
		System.out.printf("ǥ��ü�� : %.2fKg\n", stdweight);
		System.out.printf("�񸸵�   : %.2f%%\n", obesity);
		System.out.printf("%s���� %s�Դϴ�.\n", name, state);
	}
	
	public static void main(String[] args) {
		String name = getName();
		double height = getHeight();
		double weight = getWeight();
		double stdweight = getStdWeight(height);
		double obesity = getObseity(stdweight, weight);
		
		// �� �� ���� ����
		String state = getResult(obesity);

		// ��� ���
		printReport(stdweight, obesity, name, state);
		

	}

}
