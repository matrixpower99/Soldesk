// OOD(OODesign)
public class BMICheckMain {

	public static void main(String[] args) {
		// ������ �������� BMI �˻��ϴ� ��Ȳ�� �׷� 
		// -> �ʿ� ���� �͵� ����(������� �մ�, �ǻ� ��ǻ�� ��� ��...)
		// -> �մ�, �ǻ簡 �ʿ��� �� ����.
		
		// �� �����ι����� �Ӽ� üũ
		// ��Ȳ�� ����(�� �����ι����� �׼� üũ)
		// �ǻ簡 ����� �ִٰ�, �մ� �ҷ��� ������Ѽ� ����
		
		Doctor d = new Doctor();
		d.start();
	}
}
