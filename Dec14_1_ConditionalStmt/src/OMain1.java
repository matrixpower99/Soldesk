// << Shift 연산자 (고급)
// 		4 << 3
// 		4를 2진수로 바꿔서 : 100
//		그걸 3번 왼쪽으로 밀고, 빈 자리는 0으로 채워서 : 100000
//		그걸 다시 10진수로 바꾸면

// 커피숍
//		24시간 : 1 << 0 = 1
// 		와이파이 : 1 << 1 = 2
//		주차장 : 1 << 2 = 4
//		흡연실 : 1 << 3 = 8
//
// A : 1 -> 24시간
// B : 6 -> 2+4 -> 와이파이 + 주차장


public class OMain1 {

	public static void main(String[] args) {
		int option = 7;
		if (option >= (1 << 3)) {
			System.out.println("흡연실");
			option -= (1 << 3); // option = option - 8;
		}
		
		if (option >= (1 << 2)) {
			System.out.println("주차장");
			option -= (1 << 2);
		}
		
		if (option >= (1 << 1)) {
			System.out.println("와이파이");
			option -= (1 << 1);
		}
		
		if (option >= (1 << 0)) {
			System.out.println("24시간");
//			option -= 1; // 마지막이라 안빼도 상관 없음.
		}
	}

}
