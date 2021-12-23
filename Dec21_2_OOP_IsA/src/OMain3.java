// 생성자 : 객체 만들 때 뭐 하려고

public class OMain3 {
	public static void main(String[] args) {
		// 커피 만들죠
		// 소주 만들죠
		// 김밥 만들죠
		// 메뉴 만드나? -> 실체가 있는게 아닌 객체들을 묶어서 부르는 추상적인 개념일 뿐
		// 아직 못한 이야기가 남아 있음
		
		Coffee c = new Coffee("아메리카노", 2500, "톨", "따뜻하게");
		c.print();
		System.out.println("------------------");
		
		Soju s = new Soju("진로소주", 3000, 20);
		s.print();
		System.out.println("------------------");
		
		Kimbab k = new Kimbab("야채김밥", 2000);
		k.print();
	}
}
