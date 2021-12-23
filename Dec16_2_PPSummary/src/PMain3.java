// �� -> ��̾���
// 		������ - > ������ ����. ������ �ִ� �ڵ带 ������ �����.
//		A��� ����� �����ض�. -> 

// ������ �Ϸ��� ���� ���ؾ� -> �Ӹ����� ���� ��.
//		�ӽŷ��� �˰��� ���� ������ ����.
//		scikit-learn, tensorflow

// ���ǹ�
// �ݺ���
// �÷���
// �� ���� Ư¡ :
//		�� ���������� ���� ���� -> �����ڰ� ����
//		�����ڵ��� �ڱⰡ ����� �����ϴ� ��ȭ
//		���� ������ �� ���(���̺귯��) �� ����


import java.util.Arrays;

// ���� - ��������
// ������ ������
public class PMain3 {
	// �迭�� ������ �������ִ� �Լ�
	// ar[0] > ar[1] = �ڸ��ٲٱ� / BubbleSort
	public static void sort(int[] sr) {
		int temp = 0;
		for (int i = sr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (sr[j] > sr[j + 1]) {
					temp = sr[j];
					sr[j] = sr[j + 1];
					sr[j + 1] = temp;
				}
			}
		}
	}

	public static void selSort(int[] ar) { // Selection Sort
		int min = 0, temp = 0;
		for (int std = 0; std < (ar.length - 1); std++) {
			min = std; // �ּҰ��� ��ġ�� ������ ����. ó������ �迭 0���� ����.
			for (int step = (std + 1); step < ar.length; step++) {
				if (ar[min] > ar[step]) { // min���� ��ġ�� ���Ͽ� ����
					min = step;
				}
			}
//			System.out.println("���� �ּҰ�" + ar[min]);
			temp = ar[std]; // ���� ������ ��(�� ����� ���� ����)
			ar[std] = ar[min]; // �� ����� ���� ������ ���� �ּҰ����� ����
			ar[min] = temp; // �ּҰ��� �ִ� �ڸ��� ���������� ���� �ֱ�
		}
	}
	
	public static void selSort2(int[] ar) { // ����� �ڵ�
		int t = 0, minIndex = 0;
		int min = ar[0];
		for (int set = 0; set < (ar.length -1); set++) {
			min = ar[set];
			minIndex = set;
			for (int i = (set + 1); i < ar.length; i++) {
				if (min > ar[i]) {
					min = ar[i];
					minIndex = i;
				}
			}
			t = min;
			ar[minIndex] = ar[set];
			ar[set] = t;
		}
	}
	
	public static void main(String[] args) {
		int[] kor = { 100, 58, 64, 12, 66, 45, 96, 88 };

//		sort(kor);
//		selSort(kor);
//		selSort2(kor);	

		// Java�� �迭 �����ϴ� ����� �̹� ����.
		Arrays.sort(kor);

		
		for (int i : kor) {
			System.out.print(i + " ");
		}
	}
}
