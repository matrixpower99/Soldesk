// ������� ��Ʈ 1 ��.
public class AMain2 {

	public static void main(String[] args) {
		// ��, ��, ��
		// 2���� �迭 �̻��� ������� �ʴ°� ����. �����ϰ� ���� ������ ������ �ʴ´�.
		// List + ��ü�� �ַ� ����Ѵ�. �÷���
		int[][] score = { { 100, 90, 50 }, { 60, 80, 70 }, { 88, 66, 11 } };
		System.out.println(score[0]);
		System.out.println(score[0][1]);

		// 3���� �л��� ��������
		System.out.println(score[2][0]);
		System.out.println("--------------");

		for (int i = 0; i < score.length; i++) {
			int[] s = score[i];
			for (int j = 0; j < s.length; j++) {
				System.out.println(s[j]);
			} 
		}
		System.out.println("--------------");
		
		for (int[] s : score) {
			for (int i : s) {
				System.out.println(i);
			}
		}
		
	}

}
