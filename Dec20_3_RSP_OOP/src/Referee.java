
public class Referee {
	static String[] ruleBook = { null, "����", "����", "��" }; // 1���� 2���� 3��
	// int win; -> ������ ������ ���ھ �����Ѵٴ� ����.
	public static void start() {
		Computer c = callCom();
		User u = callUser();
		readRuleBook();
		// �� ������ �ݺ�
		// 
		int userHand = 0, comHand = 0;
		while (true) {
			userHand = userFire(u);
			comHand = comFire(c);
			tellHand(userHand, comHand);
			if (!judge(userHand, comHand, u)) {
				break;
			}
		}
		tellResult(u);
	}

	public static void tellResult(User u) {
		System.out.println(u.win + "����");
	}
	
	public static int userFire(User u) {
		System.out.print("��: ");
		int uh = u.fire();
//		return (uh > 3 || uh < 1) ? userFire(u) : uh; // �� �ڵ�
		return (uh > 0 && uh < 4) ? uh : userFire(u);
	}

	public static int comFire(Computer c) {
		return c.fire();
	}

	public static User callUser() {
		return new User();
	}

	public static Computer callCom() {
		return new Computer();
	}

	public static void tellHand(int uh, int ch) {
		System.out.println("���� : " + ruleBook[uh]);
		System.out.println("��ǻ��: " + ruleBook[ch]);
	}

	public static boolean judge(int ch, int uh, User u) {
		int t = uh - ch;
		if (t == 0) {
			System.out.println("���º�");
		} else if (t == -1 || t == 2) {
			System.out.println("�й�");
			return false;
		} else {
			System.out.println("�¸�");
			u.win++;
		}
		System.out.println("------------------");
		return true;
	}

	public static void readRuleBook() {
		System.out.println("---------------");
		for (int i = 1; i < ruleBook.length; i++) {
			System.out.printf("%d: %s\n", i, ruleBook[i]);
		}
		System.out.println("---------------");
	}
}
