import java.util.Scanner;

// 논리연산자 -> 결과가 boolean으로 나오는
//		>		>=		==		!=		<=		<
//		초과	이상	같다	다르다	이하	미만

// 논리결합연산자
//		||, |			&&, &		^
//		~거나/or		~고/and		xor

//		!
//		반대/not

public class OMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = k.next();
		
		System.out.print("키 : ");
		double height = k.nextDouble();
		
		System.out.print("나이 : ");
		int age = k.nextInt();
		
		System.out.println("-----");
		System.out.printf("키는 %.0fcm, 나이는 %d살\n", height, age);
		
		// 키가 150넘어야 탈 수 있다
		boolean a = height > 150;
		System.out.println(a);
		
		// 나이가 10살 이상이어야만 탈 수 있다
		boolean b = (age >= 10);
		System.out.println(b);
		
		// 나이가 3살만 탈 수 있다
		boolean c = (age == 3); 
		System.out.println(c);
		
		// 키가 140이 아니어야만 탈 수 있는
		boolean d = (height != 140); 
		System.out.println(d);
		
		// 이름이 홍길동만 탈 수 있는
		boolean e = (name == "홍길동"); // (#7 == "홍길동") -> ?????
		System.out.println(e);
		
		boolean e2 = name.equals("홍길동"); // 글자 내용
		System.out.println(e2);
		
		// 나이가 5살 이상이거나, 키가 130 이상이면 ok
		// OR
		//		O O -> O
		//		O X -> O
		//		X O -> O
		//		X X -> X
		boolean f = (age >= 5) || (height >= 130);
		System.out.println(f);
		
		// 나이가 10살 이상이고, 키도 150 이상이어야 ok		
		boolean g = (age >= 10) && (height >= 150);
		System.out.println(g);
		
		// 나이가 5살 이상이든지 키가 130이상이든지 하나만
		// eXclusive OR
		// O O -> X
		// O X -> O
		// X O -> O
		// X X -> X
		boolean h = (age >= 5) ^ (height >= 130);
		System.out.println(h);
		
		// h탈수있는 사람 못타, h못타는 사람만 타
		boolean i = !h;
		System.out.println(i);
	}
}






