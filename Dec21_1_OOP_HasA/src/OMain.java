// 객체간의 관계
//		A has a B -> 나는 볼펜 하나 갖고 있음 -> A의 멤버 변수로 B가 들어감
//		학생이 키우는 개, 개의 주인
//		A is a B - > 나는 아들

// 학생 s의 펜p
// 개d의 주인이 학생s
public class OMain {
	public static void main(String[] args) {
		// 모나미153, 500원짜리, 검은색볼
		Pen p = new Pen("모나미153", 500, "검은색");
		p.printInfo();
		System.out.println("--------------");
		
		// 홍길동, 20살인 학생
		Student s = new Student("홍길동", 20);
		s.pen = p;
		s.printInfo();
		System.out.println("--------------");

		// 삐비, 2살인 개
		Dog d = new Dog("삐삐", 2, s);
		d.show();
		System.out.println("--------------");
		
		// 누렁이, 5살짜리 개, 주인 없음
		Dog d2 = new Dog("누렁이", 5);
		d2.show();
		System.out.println("--------------");
		
		System.out.println(d.name); // d의 이름
		System.out.println(d.owner.name); // d의 주인의 이름
		System.out.println(d.owner.pen.color); // d의 주인의 펜의 색깔
		
	
	}
}
