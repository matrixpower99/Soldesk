
public class OMain {
	public static void main(String[] args) {
		Mouse m = new Mouse();
		m.name = "로지텍123";
		m.price = 10000;
		m.printInfo();
		// m.printMakerInfo();
		Mouse.printMakerInfo();
		// 이 쇼핑몰에서는 로지텍꺼만 판매
		
		// 마우스
		//	이름 : 로지텍123
		//	가격 : 10000
		//	제조사 : 로지텍
		//	전체정보출력
		//	제조사 출력
	}
}
