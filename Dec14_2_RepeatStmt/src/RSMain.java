import java.util.Iterator;

// �ݺ���(Repeat Statement)
// 		300�� �ݺ� -> Ƚ���� �Ű� ���� 
//		������ �ٽ� ���Ϸ� �� ������ �ݺ� -> ������ �Ű� ����

// for �� : Ƚ���� ��Ȯ�� �� ���

public class RSMain {

	public static void main(String[] args) {
		// �� ��� 5�� �ݺ�
		for (int i = 0; i < 5; i++) {
			System.out.println("��");
		}
		System.out.println("----------");
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
//		for (���������; ���ǽ�; ���� �� ��ȭ
		for (int a = 10; a <= 12; a++) {
			System.out.println(a);
		}
		System.out.println("------------");
		// 3, 4, 5, 6, 7���� ��µǵ���
		for (int i = 3; i < 8; i++) { // i <=7 ���ٴ� ���� �� ���Ƿ� i < 8�� ���� ����.
			System.out.println(i);
		}
		System.out.println("------------");
		// 2, 4, 6, 8, 10�� ��µǵ���
		for (int i = 2; i < 11; i += 2) {
			System.out.println(i);
		}
		System.out.println("------------");
		// 20, 19, 18, 17, 16���� ���
		for (int i = 20; i > 15; i--) {
			System.out.println(i);
		}
		System.out.println("------------");
		// 27, 9, 3, 1 ��� �ǵ���
		for (int i = 27; i > 0; i /= 3) { // ������� �Ӹ��� �ʿ�. �Ф�
			System.out.println(i);
		}
		System.out.println("------------");
		// 1, ��, 3, ��, 5, ��
		for (int i = 1; i < 7; i++) {
			System.out.println((i % 2 == 0) ? "��" : i);
			//			if (i % 2 == 0) {
//				System.out.println("��");
//			} else {
//				System.out.println(i);
//			}
		}
		System.out.println("------------");
		// 1, 2, ��, ��
		for (int i = 1; i < 5; i++) {
			System.out.println((i > 2) ? "��" : i);
//			if (i < 3) {
//				System.out.println(i);
//			} else {
//				System.out.println("��");
//			}
		}
	}

}
