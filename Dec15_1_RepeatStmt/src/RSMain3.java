import java.util.Random;
import java.util.Scanner;

public class RSMain3 {

	public static void main(String[] args) {
		// 1 + 2 + 3 + .... + 7 = ?
		int sum = 0;
		for (int i = 1; i < 8; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("------------------");
		
		// 1 + 2 + 3 + .... + ? > 100
		// ?�� �����ϴ� �ּҰ�
		
		int count = 0, goal = 0;
		while(goal <= 100) {
			count++;
			goal += count;
			System.out.println("�հ�: " + goal + " ���ϴ� ��: " + count);
		}
		System.out.println("���Ǹ��� �ּҰ�:" + count);
		System.out.println("------------------");
		
		// 0 ~ 10 ���̿� ������ ��� ���
		// ������ 4�� ������ ����
		Random r = new Random();
		int rn = 0;
		System.out.println("������ 4�� ������ ����");
		while (rn != 4) {
			rn = (int)r.nextInt(11);
			System.out.println(rn);
		}
		System.out.println("------------------");
		
		// �ܼ� �Է¹ޱ� ����("����"��� �Է��ϸ� �׸�)
		Scanner k = new Scanner(System.in);
		String uc = "";
		System.out.println("�׸��Ϸ��� \"����\" �Է�");
		while (!uc.equals("����")) {
			System.out.print("��: ");
			uc = k.next();
		}
		System.out.println("����");
		System.out.println("------------------");
		
	}
}
// ������
//		������Ʈ -> �ٻ�
//		���� -> ???
// �� ��� ��
// �����۾�(Office)
// ������ ���� �ϰ� ����� �����ֱ�



