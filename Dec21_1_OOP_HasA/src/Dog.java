
public class Dog {
	String name;
	int age;
	Student owner; // ���� �л��� �������� ����

	// ���� ������ �� �ƹ��͵� �ȳִ�
	public Dog() {
		// TODO Auto-generated constructor stub
	}

	// �� ������ �� �̸�, ���̸� ����
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// �� ������ �� �̸�, ����, ���α��� ���� ������
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
