import java.util.Random;
import java.util.Scanner;

// A : 백지상태에서 만들일은 거의 없음
public class OMain4 {
	public static void main(String[] args) {
		// 홀수만 나오는 랜덤 구현
		Random r = new Random();
		int x = r.nextInt(1000);
		System.out.println(x);
		System.out.println("-----------------");
		
		MyRandom mr = new MyRandom();
		int y = mr.nextInt(10);
		System.out.println(y);
		
		// 입력 받을 때 자동으로 "뭐: " 출력 Scanner
		
	}
}
