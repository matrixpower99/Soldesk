// A is a B : ���� ��ǰ
//			  ��Ʈ���� ��ǻ��
//			  ��ǻ�ʹ� ������ǰ

// ��Ӱ���

public class OMain {
	public static void main(String[] args) {
		// ������ x
		
		// ��ǰ
		// ǰ���� �׽�Ʈ
		// ������ 10��
		// �������
		Product p = new Product();
		p.name = "�׽�Ʈ";
		p.price = 10;
		p.print();
		System.out.println("----------------");
		
		// �� ��
		// �� �̸��� �𳪹�153
		// �� ������ 500��
		// �� ������ ����
		// �������
		Pen pp = new Pen();
		pp.name = "�𳪹�153";
		pp.price = 500;
		pp.color = "����";
		pp.print();
		System.out.println("----------------");
		
		// �� ��ǻ��
		// ���������̼�123
		// ������ 80����
		// cpu : i7-1234
		// ram : 16GB
		// hdd : 500GB
		Computer c = new Computer();
		c.name = "���������̼�123";
		c.price = 800000;
		c.cpu = "i7-1234";
		c.ram = 16;
		c.hdd = 500;
		c.print();
		System.out.println("----------------");
		
		Notebook n = new Notebook();
		n.name = "�׷�123";
		n.price = 2000000;
		n.cpu = "i7-9999";
		n.ram = 16;
		n.hdd = 1000; // 1000gb
		n.weight = 3; // ���� 3kg
		n.battery = 2; // 2�ð�
		n.print();
	}
}