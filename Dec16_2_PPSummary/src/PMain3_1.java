// ����� �ڵ�
public class PMain3_1 {
	public static void sort(int[] ar) {
		int t = 0;
		for (int set = 0; set < (ar.length -1); set++) {
			for (int i = 0; i < (ar.length - (set + 1)); i++) {
				if (ar[i] > ar[i + 1])  {
					t = ar[i];
					ar[i] = ar [i+1];
					ar[i + 1] = t;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] kor = { 100, 58, 64, 12, 66, 45, 96, 88 };

		// �� �Լ� �ҷ���
		sort(kor);

		for (int i : kor) {
			System.out.print(i + " ");
		}
	}
}
