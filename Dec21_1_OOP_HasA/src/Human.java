
public class Human {
	String name;
	int age;
	static Planet home = new Planet("Áö±¸"); 
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(age);
		home.print();
	}
}
