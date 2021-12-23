
public class Phone {
	String name;
	int price;
	String number;
		
	public Phone() {
		// TODO Auto-generated constructor stub
	}

	public Phone(String name, int price, String number) {
		super();
		this.name = name;
		this.price = price;
		this.number = number;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(number);
	}
	
}
