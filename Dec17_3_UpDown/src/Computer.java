import java.util.Random;

// ������� : ��ü�� �Ӽ�(�� ��ü�� �Ұ��� �� ���Ҹ��� ��)
// �������� : �޼ҵ� ����ϴ� ���ȸ� �ǹ��ִ� �ӽõ�����
// �޼ҵ� �Ķ���� : �� �޼ҵ� �����Ϸ��� �ʿ��� ���
public class Computer {
	Random brain = new Random();
//	int cNum;
//	boolean endGame = false;

	public void start(User u) {
		int gameAns = thinkAns();
		int userAns = 0;
		for (int turn = 1; true; turn++) {
			userAns = ask(u);
			if (judge(gameAns, userAns)) {
				tellResult(turn);
				break;
			}
		}
	}

	public void tellResult(int t) {
		System.out.println(t + "�ϸ��� ����");
	}
//		for (u.turn = 0; true ; u.turn++) {
//			ask(u);
//			judge(u);
//			if (endGame) {
//				break;
//			}
//		}

	public int thinkAns() {
		return brain.nextInt(1001);
		// cNum = new Random().nextInt(1000) + 1;
	}

	public int ask(User u) {
		System.out.print("��: ");
		return u.tell();
	}

	public boolean judge(int ga, int ua) {
		if (ga == ua) {
			System.out.println("����");
			return true;
		} else if (ga > ua) {
			System.out.println("UP");
		} else {
			System.out.println("DOWN");
		}
		return false;
	}
}
	// if (cNum < u.uNum) {
//			System.out.println("DOWN");
//		} else if (cNum > u.uNum) {
//			System.out.println("UP");
//		} else {
//			System.out.println(u.turn + "�ϸ��� ����");
//			endGame = true;
//		} 
