// 메모리(RAM) - 재부팅하면 다 사라짐
//		논리적 공간
//		?
//		stack
//			프로그램 종료시 자동으로 사라짐
//			-> 종료가 안되면 없애지 못함
//		heap
//			자동으로 사라지지 않음 -> 개발자가 직접 처리해야

// Garbage Collection
//		heap영역 자동 정리(해주는 System) -> 언제?
//		그 번지를 가리키는 변수가 더 이상 없으면 발동

// 클래스(class) : 붕어빵틀/도장(비유하자면) -> 도장에 인주 뭍혀서 찍으면 
// 객체(object, instance) : 실생활에 존재하는 것 -> 붕어빵(비유하자면)/도장 찍힌거
public class OMain2 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.name = "뽀삐";
		d1.age = 2;
		d1.printInfo();
		OMain.printHbar();
		
		Dog d2 = new Dog();
		d2.name = "뿌삐";
		d2.age = 5;
		d2.printInfo();
		OMain.printHbar();
		
		// d1을 d3로도 부를 수 있게
		Dog d3 = d1; // 개는 2마리인데 변수만 3개인 상태
		d1.age = 10;
		d3.printInfo();
		OMain.printHbar();
		
		d1 = null; // 참조형 변수들을 지우는 것(stack 영역)
		d2 = null;
//		d3.printInfo(); // d1.xxx -> Error, d3로는 호출 가능
		d3 = null; // 가비지컬렉션 발동. 프로그램 종료시 Stack 영역이 지워지므로 heap영역을 신경 쓸 필요 없다.

	}
}
