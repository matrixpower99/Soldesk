// �˰����� �ô�(��� �ϸ� �� �� ȿ������...) -> ���⿡ ��� �Ŵ� �ô�� ������
// H/W�� �ʹ� ������.
// ���������� �ô� -> �ڵ� �˾ƺ��� ���ؾ�
//		Java�� �ϻ��Ȱ�� ���� �ϳ� �ٸ��� ����  -> �˾ƺ��� ����
//		Java�� �ϻ��Ȱ������ -> �˾ƺ��� ���� ������?

// Object Oriented Programming -> ������ �з�����(�ַ�)
//		Object : �ϻ��Ȱ�� �����ϴ� ��

// ��ü ����
// 		Ŭ������ ������ = new Ŭ������()

public class OMain {
	
	public static void printHbar() {
		System.out.println("-------------------------");
	}
	public static void main(String[] args) {
		String name = "�ǻ�";
		int age = 3;
		System.out.println("���̸� : " + name);
		System.out.println("������ : " + age);
		System.out.println("��");

		// �̸��� �ǻ�, ���̰� 3����
		Dog d = new Dog(); // ���ο� ��
		// ��� ���� ���
		d.name = "�ǻ�"; // �� �� �̸��� �ǻ�
		d.age = 3; // �� �� ���̰� 3��
		d.bark(); // �� ���� ¢��
		d.printInfo(); // �� �� ���� ���
		printHbar();
		
		// ���ο� ��
		// ������
		// 2000��¥��
		// ����
		// �������
		Pen p = new Pen();
		p.name = "������";
		p.color = "��";
		p.price = 2000;

		p.penInfo();
		printHbar();
		
		Pen p2 = new Pen();
		p2.name = "�𳪹�153";
		p2.color = "����";
		p2.price = 500;

		p2.penInfo();
		printHbar();
		
		// p�� �Ȱ��� �� p3 
		Pen p3 = p;
		// �������
		p3.penInfo();
		printHbar();
				
		p.price = 2500;
		p.penInfo();
		printHbar();
		
		p3.penInfo();
	}
}
