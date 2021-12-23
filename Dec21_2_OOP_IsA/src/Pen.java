// Pen is a Product - O -> 상속 사용가능
// 펜은 상품

// 상속 - inheritance -> 자바에 공식적으로 이런말 없음
// 확장 - extend -> 공식용어

public class Pen extends Product {
	// 아무것도 없어 보이지만
	// 상위/부모/Super 클래스(Product)에 있는 멤버들을 다 물려받아옴
	String color; // 기능 추가

	// Product로부터 물려받아온 메소드 print는 이름, 가격 출력 기능만 존재
	// Pen부터 color기능이 추가됨 -> 메소드 print에 color출력 기능도 넣고 싶음

	// overloading -> 상속과는 무관 -> 메소드명 같게, 파라메터는 다르게
	// 물려받아온 메소드에 기능 재정의(바꾸기) -> overriding

	// @xxx : annotation (xxx자리에 무엇이 들어가느냐에 따라 다르다)
	// 원래대로라면 수동으로 작업해야 -> 자동으로 처리

	// @Override : 바로 밑의 메소드가 overriding된 메소드가 아니면 에러
	// 소스의 가독성을 높임. 개발자가 소스보고 overriding된 메소드임을 바로 알 수 있게 해줌.
	@Override
	public void print() {
		// super : 상위클래스(Product)
		super.print(); // Product에 있는 print를 호출 -> 이름, 가격
		System.out.println(color);
	}
}
