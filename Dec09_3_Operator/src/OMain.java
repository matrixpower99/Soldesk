import java.util.Scanner;

// 연산자(Operator) => stack영역 대상

//	대입연산자 =
//		우항에 있는걸 좌항에 넣어라
//		연산자라는것들중에 우선순위 꼴등

//	산술연산자 + - * / %
//	산술+대입연산자 += -= *= /= %=
//	증감연산자 ++ --
//	shift연산자 <<

//글자정렬 {
//	왼쪽	1
//	가운데	2
//	오른쪽	3
//}
//xxx.글자정렬 = 3
//xxx.글자정렬 = 2

//글자속성{
//	이탤릭	1<<0
//	굵게	1<<1
//	밑줄	1<<2
//}
//xxx.글자속성 = 1<<0
//xxx.글자속성 = 1<<1
//xxx.글자속성 = 이탤릭 + 굵게



public class OMain {
	public static void main(String[] args) {
		// 키보드 입력받을 준비
		Scanner k = new Scanner(System.in);

		// x값 입력받기(정수만 쓸거)
		System.out.print("x : ");
		int x = k.nextInt();

		// y값 입력받기(
		System.out.print("y : ");
		int y = k.nextInt();

		// 줄 치고, xy출력
		System.out.println("-----");
		System.out.printf("x는 %d, y는 %d\n", x, y);

		int a = x + y;
		int b = x - y;
		int c = x * y;
		int d = x / y;
		int e = x % y;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println("-----");

		String s = "ㅋ";
		String f = x + s; // 어떤데이터든지 + String -> 붙어서 String으로 나옴
		System.out.println(f);

		String s2 = "3";
		String g = x + s2;
		System.out.println(g);
		System.out.println("-----");

		int h = x / y;
		System.out.println(h);

		// int랑 int계산하면 결과는 int로 나옴
		// 둘중에 하나이상 double이어야 결과가 double로 나옴
		// x를 double로 바꾸고 싶음 : 형변환(casting)
		//	형변환이라는거 : java가 자동으로 해줌, eclipse가 도와줌
		
		// 개발자가 소수점을 살리고 싶은지, 죽이고 싶은지 판단 불가능
		double h2 = (double) x / y;
		System.out.println(h2);
		System.out.println("-----");
		
		// x값 3증가
		x += 3; // x = x + 3;
		System.out.println(x);
		
		// x값 2배로
		x *= 2; // x = x * 2;
		System.out.println(x);
		
		// y값 1감소
		// y = y - 1;
		// y -= 1;
		y--;
		System.out.println(y);
		
		// y값 반으로
		y /= 2; // y = y / 2;
		System.out.println(y);
		System.out.println("-----");

		
		
		
		// ?
		int i = 5 << 3;
		System.out.println(i);
	}
}







