import java.util.Scanner;
// 함수 overloading
// 		함수명도 중복되면 안됨
//		파라메터 갯수나 자료형이 다르면 허용(호출할 때 구별이 가능하므로)

public class FMain4 {
	
	// 정수를 2개 넣으면 더 큰 수를 출력 하는 함수
	public static void printBigger(int x, int y) {
		// 아이디어(센스)의 영역
		int bigger = (x > y) ? x : y;
		System.out.printf("%d와 %d중 큰 수는 %d 입니다.\n", x, y, bigger);
	}
		
	// 정수를 3개 넣으면 더 큰 수를 출력 하는 함수
	
//	public static void printBigger(int x, int y, int z) { // 전달받는 인자가 다르면 사용 가능
	public static void printBigger(int x, int y, int z) {
		int bigger = (x > y) ? x : y;
		bigger = (bigger > z) ? bigger : z;
//		System.out.println(bigger);
		System.out.printf("%d, %d, %d 중 큰 수는 %d 입니다.\n", x, y, z, bigger);
	}
	public static void main(String[] args) {
//		Scanner k = new Scanner(System.in);
//		
//		System.out.print("정수 2개를 입력: ");
//		int a = k.nextInt();
//		int b = k.nextInt();
//		
//		printBigger(a, b);
		printBigger(10, 3);
		printBigger(1000, 111111);
		printBigger(12,13, 66);
		printBigger(1000, 111111, 22222);
	}

}
