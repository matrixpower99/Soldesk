import java.util.Scanner;

public class FMain6 {
	public static String getName() {
		Scanner k = new Scanner(System.in);
		System.out.print("이름 : ");
//		String name = k.next();
//		return name;
//		k.close();
		return k.next(); // 1회용으로 쓸거면 변수를 줄이자
	}
	
	public static double getHeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("키 : ");
		double height = k.nextDouble();
		// while 사용하지 않고 3항연산자로도 while 루틴을 구현할 수 있다.
		// 키가 1보다 작거나 300을 넘으면 재입력 요구
//		height = (height < 1 || height > 300) ? getHeight() : height; // 첫 코드
//		return height;
//		k.close();
		return (height < 1 || height > 300) ? getHeight() : height; // 수정 코드
	}
	
	public static double getWeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("몸무게 : ");
		double weight = k.nextDouble();
//		weight = (weight > 0 && weight < 200) ? weight : getWeight(); // 첫 코드
//		return weight;
//		k.close();
		return (weight < 0 || weight > 300) ? getWeight() : weight; // 수정 코드
	}
	
	public static double getStdWeight(double h) {
		// 표준체중 계산
		return (double)((h - 100) * 0.9);
	}
	
	public static double getObseity(double sw, double w) {
		// 비만도 계산
		return (double)((w / sw) * 100);
	}
	
	public static String getResult(double b) {
		// 비만 및 정상 판정
		return (b > 120) ? "비만" : "정상";
	}
	
	public static void printReport(double stdweight, double obesity, String name, String state) {
		// 결과 출력
		System.out.println("-------------");
		System.out.printf("표준체중 : %.2fKg\n", stdweight);
		System.out.printf("비만도   : %.2f%%\n", obesity);
		System.out.printf("%s씨는 %s입니다.\n", name, state);
	}
	
	public static void main(String[] args) {
		String name = getName();
		double height = getHeight();
		double weight = getWeight();
		double stdweight = getStdWeight(height);
		double obesity = getObseity(stdweight, weight);
		
		// 비만 및 정상 판정
		String state = getResult(obesity);

		// 결과 출력
		printReport(stdweight, obesity, name, state);
		

	}

}
