import java.util.Scanner;

public class BCMain {
	// tab 키를 누르면 다음 주요 포인트로 이동한다. 
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		// 이름=name,키=height, 몸무게=weight
		System.out.print("이름\t: ");
		String name = k.next();

		System.out.print("키\t: ");
		double height = k.nextDouble();

		System.out.print("몸무게\t: ");
		double weight = k.nextDouble();
		System.out.println("-------------");

		// obesity = 비만도, stdWeight = 표준체중
		// 비만도 및 표준체중 계산
		double obesity, stdweight = 0;
		stdweight = (double)((height - 100) * 0.9);
		obesity = (double)((weight / stdweight) * 100);

//		반올림 시험 코드
//		double obesity2, stdweight2 = 0;
//		stdweight2 = (double)Math.round((height - 100) * 0.90);
//		obesity2 = (double)Math.round((weight / stdweight) * 100.00);

		// 비만 및 정상 판정
		String state = (obesity > 120) ? "비만" : "정상";

		// 결과 Report
		System.out.printf("표준체중 : %.2fKg\n", stdweight); // 첫 코딩
		System.out.printf("비만도   : %.2f%%\n", obesity); // 첫코딩
		System.out.printf("%s씨는 %s입니다.\n", name, state);

		System.out.println("종료하려면 뭐라도 쓰시오.");
		k.next();
		k.close();
		
//		System.out.println("반올림 비교\t: String.format 사용");
//		System.out.println(String.format("표준체중\t: %.2fKg", stdweight));
//		System.out.println(String.format("비만도\t: %.2f%%", obesity));
//		System.out.printf("%s씨는 %s입니다.\n", name, state);
		// 공부해야 할 사항 String.format, Math.round 차이 기억해 두기
		
	}

}
