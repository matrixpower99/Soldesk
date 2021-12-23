import java.util.Random;
import java.util.Scanner;

// 홀짝게임 (강사님 소스 비교용)
// 차이점 : 내 코드는 문자열로 바로 비교하지 않고 불필요하게 내 수를 1, 2로 변환하여 각 수일 때마다 비교하였음.

public class FMain7_1 {

	public static int shake(int a) {
		Random r = new Random();
		return r.nextInt(a) + 1;
	}

	public static String say() {
		Scanner k = new Scanner(System.in);
		System.out.print("뭐(홀/짝) : ");
		String ans = k.next();
		return (ans.equals("홀") || ans.equals("짝") ) ? ans : say();
	}

	public static String getOddEven(int n) {
		return (n %2 == 0) ? "짝" : "홀";
	}
	
	public static String judge(String ma, String ga) {
		return ma.equals(ga) ? "정답" : "오답";
	}
	
	public static void printResult(int ch, String ga, String r) {
		System.out.printf("컴퓨터가 %d개 쥐고 있으니 %s\n", ch, ga);
		System.out.println(r);
	}
	
	public static void main(String[] args) {
		// 총 돌 갯수 : 10
		// 컴퓨터가 10개 쥐고 흔들다가 몇 개 손에 쥐고 -> 1 ~ 10 사이
		int max = 10;
		int comHand = shake(max);
		String myAns = say();
		String gameAns = getOddEven(comHand);
		String result = judge(myAns, gameAns);
		printResult(comHand, gameAns, result);

	}
}
