import java.util.Random;
import java.util.Scanner;

// �ݺ��� ����
// for & while ����
// 		break - �ݺ��� ��
// 		continue - �����ݺ�(������)
//		���� ������ �ִ� �ݺ����� ¦
public class RSMain4 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
//				break;
				continue; // 12���ٱ��� �����ϰ� 7���������� �����ϳ� continue ������ �ٷ� 7������ jump
			}
			System.out.println(i);
		}
		System.out.println("-----------------------");

		// 0 ~ 10������ ������ ��� ���(4�� �߸� �׸�)
		Random r = new Random();
		int a = 0;
		while (true) {
			a = r.nextInt(11);
			System.out.println(a);
			if (a == 4) {
				break;
			}
		}
		System.out.println("4�� ���� ����");
		System.out.println("-----------------------");

		// �ܼ� �Է¹ޱ� ����("����"��� �Է��ϸ� �׸�)
		Scanner k = new Scanner(System.in);
		String s = null; // s = "";
		System.out.println("�׸��Ϸ��� \"����\" �Է�");

		while (true) {
			System.out.print("��: ");
			s = k.next();
			if (s.equals("����")) {
				break;
			}
		}
		System.out.println(s + " �ԷµǾ� ����");
		System.out.println("------------------");
		
		// i = 2�� �� for�� �ߴ�. 
		a : for (int i = 0; i < 10; i++) { // �ݺ������� �̸��� ���� �� �ִ�.
			b: switch (i) {
			case 2:
				System.out.println("��");
				// ����� �극��ũ? switch or for, ��Ŭ������ ��Ʈ�� ��
				break a; // �� ������ Ż��
				
			default:
				System.out.println("i");
				break;
			}
		}
		System.out.println("------------------");
		
		// Java 1.5���� �߰��� ���
		iFor: for (int i = 0; i < 10; i++) {
			jFor: for (int j = 0; j < 10; j++) {
				System.out.printf("%d %d\n", i, j);
				if (j == 1) {
//					break; // ���� ������ �ִ� j�� Ż���ϴ� break
					break iFor; // �̷��� �̸��� �����ؼ� ������ �� �ִ�. Java���� �ִ� ����
				}
			}
			
		}
		// ������ ��Ʈ��ũ : �� ����� ���� ȸ�� ���� ������ �� �ִ�.
		
	}
}
