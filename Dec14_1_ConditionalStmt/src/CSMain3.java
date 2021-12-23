import java.util.Scanner;
// BMI(체질량 지수) 구하여 비만도 판정

public class CSMain3 {
	public static String getName() {
		Scanner k = new Scanner(System.in);
		System.out.print("이름 : ");
		return k.next();
	}
	
	public static double getHeight() {
//		Scanner k = new Scanner(System.in);
//		System.out.print("키(Cm) : ");
//		double height = k.nextDouble();
//		return (height < 1 || height > 300) ? getHeight() : height;
		Scanner k = new Scanner(System.in);
		System.out.print("키(m) : "); // 미터로 입력인 것에 유의
		double height = k.nextDouble();
		if (height < 0) { // 0보다 작으면 -값 입력으로 판단하고 곱하기 -1
			height *= -1;
		}
		if (height >= 3) { // 3m보다 크면 cm값으로 입력한 것으로 판단하고 나누기 100
			height /= 100;
		}
		return height;
	}
	
	public static double getWeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("몸무게(kg) : ");
		double weight = k.nextDouble();
		return (weight < 0) ? (weight * -1) : weight; // 체중이 0보다 작으면 오입력으로 판단 -1을 곱해준다. 
		// if문과 차이점 비교. 간결함. 3항 연산자를 적극적으로 잘써먹자.
	}
	
	public static double getBMI(double hn, double wn) { // wn=체중, hn=키
		return wn / (hn * hn); // 입력 받을 때 m로 입력 받았으므로 바로 제곱  
//		double result = wn / Math.pow((hn / 100), 2);
//		System.out.println(result);
//		return result;
	}
	
	public static String clacBMI(double nb) {
		if (nb >= 35 ) {
			return "고도 비만";
		// return문장이 있기 때문에 이후 문장은 else if의 의미가 없다.
		} 
		if (nb >= 30) {
			return "중도(2단계) 비만";
		} 
		if (nb >= 25) {
			return "경도(1단계) 비만";
		} 
		if (nb >= 23) {
			return "과체중";
		} 
		if (nb >= 18.5) {
			return "정상";
		} 
		return "저체중";
		
//		if (nb <= 18.0) { // 내 코드
//			result ="저체중";
//		} else if (nb <= 22.9) {
//			result = "정상";
//		} else if (nb <= 24.9) {
//			result = "과체중";
//		} else if (nb <= 29.9) {
//			result = "경도(1단계)비만";
//		} else if (nb <= 34.9) {
//			result = "중도(2단계)비만";
//		} else {
//			result = "고도 비만";
//		}
//		return result;
	}
	
	public static void printResult(String n, double nb, String cb) {
		// n=이름, nb=bmi지수, cb=비만도판정
		System.out.println("----------------");
		System.out.printf("BMI : %.2f\n", nb);
		System.out.printf("%s씨는 \"%s\" 입니다.\n", n, cb);
	}
	
	public static void main(String[] args) {
		String name = getName();
		double height = getHeight();
		double weight = getWeight();
		double nbmi = getBMI(height, weight);
		String cbmi = clacBMI(nbmi);
		
		printResult(name, nbmi, cbmi);
	}

}
