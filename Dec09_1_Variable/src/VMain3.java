
public class VMain3 {
	public static void main(String[] args) {
		// ���� ��ǻ�� CPU �𵨸��� �ӽ� ����
		String cpu = "i5-8500";

		// ���� �� RAM �뷮 �ӽ� ����
		double ram = 8.00;
		
		// ���� �� HDD �뷮 �ӽ� ����
		int hdd = 931;
		
		// �ܼ�â�� �������
		System.out.printf("CPU : %s\n", cpu);
		System.out.printf("RAM : %.0fGB\n", ram);
		System.out.printf("HDD : %dGB", hdd);
	}
}
