// << Shift ������ (���)
// 		4 << 3
// 		4�� 2������ �ٲ㼭 : 100
//		�װ� 3�� �������� �а�, �� �ڸ��� 0���� ä���� : 100000
//		�װ� �ٽ� 10������ �ٲٸ�

// Ŀ�Ǽ�
//		24�ð� : 1 << 0 = 1
// 		�������� : 1 << 1 = 2
//		������ : 1 << 2 = 4
//		���� : 1 << 3 = 8
//
// A : 1 -> 24�ð�
// B : 6 -> 2+4 -> �������� + ������


public class OMain1 {

	public static void main(String[] args) {
		int option = 7;
		if (option >= (1 << 3)) {
			System.out.println("����");
			option -= (1 << 3); // option = option - 8;
		}
		
		if (option >= (1 << 2)) {
			System.out.println("������");
			option -= (1 << 2);
		}
		
		if (option >= (1 << 1)) {
			System.out.println("��������");
			option -= (1 << 1);
		}
		
		if (option >= (1 << 0)) {
			System.out.println("24�ð�");
//			option -= 1; // �������̶� �Ȼ��� ��� ����.
		}
	}

}
