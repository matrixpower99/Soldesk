// Product > Computer > Notebook -> �ٴܻ��
public class Notebook extends Computer {
	int weight;
	int battery;
	
	@Override
	public void print() {
		super.print();
		System.out.println(weight + "Kg");
		System.out.println(battery + "�ð�");
	}
}
