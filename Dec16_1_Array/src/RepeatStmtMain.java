
public class RepeatStmtMain {
	public static void main(String[] args) {
		String[] name = {"ȫ�浿", "��浿", "�ֱ浿"};
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		System.out.println("---------------");
		
		for (int i = 0; i < name.length; i++) {
			String t = name[i]; // �ӽ� ������ ���� �� �� ������ ����� �� ������ ��õ���� ����.
			System.out.println(t);
		}
		System.out.println("---------------");
		
		// for-each���̶�� �θ�. ����(1.5�� �߰�)
		//		�迭 ���ʴ�� Ž�� �� �����ϰ� ��Ա� ����
		// 		���� ������ �Ұ����Ͽ� �پ��ϰ� Ȱ���ϱ� �����. ������ ��¸� ����
		// for (�ڷ��� ������ : �迭��){}
		for (String t : name) { 
			System.out.println(t);
		}
		System.out.println("---------------");
	
		int[] kor = {90, 50, 100, 56, 12, 45, 21, 45, 11, 78};
		// �����������
		int sum = 0;
		for (int i : kor) {
			sum += i;
		}
		System.out.println("��� : " + (double)sum / kor.length);
		
		
	}
}
