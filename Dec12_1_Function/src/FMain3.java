
public class FMain3 {
	// ���� �̸� ����ϴ� �Լ� - ����� ���� ��ɸ� ����
	public static void printName() {
		System.out.println("�̸� : ������");
	}
	
	// ������ 2�� ������ �� ����� ���ϴ� �Լ�
	// 		in : ���� 2��
	//		out : �� ��հ�
	public static double getAvg(int x, int y) {
		double avg = (double)(x + y) / 2; // �������� �Է¹޾����Ƿ� �����̳� ���� �� �ϳ��� double�� �ٿ���� ��.
		// or double avg = (x + y) / 2.0; // �̷��� �ص� double ���� ����
		return avg;
	}
	
	// �Ǽ��� 3�� ������ �� ����� ������ ���� 3�ڸ����� ����ϴ� �Լ�
	//		in : �Ǽ� 3��
	public static void printAvg(double x, double y, double z) {
		double avg = (x + y + z) / 3.0; // �Է� �ڷ����� double�̹Ƿ� ���� double�� ������ �ʾƵ� �ȴ�.
		System.out.printf("��� : %.3f\n", avg);
	}
	
	// ������ ��� ���� ���ϴ� �Լ�
	// 		out ��� ��
	// ���Ѵٴ� �Ͱ� ����Ѵٴ� ���� ���� �ٸ� �̾߱�.
	public static String getHome() {
		String address = "�����ֽ�";
		return address;
	}
	
	public static void main(String[] args) {
		// �� �̸� ��� �Լ� ȣ��
		printName();
	
		// 243, 456�� ��հ��� ���
		int a = 243, b = 456;
		double resultAvg = getAvg(a, b);
		System.out.println(resultAvg);
		
		// (243, 456�� ��հ�)+ 1.1, 3.14�� ��հ� �Ҽ��� 3�ڸ����� ���
		double x = 1.1, y= 3.14;
		printAvg(resultAvg, x, y);
				
		// ���� �� ���
		String home1 = getHome();
		System.out.println(home1);
		
		
	}

}
