// OOD
public class UpDownMain {

	public static void main(String[] args) {
		// ģ���� �п��� �ɾ��ִٰ�, ������ �ϰ� �;�����, ���� �ҷ��� ����
//		Computer c = new Computer();
//		c.start();

		// ���� �п��� �ɾ��ִٰ�, ������ �ϰ� �;�����, ģ���� �ҷ��� ����
//		Computer c = new Computer();
//		c.start();

		// ģ��/�� �п��� �ִٰ�, ģ���� �ϰ� �;�����, ������ �� �ɾ ����
		Computer c = new Computer();
		User u = new User();
		c.start(u);
		
		// ģ��/�� �п��� �ִٰ�, ���� �ϰ� �;�����, ģ������ �� �ɾ ����
//		Computer c = new Computer();
//		User u = new User();
//		u.start(c);
		

	}

}
