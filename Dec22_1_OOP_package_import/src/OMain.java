// ���ǹ�
// �ݺ���
// �迭
// Ư¡ -> �ڱⰡ �۾��Ѱ� ����
// 		���� �۾��ؼ� �������ذ� �߾���
public class OMain {
	public static void main(String[] args) {
		// å �Ǹ� -> �ﱹ��, ����, ������
		Book b = new Book("�ﱹ��", 10000, "������");
		b.print(); // �������
		System.out.println("-----------------");
		
		// �䱸��Ʈ, ����, õ��, ������� 2021-12-23����
		Yogurt y = new Yogurt("����", 1000, "2021-12-23");
		y.print(); // �������
		System.out.println("-----------------");
		
		// ��, ��������, 3õ��
		Cup c = new Cup("��������", 3000);
		c.print(); // �������
		System.out.println("-----------------");
		
		// �ܼ� �Է� �޾Ƽ�
		// Java�� �ִ� ���� ����� ������� ��, Ŭ�������� �ߺ��� �� �ذ� ���
//		Scanner k = new Scanner(System.in);
		
		// ��ĳ��, ĳ��123, 50����, 10kg
		Scanner s = new Scanner("ĳ��123", 500000, 10);
		s.print();
	}
}
