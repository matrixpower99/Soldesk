import java.util.Random;
import java.util.Scanner;
// 0 ~ 1000���̱��� �� �̾Ƴ���

// ���� ���ö����� ���
// �� �Է�
// ����

// ���� ������ �� ������ �����ΰ� ���

public class RSMain6 {
	public static int think() {
		return new Random().nextInt(1001);
	}
	
	public static int say() {
		Scanner k = new Scanner(System.in);
		System.out.print("��: ");
		int userAns = k.nextInt();
		return (userAns >=0 && userAns <= 1000) ? userAns : say();
	}
	
	public static boolean judge(int ga, int ua, int t) {
		if (ga < ua) { // ����� �ڵ�
			System.out.println("DOWN");
		} else if (ga > ua) {
			System.out.println("UP");
		} else {
			System.out.printf("%d�ϸ��� ����", t);
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// a == true : (== true) ��������
		// a == false : !a
		int gameAns = think();
//		System.out.println(gameAns);
		int userAns = 0;
		for (int turn = 0; true; turn++) { // �����ũ��. for�� while�� mix�ؼ� �� ����
			userAns = say();
			if (!judge(gameAns, userAns, turn)) {
				break;
			}
		}
		
//		while (true) { // ó���� ���ǽ� ���Ⱑ �ָ��ϱ� ������ true�� �����ְ� ����
//			System.out.print("��: ");
//			un = k.nextInt();
//			count++;
//			if (cn == un) {
//				break;
//			}
//			System.out.println((un < cn) ? "DOWN" : "UP");
//			System.out.println("-----------------");
//			
////			}
//		}
//		System.out.println(count + "������ ����");		
	}

}
