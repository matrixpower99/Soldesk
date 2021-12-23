
public class Scanner extends Product {
	double weight;
	
	public Scanner() {
		// TODO Auto-generated constructor stub
	}

	public Scanner(String name, int price, int weight) {
		super(name, price);
		this.weight = weight;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(weight + "kg");
	}
}
