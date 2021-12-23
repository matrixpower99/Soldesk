// �Լ� ���� ���� : ���� ����(Local Variable) -> �� �Լ� �����ϴ� ���� �ӽ÷� �ʿ�(�˻� ����)

// Ŭ���� ���� ���� : �������(Member Variable) -> ��ü�� ������ �Ӽ� 

// �ڹٿ��� �Լ��� ���� -> �޼ҵ常 ����

// Java : (������)perfect�� ��ü������
// Python : hybrid�� ��ü������ 

// ��ü�� ������ �Ӽ�
public class Dog {
	// ��� ����(Member Variable)
	// �Ӽ� : ��� ����, �Ӽ�(attribute), �ʵ�(field)
	String name;
	int age;

	// �׼� : Method
	public void bark() {
		System.out.println("��");
	}

	// ���α׷� �� �ʿ��� ��� : Method
	public void printInfo() {
		System.out.println("���̸� : " + name);
		System.out.println("������ : " + age);
	}
}
