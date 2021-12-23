
public class Saram {
	String name;
	int age;
	Company run;
	
	public Saram() {
		// TODO Auto-generated constructor stub
	}

	public Saram(String name, int age, Company run) {
		super();
		this.name = name;
		this.age = age;
		this.run = run;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(age);
		if (run != null) {
			run.print();
		}
	}
}
