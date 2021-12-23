import java.util.Scanner;

// 거스름돈 계산
// 구매금액 : 48300
// 낸 돈 : 50000
// ----------------
// 거스롬돈: 1700원
// 5만원 : 
// 1만원 : 
// 5천원 : 
// 1천원 : 
// 5백원 : 
// 1백원 : 
// 10원 : 

public class PMain2 {

	public static void main(String[] args) {
//		Scanner k = new Scanner(System.in);
//		System.out.print("구매금액 : ");
//		int pm = k.nextInt();
//		System.out.print("낸 돈 : ");
//		int im = k.nextInt();
//		System.out.println("----------------");
//		int cm = pm - im;
//		System.out.println("거스름 돈 : " + cm);
//		System.out.println();

		int cm = 178630;
		int mu = 50000, count = 1;
		while (cm > 10) {
			if (cm > mu) {
				System.out.printf("%d원 : %d개\n", mu, cm / mu);
				cm %= mu;
				mu = (count % 2 == 1) ? mu / 5 : mu / 2;
				count++;
			}
		}
		System.out.println("---------------");

		//		for (int m : money) {
//			System.out.printf("%d원 : %d개\n", m, cm / m);
//			cm %= m;
//		}
		
		
//		if (cm > 50000) {
//			int t50000 = cm / 50000;
//			System.out.println("5만원" + t50000);
//			cm %= 50000;
//		}
//		if (cm > 10000) {
//			int t10000 = cm / 10000;
//			System.out.println("1만원" + t10000);
//			cm %= 10000;
//		}
//		if (cm > 5000) {
//			int t5000 = cm / 5000;
//			System.out.println("5천원" + t5000);
//			cm %= 5000;
//		}
//		if (cm > 1000) {
//			int t1000 = cm / 1000;
//			System.out.println("1천원" + t1000);
//			cm %= 1000;
//		}
//		if (cm > 500) {
//			int t500 = cm / 500;
//			System.out.println("5백원" + t500);
//			cm %= 500;
//		}
//		if (cm > 100) {
//			int t100 = cm / 100;
//			System.out.println("1백원" + t100);
//			cm %= 100;
//		}
//		if (cm > 10) {
//			int t10 = cm / 10;
//			System.out.println("1십원" + t10);
//			cm %= 10;
//		}
		
//		int[] arr = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
//		for (int i = 0; i < arr.length; i++) {
//			// 금액을 대입해서 자동계산
//			if (cm / arr[i] > 0) {
//				System.out.println(arr[i] + "원 : " + cm / arr[i] + " 개 ");
//				cm %= arr[i];
//			}
//		}
	}
}
