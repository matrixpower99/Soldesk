
public class PrintMain {

	public static void main(String[] args) {
		// �߰� Ȯ�ο�
		// �ܼ�â�� �� ����ϰ� �ٹٲ� 
		System.out.println("������");

		// �ܼ�â�� �� ���
		System.out.print("������");
		
		// �ܼ�â�� ���� �����ؼ� �� ���
		System.out.printf("%.2f", 123.456789);
		System.out.println("�Ѥ�");
		System.out.println("-----------------------");
		
		// Ư������[��� ���α׷��� ������ ����]
		//		\t - tabŰ
		//		\n - new line(�ٸ� �ٲٱ�)
		//		\r - carriage return(Ŀ���� �� ������)
		//		\b - backspace(1byte �����)
		//			java : 1���� = 2byte
		//			c��� : 1���� = 1byte
		//		\\ - \
		//		\" - "
		
		
		// �������� �ٹٲ��� �Ϸ��� \r\n�� �ؾ�
		// �����ġ �߿��� \n�� �־ ���� �ٹٲ�ó���� ���ִ� ��찡 ����
		//		�ܼ�â, Windows10�� �޸����� ����ó�� ���ִµ�
		//		Windows7������ �޸����� ����
		
		System.out.println("����\t: �ݿ���");
		System.out.println("��\t: �п� ���ͳ� �۾�");
		System.out.println("�׷���\r\n: �����ð��� ���� �� ���ɿ�\b");
		System.out.println("\\(^^)/");
		System.out.println("\\(\" \")/");
		System.out.println("----------------------------");
		
		// ����ǥ ��ģ ���ڴ� �ڹ� ����
		// ����ǥ�� �ѷ�ģ ���ڴ� ���� ������
		System.out.println("��");
		System.out.println(123);
		System.out.println(123.345);
		
		// ����(�Ҽ��� ����)�����Ͱ� ���� �ڸ� : %d
		// %03d
		System.out.printf("���� : %d ������\n", 1);
		System.out.printf("hero_kick_%02d.png", 2);
		System.out.println();
		// �Ǽ�(�Ҽ��� �ִ�)�����Ͱ� ���� �ڸ� : %f
		// %.2f
		System.out.printf("���ھ� : %f\n", 1231.2123);
		System.out.printf("���ھ� : %.2f\n", 1231.2173);
		// ���ڵ����Ͱ� ���� �ڸ� : %s
		System.out.printf("���� : %s\n", "��");
		
		System.out.printf("Ű : %dcm, ������ : %fkg\n", 180, 80.123);
		
		// %% : %(printf����)
		System.out.printf("��� : %d\n���� %.1f%%", 3, 10.12);
	}

}

// ����
// 3�ð�
// 2�ð� - �ǽ�[���� - �� 3�ð����� ���ɷ� �Ҽ��ִ� ���� - �� �ѻ�� ��]






