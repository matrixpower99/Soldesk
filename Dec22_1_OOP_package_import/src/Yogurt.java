
public class Yogurt extends Product {
	String exprDate;
	
	public Yogurt() {
		// TODO Auto-generated constructor stub
	}

	public Yogurt(String name, int price, String exprDate) {
		super(name, price);
		this.exprDate = exprDate;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(exprDate);
	}
}
