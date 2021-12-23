// �Լ� overloading -> Java�� ����, Python�� ������

public class FuncParamMain {
	// ���� 2�� ������ �� ���� ����ϴ� �Լ�

	public static void printSum(int a, int b) {
		System.out.println(a + b);
	}
	
	// ���� 3�� ������ �� ���� ����ϴ� �Լ�
	public static void printSum(int a, int b, int c) { // �Լ� �����ε�
		System.out.println(a + b + c);
	}
	
	// ���� 4���� ������ �� ���� ����ϴ� �Լ�
	public static void printSum(int a, int b, int c, int d) { // �Լ� �����ε�
		System.out.println(a + b + c + d);
	}
	
	// ������ �� �� �ֵ��� �� ���� ����ϴ� �Լ�
	// Java 1.5���� �߰��� �ű��. Java���� �ִ� ���
	// �Լ� �Ķ���� �� �� : �ڷ���... ������ -> ���� ������ �Ķ����
	public static void printGob(int...is) { // ������ �Ķ����
		// ����Ҷ��� �迭���·�. �ַ� for ���
		int a = 1;
		for (int i : is) {
			a *= i;
		}
		System.out.println(a);
	}
	
	public static void main(String[] args) {
//		System.out.println(123 + ""); // -> String ��ȯ. ���� �ڹٴ� ������ string�� �ƴϸ� ����� �ȵǾ���.
		printGob(10);
		printGob(10, 20);
		printGob(10, 20, 30);
		
		printSum(50, 60, 79, 81);
		printSum(10,30);
		printSum(1,3);
		printSum(10,30,50);
		printSum(5,9,17);
		
	}
}
