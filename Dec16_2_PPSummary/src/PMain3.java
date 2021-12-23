// 일 -> 재미없음
// 		개발자 - > 개발을 안함. 기존에 있는 코드를 가져다 사용함.
//		A라는 기능을 개발해라. -> 

// 빅데이터 하려면 수학 잘해야 -> 머리에서 지울 것.
//		머신러닝 알고리즘 직접 만들지 않음.
//		scikit-learn, tensorflow

// 조건문
// 반복문
// 컬렉션
// 그 언어만의 특징 :
//		전 세계적으로 많이 사용됨 -> 개발자가 많음
//		개발자들이 자기가 만든거 공유하는 문화
//		남이 공유해 준 기능(라이브러리) 잘 쓰기


import java.util.Arrays;

// 정렬 - 오름차순
// 작은게 앞으로
public class PMain3 {
	// 배열을 넣으면 정렬해주는 함수
	// ar[0] > ar[1] = 자리바꾸기 / BubbleSort
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
			min = std; // 최소값의 위치를 저장할 변수. 처음에는 배열 0으로 가정.
			for (int step = (std + 1); step < ar.length; step++) {
				if (ar[min] > ar[step]) { // min값의 위치를 비교하여 변경
					min = step;
				}
			}
//			System.out.println("현재 최소값" + ar[min]);
			temp = ar[std]; // 가장 왼쪽의 값(각 페이즈별 시작 지점)
			ar[std] = ar[min]; // 각 페이즈별 시작 지점의 값을 최소값으로 변경
			ar[min] = temp; // 최소값이 있던 자리에 시작지점의 값을 넣기
		}
	}
	
	public static void selSort2(int[] ar) { // 강사님 코드
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

		// Java에 배열 정렬하는 기능이 이미 있음.
		Arrays.sort(kor);

		
		for (int i : kor) {
			System.out.print(i + " ");
		}
	}
}
