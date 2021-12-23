
public class RSMain2 {

	public static void main(String[] args) {
		// 1 + 2 + 3 + .... + 10 = ?

		// ctrl(left) + f11 : 실행
		// f11  : debug -> f6 누르면 한줄씩 다음 명령 실행
		int sum = 0;
		for (int i = 1; i < 11; i++) { // break point
//			int a = 0; // 반복문 속에서 변수를 만든?
			sum += i;
		}
		System.out.println("합계: " + sum);
		System.out.println("------------------");

//		int b; // 변수에 기본값 할당하지 않았을 때 
//		System.out.println(b); // 자바에서 변수에 초기값을 할당하지 않고 사용하면 Error.
		// 5! = 1 * 2 * 3 * 4 * 5
		int fac = 1;
		for (int i = 2; i < 6; i++) {
			fac *= i;
		}
		System.out.println(fac);
		System.out.println("------------------");
		
		// 1 + 3 + 5 + 7 + 9 = ?
		int c = 1;
		for (int i = 3; i < 10; i +=2) {
			c += i;
		}
		System.out.println(c);
		System.out.println("------------------");
		
		// 1 - 2 + 3 - 4 + 5 - 6 + 7 = ?
		int d = 1;
		for (int i = 2; i < 8; i++) {
			if (i % 2 == 0) {
				d -= i;
			} else {
				d += i;
			}
		}
		System.out.println(d);
		System.out.println("------------------");
		
		// 1000 - (1+10+100) = ?
// 이렇게 작성하면 안되는 예시
//		int e = 1000;
//		int f = 0;
//		for (int i = 1; i < 101; i *= 10) {
//			f += i;
//		}
//		int g = e- f;
//		System.out.println(g);
		int h = 1000 - (1 + 10 +100); // 효율성을 추구. 간지를 위해서 코드 작성하지 말자
		System.out.println("------------------");
	}
}
