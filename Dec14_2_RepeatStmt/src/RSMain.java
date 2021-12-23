import java.util.Iterator;

// 반복분(Repeat Statement)
// 		300번 반복 -> 횟수가 매개 변수 
//		날씨가 다시 영하로 갈 때까지 반복 -> 조건이 매개 변수

// for 문 : 횟수가 명확할 때 사용

public class RSMain {

	public static void main(String[] args) {
		// ㅋ 출력 5번 반복
		for (int i = 0; i < 5; i++) {
			System.out.println("ㅋ");
		}
		System.out.println("----------");
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
//		for (변수만들기; 조건식; 변수 값 변화
		for (int a = 10; a <= 12; a++) {
			System.out.println(a);
		}
		System.out.println("------------");
		// 3, 4, 5, 6, 7까지 출력되도록
		for (int i = 3; i < 8; i++) { // i <=7 보다는 한자 덜 쓰므로 i < 8이 조금 낫다.
			System.out.println(i);
		}
		System.out.println("------------");
		// 2, 4, 6, 8, 10이 출력되도록
		for (int i = 2; i < 11; i += 2) {
			System.out.println(i);
		}
		System.out.println("------------");
		// 20, 19, 18, 17, 16까지 출력
		for (int i = 20; i > 15; i--) {
			System.out.println(i);
		}
		System.out.println("------------");
		// 27, 9, 3, 1 출력 되도록
		for (int i = 27; i > 0; i /= 3) { // 산술적인 머리가 필요. ㅠㅠ
			System.out.println(i);
		}
		System.out.println("------------");
		// 1, ㅋ, 3, ㅋ, 5, ㅋ
		for (int i = 1; i < 7; i++) {
			System.out.println((i % 2 == 0) ? "ㅋ" : i);
			//			if (i % 2 == 0) {
//				System.out.println("ㅋ");
//			} else {
//				System.out.println(i);
//			}
		}
		System.out.println("------------");
		// 1, 2, ㅋ, ㅋ
		for (int i = 1; i < 5; i++) {
			System.out.println((i > 2) ? "ㅋ" : i);
//			if (i < 3) {
//				System.out.println(i);
//			} else {
//				System.out.println("ㅋ");
//			}
		}
	}

}
