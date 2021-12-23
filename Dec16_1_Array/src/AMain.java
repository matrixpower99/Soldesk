// 1) PP(Procedural Programming) -> 반복문, 조건문 적재적소에  -> 제발 완성시키자. 수학적 사고가 필요하다.
// 2) OOP(Object Oriented Programming) - 좀 더 유지보수에 용이하게
// 3) etc.(내장된 기능들 중에,쓸만한 것들) - 인생에 도움이 될 만한

// 변수
//		변수 1 : 값 1
//		기본형
//		참조형[객체]

// 배열(Array) -> List
// 		변수 1 : 값 .... n
// 		참조형[객체]
// 		배열은 한번 생성하면 크기(사이즈) 조절이 불가능하다.
//			생성할 때 사이즈 모르면?
//		복잡
//		소스만 봐서 내용 알기도 힘들고
//		-> 활용도 떨어짐. 수업은 하지만 매달리지 말자. 후반부에 주력인 List가 나옴.
public class AMain {

	public static void main(String[] args) {
//		 배열변수
//		 자료형[] 변수명; or 자료형[] 변수명 = {}; or 자료형 변수명[]; 
//		String s = new String("ㅋ"); // 원래 이렇게 쓰는게 Standard. 다만 축약해도 Java에서 인정해 준다.
		
		// 카페 계정 관리
//		String[] id = new String[30];

		// 배열 데이터 넣기(FM문법)
		int[] kor = new int[5]; // 몇 개의 원소(몇 칸 짜리)를 가지는 배열인지 선언하는 방법
		kor[0] = 90; // [칸번호] -> 칸번호=index
		kor[1] = 80;
		kor[2] = 70;
		kor[3] = 60;
		kor[4] = 50;
//		kor[5] = 10; // 배열 크기를 벗어난 할당은 Error.
		
		// 배열 데이터 넣기(1차 간소화된 문법)
		int[] eng = new int[] {100, 60, 50, 30, 10};
		
		// 수학 점수(2차 간소화된 문법) -> 자바 버전에 따라 지원하지 않을 수 있음.
		int[] math = {100, 90, 80, 70, 60};
		
		// 데이터 활용(index를 0부터 셈)
		System.out.println(math[1]);
		System.out.println("-------------");
		
		// 칸 수(배열의 원소 개수) -> 배열명.length
		System.out.println(eng.length);
		System.out.println("-------------");
		
		for (int i = 0; i < math.length; i++) { // 가장 가까이 있는 배열의 칸수를 조건에 자동으로 넣어줌
			System.out.println(math[i]);
		}
		System.out.println("-------------");
		
		
		
		
	}

}
