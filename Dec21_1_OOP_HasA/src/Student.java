
public class Student {
	String name;
	int age;
	Pen pen;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
		pen.printInfo();
	}
	
}
