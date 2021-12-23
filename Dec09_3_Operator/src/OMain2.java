import java.util.Scanner;

// �������� -> ����� boolean���� ������
//		>		>=		==		!=		<=		<
//		�ʰ�	�̻�	����	�ٸ���	����	�̸�

// �����տ�����
//		||, |			&&, &		^
//		~�ų�/or		~��/and		xor

//		!
//		�ݴ�/not

public class OMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = k.next();
		
		System.out.print("Ű : ");
		double height = k.nextDouble();
		
		System.out.print("���� : ");
		int age = k.nextInt();
		
		System.out.println("-----");
		System.out.printf("Ű�� %.0fcm, ���̴� %d��\n", height, age);
		
		// Ű�� 150�Ѿ�� Ż �� �ִ�
		boolean a = height > 150;
		System.out.println(a);
		
		// ���̰� 10�� �̻��̾�߸� Ż �� �ִ�
		boolean b = (age >= 10);
		System.out.println(b);
		
		// ���̰� 3�츸 Ż �� �ִ�
		boolean c = (age == 3); 
		System.out.println(c);
		
		// Ű�� 140�� �ƴϾ�߸� Ż �� �ִ�
		boolean d = (height != 140); 
		System.out.println(d);
		
		// �̸��� ȫ�浿�� Ż �� �ִ�
		boolean e = (name == "ȫ�浿"); // (#7 == "ȫ�浿") -> ?????
		System.out.println(e);
		
		boolean e2 = name.equals("ȫ�浿"); // ���� ����
		System.out.println(e2);
		
		// ���̰� 5�� �̻��̰ų�, Ű�� 130 �̻��̸� ok
		// OR
		//		O O -> O
		//		O X -> O
		//		X O -> O
		//		X X -> X
		boolean f = (age >= 5) || (height >= 130);
		System.out.println(f);
		
		// ���̰� 10�� �̻��̰�, Ű�� 150 �̻��̾�� ok		
		boolean g = (age >= 10) && (height >= 150);
		System.out.println(g);
		
		// ���̰� 5�� �̻��̵��� Ű�� 130�̻��̵��� �ϳ���
		// eXclusive OR
		// O O -> X
		// O X -> O
		// X O -> O
		// X X -> X
		boolean h = (age >= 5) ^ (height >= 130);
		System.out.println(h);
		
		// hŻ���ִ� ��� ��Ÿ, h��Ÿ�� ����� Ÿ
		boolean i = !h;
		System.out.println(i);
	}
}






