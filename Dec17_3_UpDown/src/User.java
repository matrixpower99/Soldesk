import java.util.Scanner;

public class User {
	int uNum;
	int turn;
	Scanner mouth = new Scanner(System.in);

	public int tell() {
		int ans = mouth.nextInt();
		return (ans > 0 && ans <=1000) ? ans : tell();
//		int ans = 0;
//		return mouth.nextInt();
//		while (true) {
//			System.out.print("¹¹: ");
//			if (ans > 0 && ans <= 1000) {
//				uNum = ans;
//				break;
	}
}
