import java.util.Arrays;
import java.util.Random;

// 로또 번호 자동 생성기
//		1 ~ 45사이의 랜덤함 숫자 6개 출력
//		중복이 안떠야
//		정렬해서
// Java에 중복체크하는 기능이 있음
// Part1 : PP -> 조건문, 반복문, 배열, 연산자
// Part2 : 
public class PMain4 {
	public static int pick(int no, int[] ar) {
		int n = new Random().nextInt(45) + 1;
		for (int i = 0; i < no; i++) {
			if (n == ar[i]) {
				return pick(no, ar);
			}
		}
		return n;		
	}
	
	public static void main(String[] args) {
		int[] lotto = new int[6];
		for (int i = 0; i < 6; i++) {
			lotto[i] = pick(i, lotto);
		}
		
		Arrays.sort(lotto);

		for (int i : lotto) {
			System.out.print(i + " ");
		}
	}
}