
// �ѱ���� ���� -����[����]-> java
// java -����[compile]-> ����
// ���� -����->
// 1. static����������� static������ �� �������
// 2. ����� �ٲ���ִ� ��� �ҽ�(Ŭ����(�޼ҵ嵵))�� stack������ 
// 3. JVM�� OMain.main(...);�� ����
// ...
public class OMain {
	public static void main(String[] args) {
		Handphone h = new Handphone();
		h.name = "��s9";
		h.price = 300000;
		h.phoneNumber = "010-3154-4435";
		h.print();
		System.out.println("-----");

		// ������ ����
		// �Խ���
		// ���� ��ǰ�� -> ???
		// ���� �󸶳� -> ???
		// ���� ������ -> �����
		System.out.println(Gejang.producer);

		System.out.println("-----");

		Gejang g = new Gejang();
		g.name = "����Ư��������弼Ʈ";
		g.price = 39900;
		g.showInfo();
		g.producer = "�ּ���";
		System.out.println(g.producer);
		System.out.println("-----");

		Gejang g2 = new Gejang();
		g2.name = "�ų�Ư�������弼Ʈ";
		g2.price = 59900;
		g2.showInfo();
		System.out.println("-----");

		// Computer.MAKER = "����";
		System.out.println(Computer.MAKER);
		// Math.PI = 1.2312;
		System.out.println(Math.PI);
		
		Computer.staticTest();
		Computer.printMaker();
		
		System.out.println("-----");
		
		Computer c1 = new Computer();
		c1.cpu = "i7-1234";
		c1.ram = 8;
		c1.hdd = 500;
		c1.printInfo();
		System.out.println("-----");

		Computer c2 = new Computer();
		c2.cpu = "i5-4544";
		c2.ram = 16;
		c2.hdd = 500;
		c2.printInfo();
	}
}
