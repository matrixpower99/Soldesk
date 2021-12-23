import java.util.Scanner;

// 1. 자전거
// 바퀴 둘레: (앞 뒤 바퀴 둘레는 같다고 가정)
// 앞 기어 톱니 수:
// 뒷 기어 톱니 수:
// 발 굴린 횟수 : (페달 돌린 횟수. 몇 바퀴?)
// ----------------------------------
// 이동거리 : 

public class PMain {
	public static double WheelRate() {
		Scanner k = new Scanner(System.in);
		System.out.print("바퀴둘레(cm) : ");
		double wv = k.nextDouble();
		wv = (wv > 0) ? wv : WheelRate();
		return (double)wv / 100; //m(미터) 값으로 리턴
	}
	
	public static double gearRate() {
		Scanner k = new Scanner(System.in);
		System.out.print("앞 기어 톱니 수: ");
		double fg = k.nextInt();
		System.out.print("뒷 기어 톱니 수: ");
		double bg = k.nextInt();
		return (double)fg / bg; 
	}
	
	public static double getNor() {
		Scanner k = new Scanner(System.in);
		System.out.print("발 굴린 횟수: ");
		double nr = k.nextDouble();
		return (nr > 0) ? nr : getNor();
		
	}
	public static void main(String[] args) {
		// 이동거리 = 바퀴둘레 * 횟수 * (앞기어 / 뒷기어)
		double wvr, gr, nr, mv;
		wvr = WheelRate();
		gr = gearRate();
		nr = getNor();
		mv = (double) wvr * gr * nr;
		System.out.println(mv + "m 이동");
		
	}
}
