import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
// ���� ���� �� �˰���
//    ���� ���� �� 
// ��   1  2  3
// ��   1  2  3
// ��=�� = 0 -> ���º�
// ��-�� = -1 -> ��
// ��-�� = 2 -> ��
// ������ -> ��

// ����,����,�� 1=���� 2=���� 3=��
// ���� �� ������ �ݺ�, �� ���� �ߴ��� ǥ��

public class RSMain7 {

	public static int getUser() {
		Scanner k = new Scanner(System.in);
		System.out.print("��: ");
		int a = k.nextInt();
		return (a > 3 || a < 1) ? getUser() : a;
	}

	public static int getCom() {
		return new Random().nextInt(3) + 1;
	}

	public static String convert(int h) {
		return (h == 1) ? "����" : (h == 2) ? "����" : "��"; // ���� �ڵ�
	}

	public static void printHelp() {
		for (int i = 1; i < 4; i++) {
			System.out.printf("%d.%s\n", i, convert(i));
		}
		System.out.println("-------");
	}

	public static void printHand(int uh, int ch) {
		System.out.printf("��: %s\n", convert(uh));
		System.out.printf("��: %s\n", convert(ch));
	}

	public static int getJudge(int uh, int ch) {
		int game = uh - ch;
		if (game == 0) {
			System.out.println("���º�");
			return 0;
		} else if (game == -1 || game == 2) {
			System.out.println("�й�");
			return -175937;
		} else {
			System.out.println("�¸�");
			return 1;
		}
	}
	
	public static void printResult(int x) {
		System.out.println("-------");
		System.out.println(x + "����");
	}

	public static void main(String[] args) {
		printHelp();
		int win = 0, t = 0; // win=�¸��� ���� ��, t=�������� ����
		while (true) {
			int un = getUser(); // ������� �Է� �ޱ�
			int cn = getCom(); // ��ǻ���� �� ����
			printHand(un, cn); 

			t = getJudge(un, cn);
			if (t < 0) {
				break;
			}
			win += t; // ���� 0, �̱�� 1�� ��������. ���̵���� ����.
			System.out.println("-------");
		}
		printResult(win);
	}

}

// ���ǹ�
// �ݺ���
// �迭 - ��Ʈ1�� ������

// �� ���� Ư¡
