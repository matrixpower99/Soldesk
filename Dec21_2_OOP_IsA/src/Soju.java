
public class Soju extends Menu {
	int alcLevel;

	public Soju() {
		// TODO Auto-generated constructor stub
	}
	
	public Soju(String name, int price, int alcLevel) {
		super(name, price);
		this.alcLevel = alcLevel;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("알콜도수" + alcLevel);
	}
}
