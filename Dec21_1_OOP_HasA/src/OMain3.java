
public class OMain3 {
	public static void main(String[] args) {
		// ��s9, 30����, 010-1111-2222�� �ڵ���
		Phone p = new Phone("��s9", 300000, "010-1111-2222");
		p.print();
		System.out.println("---------------");
		
		// �Ｚ, 100��, p��� ���� ����ȸ��
		Company c = new Company("�Ｚ", 100, p);
		c.print();
		System.out.println("---------------");
		
		// ȫ�浿, 30��, c�� ������ ���
		Saram s = new Saram("ȫ�浿", 30, c);
		s.print();
		System.out.println("---------------");

		// �����ְ�, 30��, s�� ��� ��
		House ho = new House("�����ְ�", 30, s);
		ho.print();

		// ho��� ���� �̸�
		System.out.println(ho.name);
		System.out.println("---------------");
		// ho�� ��� ����� ����
		System.out.println(ho.live.age);
		System.out.println("---------------");
		// ho�� ��� ����� ��ü����
		ho.live.print();
		System.out.println("---------------");
		// ho�� ��� ����� ��ϴ� ȸ���� �̸�
		System.out.println(ho.live.run.name);
		System.out.println("---------------");
		// ho�� ��� ����� ��ϴ� ȸ�翡�� ���� ��ǰ��
		System.out.println(ho.live.run.product.name);
		System.out.println("---------------");
		// ho�� ��� ����� ��ϴ� ȸ�翡�� ���� ��ǰ�� ��ü����
		ho.live.run.product.print();
		System.out.println("---------------");
		
	}
}
