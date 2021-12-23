// Product > Computer > Notebook -> 다단상속
public class Notebook extends Computer {
	int weight;
	int battery;
	
	@Override
	public void print() {
		super.print();
		System.out.println(weight + "Kg");
		System.out.println(battery + "시간");
	}
}
