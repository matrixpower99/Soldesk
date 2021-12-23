import java.util.Random;
import java.util.Scanner;

public class RSMain3 {

	public static void main(String[] args) {
		// 1 + 2 + 3 + .... + 7 = ?
		int sum = 0;
		for (int i = 1; i < 8; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("------------------");
		
		// 1 + 2 + 3 + .... + ? > 100
		// ?를 만족하는 최소값
		
		int count = 0, goal = 0;
		while(goal <= 100) {
			count++;
			goal += count;
			System.out.println("합계: " + goal + " 더하는 수: " + count);
		}
		System.out.println("조건만족 최소값:" + count);
		System.out.println("------------------");
		
		// 0 ~ 10 사이에 랜덤값 출력 계속
		// 랜덤값 4가 나오면 종료
		Random r = new Random();
		int rn = 0;
		System.out.println("랜덤값 4가 나오면 종료");
		while (rn != 4) {
			rn = (int)r.nextInt(11);
			System.out.println(rn);
		}
		System.out.println("------------------");
		
		// 콘솔 입력받기 유지("ㅃㅇ"라고 입력하면 그만)
		Scanner k = new Scanner(System.in);
		String uc = "";
		System.out.println("그만하려면 \"ㅃㅇ\" 입력");
		while (!uc.equals("ㅃㅇ")) {
			System.out.print("뭐: ");
			uc = k.next();
		}
		System.out.println("종료");
		System.out.println("------------------");
		
	}
}
// 개발자
//		프로젝트 -> 바쁨
//		안함 -> ???
// 잘 노는 것
// 문서작업(Office)
// 내것을 빨리 하고 사수일 도와주기



