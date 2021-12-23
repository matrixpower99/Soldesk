// 별찍기

public class RSMain2 {
	public static void main(String[] args) {
		// ㅋㅋㅋㅋㅋ
		// ㅋㅋㅋㅋㅋ
		// ㅋㅋㅋㅋㅋ
		// ㅋㅋㅋㅋㅋ
		// ㅋㅋㅋㅋㅋ
		for (int x = 0; x < 5; x++) { // 행
			for (int y = 0; y < 5; y++) { // 열
				System.out.print("ㅋ");
			}
			System.out.println();
		}
		System.out.println("-----------------");

		// ㅋ
		// ㅋㅋ
		// ㅋㅋㅋ
		// ㅋㅋㅋㅋ
		// ㅋㅋㅋㅋㅋ
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) { // 또는 j < i +1로 조건을 줄 수 있으나 j <= i가 더 간결한 코드
				System.out.print("ㅋ");
			}
			System.out.println();
		}
		System.out.println("-----------------");

		// ㅋㅋㅋㅋㅋ
		// ㅋㅋㅋㅋ
		// ㅋㅋㅋ
		// ㅋㅋ
		// ㅋ
		for (int i = 0; i < 5; i++) { // 모범답안
			for (int j = 0; j < (5 - i); j++) {
				System.out.print("ㅋ");
			}
			System.out.println();
		}
		System.out.println("-----------------");

//		for (int i = 0; i < 5 ; i++) { // 내 코드
//			for (int j = 5; j > 0; j--) {
//				System.out.print((j > i) ? "ㅋ" : " ");
//			}
//			System.out.println();
//		}

		// ㅋ
		// ㅋㅋ
		// ㅋㅋㅋ
		// ㅋㅋㅋㅋ
		// ㅋㅋㅋㅋㅋㅋ
		for (int i = 0; i < 5; i++) { // 강사님 코드
			for (int j = 0; j < 5; j++) {
				System.out.print((j > (3 - i)) ? "ㅋ" : "  ");
			}
			System.out.println();
		}
		System.out.println("-----------------");

		for (int i = 5; i > 0; i--) { // 내 코드
			for (int j = 1; j < 6; j++) {
				System.out.print((j >= i) ? "ㅋ" : "  ");
			}
			System.out.println();
		}
		System.out.println("-----------------");

		// ㅋ
		// ㅋ
		// ㅋ
		// ㅋ
		// ㅋ
		for (int i = 0; i < 5; i++) { // 최초코드
			for (int j = 0; j < 5; j++) {
				System.out.print((i == j) ? "ㅋ" : "  ");
			}
			System.out.println();
		}
		System.out.println("-----------------");

		for (int i = 0; i < 5; i++) { // 강사님 수정 코드. 수학적 사고가 필요.
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			System.out.println("ㅋ");
		}
		System.out.println("-----------------");

		// ㅋ 1
		// ㅎㅎ 3
		// ㅋㅋㅋㅋ 5
		// ㅎㅎㅎㅎㅎㅎ 7
		// ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ 9
		// 최초코드 : 검사횟수 많음 -> CPU를 많이 사용
		// 검사횟수 감소, 변수를 사용 -> RAM을 많이 사용
		String a = "";
		for (int i = 0; i < 5; i++) {
			a = (i % 2 == 1) ? "ㅎ" : "ㅋ"; // 수정 코드. 2번째 루틴 돌기 전에 i값이 홀수인지 체크
			for (int j = 0; j <= (i * 2); j++) {
				System.out.print(a);
			}
			System.out.println();
		}
		System.out.println("-------------------");

		String[] s = { "ㅋ", "ㅎ" }; // 최종 수정 코드
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= (i * 2); j++) {
				System.out.print(s[i % 2]);
			}
			System.out.println();
		}
		System.out.println("-------------------");
	}
}
