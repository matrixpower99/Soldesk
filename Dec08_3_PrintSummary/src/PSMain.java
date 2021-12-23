
public class PSMain {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("*********************************");
		System.out.println("* 이름\t\t: 권기웅\t*");
		System.out.printf("* 사는곳\t: %s\t\t*\n", "분당");
		System.out.printf("* 나이\t\t: %d\t\t*\n", 35);
		System.out.printf("* 시력\t\t: %.1f\t\t*\n", 2.0);
		System.out.println("*********************************");
		
		Thread.sleep(3000);
	}
}
