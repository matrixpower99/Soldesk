// 조건문
// 반복문
// 배열
// 특징 -> 자기가 작업한거 공유
// 		남이 작업해서 공유해준거 잘쓰기
public class OMain {
	public static void main(String[] args) {
		// 책 판매 -> 삼국지, 만원, 나관중
		Book b = new Book("삼국지", 10000, "나관중");
		b.print(); // 정보출력
		System.out.println("-----------------");
		
		// 요구르트, 엔요, 천원, 유통기한 2021-12-23까지
		Yogurt y = new Yogurt("엔요", 1000, "2021-12-23");
		y.print(); // 정보출력
		System.out.println("-----------------");
		
		// 컵, 가나다컵, 3천원
		Cup c = new Cup("가나다컵", 3000);
		c.print(); // 정보출력
		System.out.println("-----------------");
		
		// 콘솔 입력 받아서
		// Java에 있던 원래 기능을 사용했을 때, 클래스명이 중복될 때 해결 방법
//		Scanner k = new Scanner(System.in);
		
		// 스캐너, 캐논123, 50만원, 10kg
		Scanner s = new Scanner("캐논123", 500000, 10);
		s.print();
	}
}
