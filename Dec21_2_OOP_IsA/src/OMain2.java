
public class OMain2 {
	public static void main(String[] args) {
		Coffee c = new Coffee();
		c.Name = "�Ƹ޸�ī��";
		c.price = 3000;
		c.size = "��";
		c.temp = "�����ϰ�";
		c.print();
		System.out.println("---------------");
 		
		Kimbab k = new Kimbab(); //���
		k.Name = "��ä���";
		k.price = 2500;
		k.print();
		System.out.println("---------------");
		
		Soju s = new Soju(); //����
		s.Name = "���� ����";
		s.price = 5000;
		s.alcLevel = 20;
		s.print();
		System.out.println("---------------");
		
	}
}
