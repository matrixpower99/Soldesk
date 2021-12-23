
public class House {
	String name;
	int sieze;
	Saram live;
	
	public House() {
		// TODO Auto-generated constructor stub
	}


	public House(String name, int sieze, Saram live) {
		super();
		this.name = name;
		this.sieze = sieze;
		this.live = live;
	}


	public void print() {
		System.out.println(name);
		System.out.println(sieze);
		if (live != null) {
			live.print();
		}
		
	}
	
}
