
public class OMain2 {
	public static void main(String[] args) {
		Coffee c = new Coffee();
		c.Name = "아메리카노";
		c.price = 3000;
		c.size = "톨";
		c.temp = "따듯하게";
		c.print();
		System.out.println("---------------");
 		
		Kimbab k = new Kimbab(); //김밥
		k.Name = "야채김밥";
		k.price = 2500;
		k.print();
		System.out.println("---------------");
		
		Soju s = new Soju(); //소주
		s.Name = "진로 소주";
		s.price = 5000;
		s.alcLevel = 20;
		s.print();
		System.out.println("---------------");
		
	}
}
