// JVM(Java Virtual Machine)
//		JRE(Java Runtime Environment) : �ڹٷ� ���� ���α׷� �����Ϸ��� ��ġ�Ǿ� �־�� ��.
//		JAVA���α׷� ���� -> JRE�� ����ȯ�濡 �°� JVM�� �����Ͽ� ������.
//		JAVA�����ڴ� JVMȯ�濡�� ����Ǵ� ���α׷��� ����� ��.
//		-> ���α׷� �ϳ� ���������� � OS�������� ���ؿ��� (JAVA�� �ڶ�)
//		-> WORA(Write Once Run Anywhere) : �ʹ� �ͽ����� ����. ���� �����ؾ� ��.

// � �Լ��� �ٸ� �Լ� ���ο� ����� �ȵ�
// ���� ��� ����. (�����)

public class FMain {
	// ������ �ϳ� ������, "Ȧ��"���� "¦��"���� ������ִ� �Լ�
	
	public static void printOddEven(int x) { // �Ϲ��Լ� : ȣ���ؾ� ����
		// 2�� ���� �������� 0�̸� ¦��, �ƴϸ� Ȧ��
		String oeCheck = ((x % 2) == 0) ? "¦��" : "Ȧ��"; // �� �ڵ�
		// String oeCheck = ((x % 2) == 1) ? "Ȧ��" : "¦��"; // ����� �ڵ�
		System.out.printf("%d�� %s�Դϴ�.\n", x, oeCheck); 
	}
		
	public static void main(String[] args) { // main�Լ� : JVM�� �ڵ� ȣ��
		printOddEven(654); // �Լ� ȣ��
		printOddEven(343);
		
	}
}
