
public class FMain3 {
	public static void test(int x, int y) {
//		int a = 40; // �ٸ� ��(����)�� �׸��̶� �ߺ��ǰ� ���� �� ����. ��������
//		int b = 100;
		// �ٸ� ������ �Լ����� ���ڷ� ���޹޾ƾ� ��.
		System.out.println(x);
		System.out.println(y);
		x = 3;
		y = 5;
		System.out.println(x);
		System.out.println(y);
		
		int z = x + y;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
//		int a = 10; // a��� �׸��� ���� 10�� ����
//		a = 20;		// a�� 20�� ����
//		int a = 30; // ���� ������ ���� �̸��� �׸��� �ٽ� ���� �� ����.
//		System.out.println(b); // ���� ������ ������ �������� ����. �ٸ� ������ ���� ������ ȣ���� �� ����. 
		int x = 100;
		int y = 50;
		System.out.println(x);
		System.out.println(y);
		test(x, y);
		System.out.println(x);
		System.out.println(y);
	}

}
