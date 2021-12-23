import java.util.Arrays;
import java.util.Random;

// �ζ� ��ȣ �ڵ� ������
//		1 ~ 45������ ������ ���� 6�� ���
//		�ߺ��� �ȶ���
//		�����ؼ�
// Java�� �ߺ�üũ�ϴ� ����� ����
// Part1 : PP -> ���ǹ�, �ݺ���, �迭, ������
// Part2 : 
public class PMain4 {
	public static int pick(int no, int[] ar) {
		int n = new Random().nextInt(45) + 1;
		for (int i = 0; i < no; i++) {
			if (n == ar[i]) {
				return pick(no, ar);
			}
		}
		return n;		
	}
	
	public static void main(String[] args) {
		int[] lotto = new int[6];
		for (int i = 0; i < 6; i++) {
			lotto[i] = pick(i, lotto);
		}
		
		Arrays.sort(lotto);

		for (int i : lotto) {
			System.out.print(i + " ");
		}
	}
}