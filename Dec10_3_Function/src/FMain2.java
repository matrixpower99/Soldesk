// �Լ�(function)

public class FMain2 {
	public static void printKeke() { // ()���� ����(parameter, ����)�� ���� ����
		// 1. �Լ�����
		// 				 ����Ÿ�� - �� �Լ� �����ؼ� ����� ���� ������
		// public static �ڷ��� �Լ���(�ڷ��� ������, �ڷ��� ������, ...) {
		//                parameter(����) - �Լ� ���࿡ �ʿ��� ���
		//        �Լ� ����;
		//        return ��;
		// } �߰�ȣ�� ������(�ڵ� ��)
		// public static int(or double or void or etc...)
		// �Լ��� ���� ������ ������ ���� ���ǰ� ����

		// �������� ����ϴ� �Լ�
		System.out.println("������������");
		System.out.println("������������");
		System.out.println("^^");
	}

	// ���� �̸�, ��� �� ����ϴ� �Լ�
	// �Լ��� ���� �� �׼��� �տ��� ���̸� �ҽ� ���� �� ���ĺ� ������ ���ĵǾ� ����. ���������� ���Ǽ�
	//
	public static void printMyInfo() {
		System.out.println("�̸� : ������");
		System.out.println("�ּ� : �����ֽ� �ݰ");
	}

	// ��Ģ���� ����� ����ϴ� �Լ�
	public static void printCalc(int x, int y) {
//		����� �ڵ�
//		int a = x + y;
//		int b = x - y;
//		int c = x * y;
//		int d = x / y;
//		System.out.printf("%d + %d = %d", x, y, a);
//		System.out.printf("%d - %d = %d", x, y, b);
//		System.out.printf("%d * %d = %d", x, y, c);
//		System.out.printf("%d / %d = %d", x, y, d);

//		�� �ڵ�
		System.out.printf("%d + %d = %d\n", x, y, x + y);
		System.out.printf("%d - %d = %d\n", x, y, x - y);
		System.out.printf("%d * %d = %d\n", x, y, x * y);
		System.out.printf("%d / %d = %d\n", x, y, x / y);
		System.out.println("----------");
	}

	// �Ǽ� 3���� ������ ���� ����ϴ� �Լ�
	public static void printMultiply(double q, double w, double e) {
		double result = (double)q * w * e;
		System.out.printf("%.2f * %.2f * %.2f = %.2f", q, w, e, result);
	}

	// main�Լ�
	public static void main(String[] args) {
		String name = "������";
		String home = "������";

		// 2. �Լ�ȣ�� -> ���
		// main�Լ� ���ο� ����� ������ ��������� �ٸ� �Լ��� ������ ������ ȣ���ؾ߸� ����
		// ȣ���� -> �Լ���();
		printKeke();
		printMyInfo();

		System.out.println("----------");

		printCalc(20, 10);
		printCalc(5, 3);

		printMultiply(1.5, 20.1, 10.3);
		printMultiply(11.1, 22.2, 33.3);

	}
}
