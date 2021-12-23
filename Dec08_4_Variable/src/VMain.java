// CPU - 연산장치
// RAM - 변수형태로 임시로 저장되는 장치
// HDD(SSD) - 파일형태로 영구히 저장되는 장치

// 그래픽카드 - 그래픽 처리용(CPU+RAM+HDD)

// 변수(Variable)
//		what - 데이터 담는 그릇
//		when - 프로그램 진행 중에 발생한 데이터를 임시로 저장할 때

//		문법
//			자료형 변수명;

//		자료형 - 어떤 데이터를 담을건가(그릇종류)
//			정수
//				byte, short, 
//				int(-21억 ~ 21억 : 4bytes), - 주로 사용
//				long(? : 8bytes) - 21억보다 큰 숫자라면 그때 사용
//			실수
//				float, double - 주로 사용
//			글자
//				char(1글자), String(여러글자) - 주로 사용
//			논리
//				boolean
//			자리 차지[자료형을 반드시 써야하는데, 딱히 쓸건없는 상황]
//				void

//		변수명 - 그릇이름
//			마음대로
//			규칙
//				자바 문법-x
//				숫자로 시작-x
//			문화
//				뜻을 알아보기 편하게
//					낙타체, 뱀체
//				소문자로 시작
//				한글 자제

//	변수에 값 담기
//		변수명 = 값;

//		= : 우항에 있는걸 좌항에 넣어라

// 프로그래밍 언어들마다 기본자료형(아무런 처리안하고 데이터만 있을때 뭘로인식)이라는 개념이
//		java
//			정수 -> int		
//			실수 -> double

public class VMain {
	public static void main(String[] args) {
		// 본인의 발 사이즈
//		int footSize; // 변수 만들기
//		footSize = 265; // 만들어진 변수에 값 저장
		int footSize = 265; // 변수 만들고 값까지 저장
		
		// 집 어디
		String homeAddress = "분당";
		
		// 배고파요?
		boolean hungry = true;
		
		// 기온
		double temp = 8.64;
		
		// 사람 나이가 30살이라는 데이터가 생겼는데, 임시로 저장해야 할 상황
		int age;
		
		// 변수를 만들었으니 실제로 30을 저장해야하는 상황
		age = 30;
		
		// 컴퓨터가 800000원이라는 데이터가 생겼는데, 임시로 저장해야 할 상황
		int price;
		// 거기다 실제로 800000이라는 데이터를 저장
		price = 800000;
		
		// 사람 시력이 1.5
		double eye;
		eye = 1.5;
		
		float eye2;
		eye2 = 1.5f;
		
		// 웃음소리가 ㅋ를 저장
		char laugh;
		laugh = 'ㅋ';
		
		// 웃음소리가 ㅎㅎ를 저장
		String laugh2;
		laugh2 = "ㅎㅎ";
		
		// 점심시간에 pcr하러 가야하나 말아야하나
		boolean pcr;
		pcr = false;
	}	
}








