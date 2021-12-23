// Computer is a Product
public class Computer extends Product{
	String cpu;
	int ram;
	int hdd;
	
	@Override
	public void print() {
		super.print();
		System.out.println(cpu);
		System.out.println(ram + "GB");
		if (hdd >= 1000) {
			System.out.println(hdd / 1000 + "TB");
		} else {
			System.out.println(hdd + "GB");
		}
	}
}
