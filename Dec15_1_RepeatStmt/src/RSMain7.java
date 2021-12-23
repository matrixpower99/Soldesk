import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
// 가위 바위 보 알고리즘
//    가위 바위 보 
// 나   1  2  3
// 컴   1  2  3
// 나=컴 = 0 -> 무승부
// 나-컴 = -1 -> 패
// 나-컴 = 2 -> 패
// 나머지 -> 승

// 가위,바위,보 1=가위 2=바위 3=보
// 내가 질 때까지 반복, 몇 연승 했는지 표시

public class RSMain7 {

	public static int getUser() {
		Scanner k = new Scanner(System.in);
		System.out.print("뭐: ");
		int a = k.nextInt();
		return (a > 3 || a < 1) ? getUser() : a;
	}

	public static int getCom() {
		return new Random().nextInt(3) + 1;
	}

	public static String convert(int h) {
		return (h == 1) ? "가위" : (h == 2) ? "바위" : "보"; // 수정 코드
	}

	public static void printHelp() {
		for (int i = 1; i < 4; i++) {
			System.out.printf("%d.%s\n", i, convert(i));
		}
		System.out.println("-------");
	}

	public static void printHand(int uh, int ch) {
		System.out.printf("나: %s\n", convert(uh));
		System.out.printf("컴: %s\n", convert(ch));
	}

	public static int getJudge(int uh, int ch) {
		int game = uh - ch;
		if (game == 0) {
			System.out.println("무승부");
			return 0;
		} else if (game == -1 || game == 2) {
			System.out.println("패배");
			return -175937;
		} else {
			System.out.println("승리");
			return 1;
		}
	}
	
	public static void printResult(int x) {
		System.out.println("-------");
		System.out.println(x + "연승");
	}

	public static void main(String[] args) {
		printHelp();
		int win = 0, t = 0; // win=승리한 게임 수, t=게임판정 변수
		while (true) {
			int un = getUser(); // 사용자의 입력 받기
			int cn = getCom(); // 컴퓨터의 수 저장
			printHand(un, cn); 

			t = getJudge(un, cn);
			if (t < 0) {
				break;
			}
			win += t; // 비기면 0, 이기면 1이 더해진다. 아이디어의 문제.
			System.out.println("-------");
		}
		printResult(win);
	}

}

// 조건문
// 반복문
// 배열 - 파트1의 마지막

// 그 언어만의 특징
