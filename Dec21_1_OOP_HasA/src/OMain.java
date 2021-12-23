// ��ü���� ����
//		A has a B -> ���� ���� �ϳ� ���� ���� -> A�� ��� ������ B�� ��
//		�л��� Ű��� ��, ���� ����
//		A is a B - > ���� �Ƶ�

// �л� s�� ��p
// ��d�� ������ �л�s
public class OMain {
	public static void main(String[] args) {
		// �𳪹�153, 500��¥��, ��������
		Pen p = new Pen("�𳪹�153", 500, "������");
		p.printInfo();
		System.out.println("--------------");
		
		// ȫ�浿, 20���� �л�
		Student s = new Student("ȫ�浿", 20);
		s.pen = p;
		s.printInfo();
		System.out.println("--------------");

		// �ߺ�, 2���� ��
		Dog d = new Dog("�߻�", 2, s);
		d.show();
		System.out.println("--------------");
		
		// ������, 5��¥�� ��, ���� ����
		Dog d2 = new Dog("������", 5);
		d2.show();
		System.out.println("--------------");
		
		System.out.println(d.name); // d�� �̸�
		System.out.println(d.owner.name); // d�� ������ �̸�
		System.out.println(d.owner.pen.color); // d�� ������ ���� ����
		
	
	}
}
