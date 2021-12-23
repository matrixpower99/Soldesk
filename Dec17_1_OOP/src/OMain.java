// 알고리즘의 시대(어떻게 하면 좀 더 효율적인...) -> 여기에 목숨 거는 시대는 지났음
// H/W가 너무 좋아짐.
// 유지보수의 시대 -> 코드 알아보기 편해야
//		Java가 일상생활의 언어와 꽤나 다르게 생긴  -> 알아보기 힘듬
//		Java를 일상생활스럽게 -> 알아보기 쉽지 않을까?

// Object Oriented Programming -> 현대의 패러다임(주력)
//		Object : 일상생활에 존재하는 것

// 객체 생성
// 		클래스명 변수명 = new 클래스명()

public class OMain {
	
	public static void printHbar() {
		System.out.println("-------------------------");
	}
	public static void main(String[] args) {
		String name = "뽀삐";
		int age = 3;
		System.out.println("개이름 : " + name);
		System.out.println("개나이 : " + age);
		System.out.println("멍");

		// 이름이 뽀삐, 나이가 3살인
		Dog d = new Dog(); // 새로운 개
		// 멤버 변수 사용
		d.name = "뽀삐"; // 그 개 이름이 뽀삐
		d.age = 3; // 그 개 나이가 3살
		d.bark(); // 그 개가 짖음
		d.printInfo(); // 그 개 정보 출력
		printHbar();
		
		// 새로운 펜
		// 에너젤
		// 2000원짜리
		// 검정
		// 정보출력
		Pen p = new Pen();
		p.name = "에너젤";
		p.color = "블랙";
		p.price = 2000;

		p.penInfo();
		printHbar();
		
		Pen p2 = new Pen();
		p2.name = "모나미153";
		p2.color = "빨강";
		p2.price = 500;

		p2.penInfo();
		printHbar();
		
		// p랑 똑같은 펜 p3 
		Pen p3 = p;
		// 정보출력
		p3.penInfo();
		printHbar();
				
		p.price = 2500;
		p.penInfo();
		printHbar();
		
		p3.penInfo();
	}
}
