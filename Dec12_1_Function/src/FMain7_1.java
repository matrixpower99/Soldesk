import java.util.Random;
import java.util.Scanner;

// Ȧ¦���� (����� �ҽ� �񱳿�)
// ������ : �� �ڵ�� ���ڿ��� �ٷ� ������ �ʰ� ���ʿ��ϰ� �� ���� 1, 2�� ��ȯ�Ͽ� �� ���� ������ ���Ͽ���.

public class FMain7_1 {

	public static int shake(int a) {
		Random r = new Random();
		return r.nextInt(a) + 1;
	}

	public static String say() {
		Scanner k = new Scanner(System.in);
		System.out.print("��(Ȧ/¦) : ");
		String ans = k.next();
		return (ans.equals("Ȧ") || ans.equals("¦") ) ? ans : say();
	}

	public static String getOddEven(int n) {
		return (n %2 == 0) ? "¦" : "Ȧ";
	}
	
	public static String judge(String ma, String ga) {
		return ma.equals(ga) ? "����" : "����";
	}
	
	public static void printResult(int ch, String ga, String r) {
		System.out.printf("��ǻ�Ͱ� %d�� ��� ������ %s\n", ch, ga);
		System.out.println(r);
	}
	
	public static void main(String[] args) {
		// �� �� ���� : 10
		// ��ǻ�Ͱ� 10�� ��� ���ٰ� �� �� �տ� ��� -> 1 ~ 10 ����
		int max = 10;
		int comHand = shake(max);
		String myAns = say();
		String gameAns = getOddEven(comHand);
		String result = judge(myAns, gameAns);
		printResult(comHand, gameAns, result);

	}
}
