import java.util.Scanner;

public class IMain2 {
	public static void main(String[] args) {
		// 키보드 입력받을 준비
		Scanner k = new Scanner(System.in);

		// 식당이름 입력받기
		System.out.print("이름 : ");
		String name = k.next();

		// 테이블 수 입력받기
		System.out.print("테이블 수 : ");
		int count = k.nextInt();

		// 별점 입력받기
		System.out.print("별점 : ");
		double score = k.nextDouble();

		// 영업여부 입력받기
		System.out.print("영업중 : ");
		boolean open = k.nextBoolean();

		System.out.println("-------------");
		// 이쁘게 출력하기
		System.out.printf("식당명\t: %s\n", name);
		System.out.printf("테이블\t: %d자리\n", count);
		System.out.printf("별점\t: %.1f점\n", score);
		System.out.printf("영업중\t: %b", open);
	}
}
