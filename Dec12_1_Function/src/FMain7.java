import java.util.Random;
import java.util.Scanner;

// Ȧ¦����

public class FMain7 {
	public static int getRandom(int x) {
		// ���� ���� �غ�
		Random r = new Random();
		return r.nextInt(x) + 1; // ���� �Լ��� 0~n-1������ ������ �߻���Ű�Ƿ� 1~n���� �߻���Ű�� ���� +1 
	}
	
	public static String getUchar() {
		Scanner k = new Scanner(System.in);
		System.out.print("��(Ȧ/¦) : ");
		String a = k.next();
		return (a.equals("Ȧ") || a.equals("¦") ) ? a : getUchar();
	}
	
	public static String getOE(int un, int rn) {
		return ((un == 2 && rn % 2 != 0) || (un == 1 && rn %2 != 1)) ? "��" : "����";
	}
	
	public static void printReport(String a, int b) {
		System.out.printf("��ǻ�� : %s\n", b);
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// �� �� ���� : 10
		// ��ǻ�Ͱ� 10�� ��� ��鰡�� �� �� �տ� ���
		int max = 10;
		int rNum = getRandom(max);
		
		// ���� -> ���
		String uc = getUchar();
				
		// ����
		int uNum = (uc.equals("Ȧ")) ? 1 : 2;
//		System.out.println(uNum);
		String result = getOE(uNum, rNum);
		printReport(result, rNum);
	}
}
