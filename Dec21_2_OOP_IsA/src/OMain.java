// A is a B : 펜은 상품
//			  노트북은 컴퓨터
//			  컴퓨터는 전자제품

// 상속관계

public class OMain {
	public static void main(String[] args) {
		// 생성자 x
		
		// 상품
		// 품명이 테스트
		// 가격이 10원
		// 정보출력
		Product p = new Product();
		p.name = "테스트";
		p.price = 10;
		p.print();
		System.out.println("----------------");
		
		// 새 펜
		// 펜 이름이 모나미153
		// 펜 가격이 500원
		// 펜 색깔이 검정
		// 정보출력
		Pen pp = new Pen();
		pp.name = "모나미153";
		pp.price = 500;
		pp.color = "검정";
		pp.print();
		System.out.println("----------------");
		
		// 새 컴퓨터
		// 매직스테이션123
		// 가격이 80만원
		// cpu : i7-1234
		// ram : 16GB
		// hdd : 500GB
		Computer c = new Computer();
		c.name = "매직스테이션123";
		c.price = 800000;
		c.cpu = "i7-1234";
		c.ram = 16;
		c.hdd = 500;
		c.print();
		System.out.println("----------------");
		
		Notebook n = new Notebook();
		n.name = "그램123";
		n.price = 2000000;
		n.cpu = "i7-9999";
		n.ram = 16;
		n.hdd = 1000; // 1000gb
		n.weight = 3; // 무게 3kg
		n.battery = 2; // 2시간
		n.print();
	}
}