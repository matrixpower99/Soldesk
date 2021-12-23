
public class OMain3 {
	public static void main(String[] args) {
		// 갤s9, 30만원, 010-1111-2222인 핸드폰
		Phone p = new Phone("갤s9", 300000, "010-1111-2222");
		p.print();
		System.out.println("---------------");
		
		// 삼성, 100명, p라는 폰을 만든회사
		Company c = new Company("삼성", 100, p);
		c.print();
		System.out.println("---------------");
		
		// 홍길동, 30살, c의 사장인 사람
		Saram s = new Saram("홍길동", 30, c);
		s.print();
		System.out.println("---------------");

		// 강남주공, 30평, s가 사는 집
		House ho = new House("강남주공", 30, s);
		ho.print();

		// ho라는 집의 이름
		System.out.println(ho.name);
		System.out.println("---------------");
		// ho에 사는 사람의 나이
		System.out.println(ho.live.age);
		System.out.println("---------------");
		// ho에 사는 사람의 전체정보
		ho.live.print();
		System.out.println("---------------");
		// ho에 사는 사람이 운영하는 회사의 이름
		System.out.println(ho.live.run.name);
		System.out.println("---------------");
		// ho에 사는 사람이 운영하는 회사에서 만든 제품명
		System.out.println(ho.live.run.product.name);
		System.out.println("---------------");
		// ho에 사는 사람이 운영하는 회사에서 만든 제품의 전체정보
		ho.live.run.product.print();
		System.out.println("---------------");
		
	}
}
