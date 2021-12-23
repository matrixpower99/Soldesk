
// 한국어로 설계 -번역[개발]-> java
// java -번역[compile]-> 기계어
// 기계어 -실행->
// 1. static멤버변수들이 static영역에 다 만들어짐
// 2. 기계어로 바뀌어있는 모든 소스(클래스(메소드도))가 stack영역에 
// 3. JVM이 OMain.main(...);을 수행
// ...
public class OMain {
	public static void main(String[] args) {
		Handphone h = new Handphone();
		h.name = "갤s9";
		h.price = 300000;
		h.phoneNumber = "010-3154-4435";
		h.print();
		System.out.println("-----");

		// 게장이 매진
		// 게시판
		// 게장 상품명 -> ???
		// 게장 얼마냐 -> ???
		// 게장 생산자 -> 김수미
		System.out.println(Gejang.producer);

		System.out.println("-----");

		Gejang g = new Gejang();
		g.name = "연말특선간장게장세트";
		g.price = 39900;
		g.showInfo();
		g.producer = "최수미";
		System.out.println(g.producer);
		System.out.println("-----");

		Gejang g2 = new Gejang();
		g2.name = "신년특선양념게장세트";
		g2.price = 59900;
		g2.showInfo();
		System.out.println("-----");

		// Computer.MAKER = "애플";
		System.out.println(Computer.MAKER);
		// Math.PI = 1.2312;
		System.out.println(Math.PI);
		
		Computer.staticTest();
		Computer.printMaker();
		
		System.out.println("-----");
		
		Computer c1 = new Computer();
		c1.cpu = "i7-1234";
		c1.ram = 8;
		c1.hdd = 500;
		c1.printInfo();
		System.out.println("-----");

		Computer c2 = new Computer();
		c2.cpu = "i5-4544";
		c2.ram = 16;
		c2.hdd = 500;
		c2.printInfo();
	}
}
