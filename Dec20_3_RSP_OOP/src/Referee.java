
public class Referee {
	static String[] ruleBook = { null, "가위", "바위", "보" }; // 1가위 2바위 3보
	// int win; -> 심판이 오늘의 스코어를 보고한다는 느낌.
	public static void start() {
		Computer c = callCom();
		User u = callUser();
		readRuleBook();
		// 질 때까지 반복
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
		System.out.println(u.win + "연승");
	}
	
	public static int userFire(User u) {
		System.out.print("뭐: ");
		int uh = u.fire();
//		return (uh > 3 || uh < 1) ? userFire(u) : uh; // 내 코드
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
		System.out.println("유저 : " + ruleBook[uh]);
		System.out.println("컴퓨터: " + ruleBook[ch]);
	}

	public static boolean judge(int ch, int uh, User u) {
		int t = uh - ch;
		if (t == 0) {
			System.out.println("무승부");
		} else if (t == -1 || t == 2) {
			System.out.println("패배");
			return false;
		} else {
			System.out.println("승리");
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
