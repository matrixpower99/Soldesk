// ������ : ��ü ���� �� �� �Ϸ���

public class OMain3 {
	public static void main(String[] args) {
		// Ŀ�� ������
		// ���� ������
		// ��� ������
		// �޴� ���峪? -> ��ü�� �ִ°� �ƴ� ��ü���� ��� �θ��� �߻����� ������ ��
		// ���� ���� �̾߱Ⱑ ���� ����
		
		Coffee c = new Coffee("�Ƹ޸�ī��", 2500, "��", "�����ϰ�");
		c.print();
		System.out.println("------------------");
		
		Soju s = new Soju("���μ���", 3000, 20);
		s.print();
		System.out.println("------------------");
		
		Kimbab k = new Kimbab("��ä���", 2000);
		k.print();
	}
}
