import java.util.Scanner;

public class IMain {
	public static void main(String[] args) {
		// �ܼ�â�� Ű����� �Է��� �غ�
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("CPU : ");
		// �Է¹��� ���� �����͸� cpu��� ������ ����
		String cpu = keyboard.next();

		System.out.print("RAM : ");
		// �Է¹��� �Ǽ� �����͸� ram�̶�� ������ ����
		double ram = keyboard.nextDouble();
		
		System.out.print("HDD : ");
		int hdd = keyboard.nextInt();
		
		System.out.printf("CPU : %s\n", cpu);
		System.out.printf("RAM : %.0fGB\n", ram);
		System.out.printf("HDD : %dGB", hdd);
	}
}



