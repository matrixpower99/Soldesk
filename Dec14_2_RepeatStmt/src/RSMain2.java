
public class RSMain2 {

	public static void main(String[] args) {
		// 1 + 2 + 3 + .... + 10 = ?

		// ctrl(left) + f11 : ����
		// f11  : debug -> f6 ������ ���پ� ���� ��� ����
		int sum = 0;
		for (int i = 1; i < 11; i++) { // break point
//			int a = 0; // �ݺ��� �ӿ��� ������ ����?
			sum += i;
		}
		System.out.println("�հ�: " + sum);
		System.out.println("------------------");

//		int b; // ������ �⺻�� �Ҵ����� �ʾ��� �� 
//		System.out.println(b); // �ڹٿ��� ������ �ʱⰪ�� �Ҵ����� �ʰ� ����ϸ� Error.
		// 5! = 1 * 2 * 3 * 4 * 5
		int fac = 1;
		for (int i = 2; i < 6; i++) {
			fac *= i;
		}
		System.out.println(fac);
		System.out.println("------------------");
		
		// 1 + 3 + 5 + 7 + 9 = ?
		int c = 1;
		for (int i = 3; i < 10; i +=2) {
			c += i;
		}
		System.out.println(c);
		System.out.println("------------------");
		
		// 1 - 2 + 3 - 4 + 5 - 6 + 7 = ?
		int d = 1;
		for (int i = 2; i < 8; i++) {
			if (i % 2 == 0) {
				d -= i;
			} else {
				d += i;
			}
		}
		System.out.println(d);
		System.out.println("------------------");
		
		// 1000 - (1+10+100) = ?
// �̷��� �ۼ��ϸ� �ȵǴ� ����
//		int e = 1000;
//		int f = 0;
//		for (int i = 1; i < 101; i *= 10) {
//			f += i;
//		}
//		int g = e- f;
//		System.out.println(g);
		int h = 1000 - (1 + 10 +100); // ȿ������ �߱�. ������ ���ؼ� �ڵ� �ۼ����� ����
		System.out.println("------------------");
	}
}
