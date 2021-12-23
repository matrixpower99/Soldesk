// static 멤버변수
//		static영역에 하나만 저장
//		객체를 몇 개 만들든 상관없이
//		-> 객체들의 공통속성 표현에 사용
//		-> 메모리 절약됨
//	
//		객체가 없어도 쓸 수 있는 정보(클래스명.멤버명으로 접근)

public class Gejang {
	String name;
	int price;
	static String producer = "김수미";
	
	public void showInfo() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(producer);
	}
}
