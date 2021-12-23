
public class RepeatStmtMain {
	public static void main(String[] args) {
		String[] name = {"홍길동", "김길동", "최길동"};
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		System.out.println("---------------");
		
		for (int i = 0; i < name.length; i++) {
			String t = name[i]; // 임시 변수에 담은 후 그 변수를 출력할 수 있지만 추천하지 않음.
			System.out.println(t);
		}
		System.out.println("---------------");
		
		// for-each문이라고 부름. 신형(1.5때 추가)
		//		배열 차례대로 탐색 시 간단하게 써먹기 좋음
		// 		순서 조절이 불가능하여 다양하게 활용하기 어려움. 순차적 출력만 가능
		// for (자료형 변수명 : 배열명){}
		for (String t : name) { 
			System.out.println(t);
		}
		System.out.println("---------------");
	
		int[] kor = {90, 50, 100, 56, 12, 45, 21, 45, 11, 78};
		// 국어점수평균
		int sum = 0;
		for (int i : kor) {
			sum += i;
		}
		System.out.println("평균 : " + (double)sum / kor.length);
		
		
	}
}
