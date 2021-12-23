// 함수 속의 변수 : 지역 변수(Local Variable) -> 그 함수 진행하는 동안 임시로 필요(똥색 변수)

// 클랙스 속의 변수 : 멤버변수(Member Variable) -> 객체가 가지는 속성 

// 자바에는 함수가 없음 -> 메소드만 존재

// Java : (구조가)perfect한 객체지향언어
// Python : hybrid한 객체지향언어 

// 객체가 가지는 속성
public class Dog {
	// 멤버 변수(Member Variable)
	// 속성 : 멤버 변수, 속성(attribute), 필드(field)
	String name;
	int age;

	// 액션 : Method
	public void bark() {
		System.out.println("멍");
	}

	// 프로그램 상 필요한 기능 : Method
	public void printInfo() {
		System.out.println("개이름 : " + name);
		System.out.println("개나이 : " + age);
	}
}
