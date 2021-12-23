import java.util.Scanner;

public class CSMain2 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		// 자바 문법은 변수명으로 쓸 수 없다. _mid, _final 등 편법으로 사용 가능
		System.out.print("중간고사: ");
		int mExam = k.nextInt();

		System.out.print("기말고사: ");
		int fExam = k.nextInt();

		System.out.println("-------------");
		double avg = (double) (mExam + fExam) / 2;
		System.out.printf("평균 : %.1f점\n", avg);

		// 성적 : 수우미양가로 분류
		// if (조건식 A) {
		//		조건식 A를 만족시켰으면 여기를 실행
		// } else if (조건식 B) {
		//		조건식 A는 땡, 조건식 B는 만족시 여기를 실행
		// } else if (조건식 C) {
		//		조건식 A/B 둘다 땡, 조건식 C는 만족
		// } ...
		// else {
		//		위에 만족하는거 하나도 없으면 여기 실행
		// }
		
		// 점수 >= 90 : 수
		// 80 <= 점수 < 90 : 우 // 문서 해독을 잘해야 함.
		// 별도 if 나열은 어느 상황에서 사용할까?에 대해서 생각해 볼 것.
		// else if로 묶는것을 권장.(무조건 x)
		
		if (avg >= 90) {
			System.out.println("수");
		} else if (avg >= 80) {
			System.out.println("우");
		} else if (avg >= 70) {
			System.out.println("미");
		} else if (avg >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
	}
}
