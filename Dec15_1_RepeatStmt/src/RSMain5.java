import java.util.Random;

// �ݺ�Ƚ�� ��Ȯ�ϴٸ� - for
// �ݺ������� ��Ȯ�ϴٸ� - while, do-while(���� �ǹ̰� ���� ��������� ����)

// �ݺ����� - break, continue
public class RSMain5 {

	public static void main(String[] args) {
		// 0 ~ 10������ ������ ��� ���(4�� �߸� �׸�)
		Random r = new Random();
		int a = r.nextInt(11);
		System.out.println(a);
		while (a != 4) {
			a = r.nextInt(11);
			System.out.println(a);
		}
		System.out.println("---------------------");
		
		int b = 0;
		while (b != 4) { // �˻��ϰ� ���� ����
			b = r.nextInt(11);
			System.out.println(b);
		}
		System.out.println("---------------------");
		
		// �ּ� 1���� �ݺ��� �����
		do { // �����ϰ� ���� �˻�
			a = r.nextInt(11);
			System.out.println(a);
		} while (a != 4);
		
	}

}
