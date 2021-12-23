import java.util.Scanner;

public class IMain {
	public static void main(String[] args) {
		// 콘솔창에 키보드로 입력할 준비
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("CPU : ");
		// 입력받은 글자 데이터를 cpu라는 변수에 저장
		String cpu = keyboard.next();

		System.out.print("RAM : ");
		// 입력받은 실수 데이터를 ram이라는 변수에 저장
		double ram = keyboard.nextDouble();
		
		System.out.print("HDD : ");
		int hdd = keyboard.nextInt();
		
		System.out.printf("CPU : %s\n", cpu);
		System.out.printf("RAM : %.0fGB\n", ram);
		System.out.printf("HDD : %dGB", hdd);
	}
}



