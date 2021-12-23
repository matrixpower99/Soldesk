import java.util.Random;
import java.util.Scanner;
// 0 ~ 1000사이까지 답 뽑아놓기

// 정답 나올때까지 계속
// 답 입력
// 판정

// 정답 나오면 몇 번만에 정답인가 출력

public class RSMain6 {
	public static int think() {
		return new Random().nextInt(1001);
	}
	
	public static int say() {
		Scanner k = new Scanner(System.in);
		System.out.print("뭐: ");
		int userAns = k.nextInt();
		return (userAns >=0 && userAns <= 1000) ? userAns : say();
	}
	
	public static boolean judge(int ga, int ua, int t) {
		if (ga < ua) { // 강사님 코드
			System.out.println("DOWN");
		} else if (ga > ua) {
			System.out.println("UP");
		} else {
			System.out.printf("%d턴만에 정답", t);
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// a == true : (== true) 생략가능
		// a == false : !a
		int gameAns = think();
//		System.out.println(gameAns);
		int userAns = 0;
		for (int turn = 0; true; turn++) { // 고급테크닉. for와 while을 mix해서 쓴 느낌
			userAns = say();
			if (!judge(gameAns, userAns, turn)) {
				break;
			}
		}
		
//		while (true) { // 처음에 조건식 쓰기가 애매하기 때문에 true로 정해주고 시작
//			System.out.print("뭐: ");
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
//		System.out.println(count + "번만에 정답");		
	}

}
