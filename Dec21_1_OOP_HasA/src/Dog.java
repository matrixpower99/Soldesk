
public class Dog {
	String name;
	int age;
	Student owner; // 개가 학생을 주인으로 가짐

	// 개를 생성할 때 아무것도 안넣는
	public Dog() {
		// TODO Auto-generated constructor stub
	}

	// 개 생성할 때 이름, 나이만 넣은
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// 개 생성할 때 이름, 나이, 주인까지 넣은 생성자
	public Dog(String name, int age, Student owner) {
		super();
		this.name = name;
		this.age = age;
		this.owner = owner;
	}

	public void show() {
		System.out.println(name);
		System.out.println(age);
		if (owner != null) {
			owner.printInfo();
		}
	}
}
