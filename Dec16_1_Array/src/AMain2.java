// 여기까지 파트 1 끝.
public class AMain2 {

	public static void main(String[] args) {
		// 국, 영, 수
		// 2차원 배열 이상은 사용하지 않는게 좋다. 복잡하고 현재 실정에 맞지도 않는다.
		// List + 객체로 주로 사용한다. 컬렉션
		int[][] score = { { 100, 90, 50 }, { 60, 80, 70 }, { 88, 66, 11 } };
		System.out.println(score[0]);
		System.out.println(score[0][1]);

		// 3번재 학생의 국어점수
		System.out.println(score[2][0]);
		System.out.println("--------------");

		for (int i = 0; i < score.length; i++) {
			int[] s = score[i];
			for (int j = 0; j < s.length; j++) {
				System.out.println(s[j]);
			} 
		}
		System.out.println("--------------");
		
		for (int[] s : score) {
			for (int i : s) {
				System.out.println(i);
			}
		}
		
	}

}
