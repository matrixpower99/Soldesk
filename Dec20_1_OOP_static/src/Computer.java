// static final 멤버변수 : 상수화(수정 불가능하게)
// 		우리 쇼핑몰 컴퓨터는 다 삼성, 영원히 고정

// static 메소드
//		메모리 절약 -> 단순 메소드 호출을 위해 객체는 만들지 않으니
//		공통 -> x
//		객체 만들지 않아도 사용 가능한
//		static메소드에서 static이 아닌것 사용 불가능
public class Computer {
	String cpu;
	int ram;
	int hdd;
	static final String MAKER = "삼성";
	
	public static void staticTest() {
		System.out.println("staticTest");
	}
	
	public static void printMaker() {
		System.out.println(MAKER);
		// System.out.println(cpu);
	}
	
	public void printInfo() {
		System.out.println(cpu);
		System.out.println(ram);
		System.out.println(hdd);
		System.out.println(MAKER);
	}
}
