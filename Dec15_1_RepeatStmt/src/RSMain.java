
public class RSMain {

	public static void main(String[] args) {
		int a= 0;
		for (int i = 1; i < 10; i++) {
			// �ݺ��� ���ο� ���� �ʱ�ȭ �������� ����.
			// ������ ��ȸ������ �����̸� ������ ���� �������. ȿ����, ���Ἲ.
			System.out.printf("2 x %d = %d\n", i, 2 * i);
		}
		System.out.println("---------");

		// 2 ~ 9�ܱ���
		for (int dan = 2; dan < 10; dan++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %2d\n", dan, j, dan * j);
			}
		}
		System.out.println("-------------");
		
		// 2 ~ 9�� ����
		// 2 x 1 = 2	3 x 1 = 3 .... 9 x 1 = 9
		// 2 x 2 = 4 ....
		// ...
		// 2 x 9 = 18 				   9 x 9 = 81
		for (int i = 1; i < 10; i++) {
			for (int dan = 2; dan < 10; dan++) {
				System.out.printf("%d x %d = %2d\t", dan, i, dan * i);
			}
			System.out.println();
		}
		System.out.println("---------------------------");
		
		
	}

}
