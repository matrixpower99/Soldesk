import java.util.Scanner;

// ������(Operator) => stack���� ���

//	���Կ����� =
//		���׿� �ִ°� ���׿� �־��
//		�����ڶ�°͵��߿� �켱���� �õ�

//	��������� + - * / %
//	���+���Կ����� += -= *= /= %=
//	���������� ++ --
//	shift������ <<

//�������� {
//	����	1
//	���	2
//	������	3
//}
//xxx.�������� = 3
//xxx.�������� = 2

//���ڼӼ�{
//	���Ÿ�	1<<0
//	����	1<<1
//	����	1<<2
//}
//xxx.���ڼӼ� = 1<<0
//xxx.���ڼӼ� = 1<<1
//xxx.���ڼӼ� = ���Ÿ� + ����



public class OMain {
	public static void main(String[] args) {
		// Ű���� �Է¹��� �غ�
		Scanner k = new Scanner(System.in);

		// x�� �Է¹ޱ�(������ ����)
		System.out.print("x : ");
		int x = k.nextInt();

		// y�� �Է¹ޱ�(
		System.out.print("y : ");
		int y = k.nextInt();

		// �� ġ��, xy���
		System.out.println("-----");
		System.out.printf("x�� %d, y�� %d\n", x, y);

		int a = x + y;
		int b = x - y;
		int c = x * y;
		int d = x / y;
		int e = x % y;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println("-----");

		String s = "��";
		String f = x + s; // ������͵��� + String -> �پ String���� ����
		System.out.println(f);

		String s2 = "3";
		String g = x + s2;
		System.out.println(g);
		System.out.println("-----");

		int h = x / y;
		System.out.println(h);

		// int�� int����ϸ� ����� int�� ����
		// ���߿� �ϳ��̻� double�̾�� ����� double�� ����
		// x�� double�� �ٲٰ� ���� : ����ȯ(casting)
		//	����ȯ�̶�°� : java�� �ڵ����� ����, eclipse�� ������
		
		// �����ڰ� �Ҽ����� �츮�� ������, ���̰� ������ �Ǵ� �Ұ���
		double h2 = (double) x / y;
		System.out.println(h2);
		System.out.println("-----");
		
		// x�� 3����
		x += 3; // x = x + 3;
		System.out.println(x);
		
		// x�� 2���
		x *= 2; // x = x * 2;
		System.out.println(x);
		
		// y�� 1����
		// y = y - 1;
		// y -= 1;
		y--;
		System.out.println(y);
		
		// y�� ������
		y /= 2; // y = y / 2;
		System.out.println(y);
		System.out.println("-----");

		
		
		
		// ?
		int i = 5 << 3;
		System.out.println(i);
	}
}







