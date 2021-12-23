// 기술면접에 나온 내용 : Call by Value, Call by Reference[b, c] <- 주소 값(참조할 메모리 주소)

public class CBVCBRMain {
	public static void test(int a, int b[], int c[]) {
		System.out.println("a" + a);
		System.out.println("b[0]" + b[0]);
		System.out.println("c[0]" + c[0]);
		a = 100;
		b[0] = 200;
		c = new int[] { 400, 500 }; // 신규 배열이므로 기존의 c배열과 다른 지역변수로 새로 생성된다.
		System.out.println("a" + a);
		System.out.println("b[0]" + b[0]);
		System.out.println("c[0]" + c[0]);
	}

	public static void main(String[] args) {
		int a = 10;
		int[] b = { 20, 30 };
		int[] c = { 40, 50 };
		System.out.println("a" + a);
		System.out.println("b[0]" + b[0]);
		System.out.println("c[0]" + c[0]);
		test(a, b, c);
		System.out.println("a" + a);
		System.out.println("b[0]" + b[0]);
		System.out.println("c[0]" + c[0]);
	}
}
