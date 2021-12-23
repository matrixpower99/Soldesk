import java.util.Random;
import java.util.Scanner;

// 반복문 제어
// for & while 공용
// 		break - 반복문 끝
// 		continue - 강제반복(턴종료)
//		가장 가까이 있는 반복문과 짝
public class RSMain4 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
//				break;
				continue; // 12번줄까지 실행하고 7번라인으로 가야하나 continue 만나면 바로 7번으로 jump
			}
			System.out.println(i);
		}
		System.out.println("-----------------------");

		// 0 ~ 10사이의 랜덤값 계속 출력(4가 뜨면 그만)
		Random r = new Random();
		int a = 0;
		while (true) {
			a = r.nextInt(11);
			System.out.println(a);
			if (a == 4) {
				break;
			}
		}
		System.out.println("4가 나와 종료");
		System.out.println("-----------------------");

		// 콘솔 입력받기 유지("ㅃㅇ"라고 입력하면 그만)
		Scanner k = new Scanner(System.in);
		String s = null; // s = "";
		System.out.println("그만하려면 \"ㅃㅇ\" 입력");

		while (true) {
			System.out.print("뭐: ");
			s = k.next();
			if (s.equals("ㅃㅇ")) {
				break;
			}
		}
		System.out.println(s + " 입력되어 종료");
		System.out.println("------------------");
		
		// i = 2일 때 for문 중단. 
		a : for (int i = 0; i < 10; i++) { // 반복문에는 이름을 붙일 수 있다.
			b: switch (i) {
			case 2:
				System.out.println("ㅋ");
				// 어디의 브레이크? switch or for, 이클립스가 힌트를 줌
				break a; // 의 루프를 탈출
				
			default:
				System.out.println("i");
				break;
			}
		}
		System.out.println("------------------");
		
		// Java 1.5에서 추가된 기능
		iFor: for (int i = 0; i < 10; i++) {
			jFor: for (int j = 0; j < 10; j++) {
				System.out.printf("%d %d\n", i, j);
				if (j == 1) {
//					break; // 가장 가까이 있는 j를 탈출하는 break
					break iFor; // 이렇게 이름을 지정해서 제어할 수 있다. Java에만 있는 문법
				}
			}
			
		}
		// 수강생 네트워크 : 한 사람이 좋은 회사 가서 끌어줄 수 있다.
		
	}
}
