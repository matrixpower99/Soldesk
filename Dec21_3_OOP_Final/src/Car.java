// final 멤버변수 : 수정 불가능하게
// final 메소드 : overriding 불가능하게
// final 클래스 : 상속 불가능하게(subclass 생성 불가능) ex) Scanner 클래스

public final class Car {
//	static String name = "차"; // 전 세계 자동차 이름이 다 똑같으면
	static final String NAME = "차";
	
	public final void run() {
		System.out.println("부릉");
	}
}
