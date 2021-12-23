import java.util.Scanner;

// �Լ� recursive ȣ�� :
//		�Լ��ӿ��� �ڱ��ڽ��� ȣ���ؼ�, �ݺ��� ���⵵�� �ϴ� ��ũ��

// �Լ��� ���� ����ϳ�? ���谡 ����� ����
// �Լ� :
// �ΰ�(������)�� ���� : �ҽ����� �������� -> ����
// 		��ǻ���� ���� : �Լ��� ã�ư��� �����ؾ� �ϴ�(jump) -> ������ -> ����
// 		��ü�Ҹ��� ���� �ִٸ� �Լ��� �Ⱦ��� ���� ����.
// -> ���, �ݺ� ���� : �ݺ������� �ذ��ϴ� ���� ����.
// -> recursive ��ũ������ ����ϸ� -> ������.

// -> ���ϴ� ���� ���ö����� �ݺ��ϴ� �뵵.
public class FMain5 {
	public static double getHeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("Ű: ");
		double uHeight = k.nextDouble();
		// while ������� �ʰ� 3�׿����ڷε� while ��ƾ�� ������ �� �ִ�.
		// Ű�� 1���� �۰ų� 300�� ������ ���Է� �䱸
		uHeight = (uHeight < 1 || uHeight > 300) ? getHeight() : uHeight;
		return uHeight;
	}

	public static int getAge() {
		Scanner k = new Scanner(System.in);
		System.out.print("����: ");
		int uAge = k.nextInt();
		// ���̰� 1�캸�� ���ų� 130���� ������ ���Է� �䱸 
		uAge = (uAge >= 0 && uAge <= 200 ) ? uAge : getAge();
		return uAge;
	}
	
	public static void printResult(double prtHeight, int prtAge) {
		System.out.println("-----------------");
		System.out.printf("Ű�� %.1fcm, ���̴� %d��\n", prtHeight, prtAge);
		
	}
	public static void main(String[] args) {
		// ��ȯ�� Ű�� ���̸� ���
		double height = getHeight();
		int age = getAge();
		printResult(height, age);
	}

}
