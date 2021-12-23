
public class Coffee extends Menu {
	String size;
	String temp;
	
	public Coffee() {
		// TODO Auto-generated constructor stub
	}
	
	public Coffee(String name, int price, String size, String temp) {
		super(name, price);
		this.size = size;
		this.temp = temp;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(size);
		System.out.println(temp);
	}
}
