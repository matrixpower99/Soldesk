
public class FMain3 {
	public static void test(int x, int y) {
//		int a = 40; // 다른 집(영역)의 그릇이라 중복되게 만들 수 있음. 지역변수
//		int b = 100;
		// 다른 영역의 함수값은 인자로 전달받아야 함.
		System.out.println(x);
		System.out.println(y);
		x = 3;
		y = 5;
		System.out.println(x);
		System.out.println(y);
		
		int z = x + y;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
//		int a = 10; // a라는 그릇을 만들어서 10을 담음
//		a = 20;		// a에 20을 담음
//		int a = 30; // 같은 영역에 같은 이름의 그릇을 다시 만들 수 없음.
//		System.out.println(b); // 같은 영역에 변수가 존재하지 않음. 다른 영역의 지역 변수를 호출할 수 없음. 
		int x = 100;
		int y = 50;
		System.out.println(x);
		System.out.println(y);
		test(x, y);
		System.out.println(x);
		System.out.println(y);
	}

}
