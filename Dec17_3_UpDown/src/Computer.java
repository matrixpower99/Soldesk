import java.util.Random;

// 멤버변수 : 객체의 속성(그 객체를 소개할 때 말할만한 것)
// 지역변수 : 메소드 사용하는 동안만 의미있는 임시데이터
// 메소드 파라메터 : 그 메소드 수행하려면 필요한 재료
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
		System.out.println(t + "턴만에 정답");
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
		System.out.print("뭐: ");
		return u.tell();
	}

	public boolean judge(int ga, int ua) {
		if (ga == ua) {
			System.out.println("정답");
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
//			System.out.println(u.turn + "턴만에 정답");
//			endGame = true;
//		} 
