// ����� ��°����� ����
public class OMain2 {
	// ȫ�浿, 30�� ���
	public static void main(String[] args) {
		
		Human h = new Human("ȫ�浿", 30);
		h.print();
		System.out.println("--------------");
		
		// ��浿, 20�� ���
		Human h2 = new Human("��浿", 20);
		h2.print();
		System.out.println("--------------");

		// h�� �̸�
		// h�� ��º�
		System.out.println(h.name);
		System.out.println(Human.home.name);
		System.out.println("--------------");
		
		// ������� ��� ���� �������
		Human.home.print();
		System.out.println("--------------");
		
		// ��� : ȫ�浿/��⵿
		//		������� �� ������
		//		�� ������ ������±��
		
		// �ý��� : Windows/linux
		//		�ý��۵��� �� ���� �ܼ�â ��
		//		�� �ܼ�â�� ������±��
	}
}
