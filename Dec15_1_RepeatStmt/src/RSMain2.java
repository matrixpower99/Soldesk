// �����

public class RSMain2 {
	public static void main(String[] args) {
		// ����������
		// ����������
		// ����������
		// ����������
		// ����������
		for (int x = 0; x < 5; x++) { // ��
			for (int y = 0; y < 5; y++) { // ��
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println("-----------------");

		// ��
		// ����
		// ������
		// ��������
		// ����������
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) { // �Ǵ� j < i +1�� ������ �� �� ������ j <= i�� �� ������ �ڵ�
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println("-----------------");

		// ����������
		// ��������
		// ������
		// ����
		// ��
		for (int i = 0; i < 5; i++) { // ������
			for (int j = 0; j < (5 - i); j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println("-----------------");

//		for (int i = 0; i < 5 ; i++) { // �� �ڵ�
//			for (int j = 5; j > 0; j--) {
//				System.out.print((j > i) ? "��" : " ");
//			}
//			System.out.println();
//		}

		// ��
		// ����
		// ������
		// ��������
		// ������������
		for (int i = 0; i < 5; i++) { // ����� �ڵ�
			for (int j = 0; j < 5; j++) {
				System.out.print((j > (3 - i)) ? "��" : "  ");
			}
			System.out.println();
		}
		System.out.println("-----------------");

		for (int i = 5; i > 0; i--) { // �� �ڵ�
			for (int j = 1; j < 6; j++) {
				System.out.print((j >= i) ? "��" : "  ");
			}
			System.out.println();
		}
		System.out.println("-----------------");

		// ��
		// ��
		// ��
		// ��
		// ��
		for (int i = 0; i < 5; i++) { // �����ڵ�
			for (int j = 0; j < 5; j++) {
				System.out.print((i == j) ? "��" : "  ");
			}
			System.out.println();
		}
		System.out.println("-----------------");

		for (int i = 0; i < 5; i++) { // ����� ���� �ڵ�. ������ ��� �ʿ�.
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			System.out.println("��");
		}
		System.out.println("-----------------");

		// �� 1
		// ���� 3
		// �������� 5
		// ������������ 7
		// ���������������������� 9
		// �����ڵ� : �˻�Ƚ�� ���� -> CPU�� ���� ���
		// �˻�Ƚ�� ����, ������ ��� -> RAM�� ���� ���
		String a = "";
		for (int i = 0; i < 5; i++) {
			a = (i % 2 == 1) ? "��" : "��"; // ���� �ڵ�. 2��° ��ƾ ���� ���� i���� Ȧ������ üũ
			for (int j = 0; j <= (i * 2); j++) {
				System.out.print(a);
			}
			System.out.println();
		}
		System.out.println("-------------------");

		String[] s = { "��", "��" }; // ���� ���� �ڵ�
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= (i * 2); j++) {
				System.out.print(s[i % 2]);
			}
			System.out.println();
		}
		System.out.println("-------------------");
	}
}
