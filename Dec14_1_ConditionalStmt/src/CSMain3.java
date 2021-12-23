import java.util.Scanner;
// BMI(ü���� ����) ���Ͽ� �񸸵� ����

public class CSMain3 {
	public static String getName() {
		Scanner k = new Scanner(System.in);
		System.out.print("�̸� : ");
		return k.next();
	}
	
	public static double getHeight() {
//		Scanner k = new Scanner(System.in);
//		System.out.print("Ű(Cm) : ");
//		double height = k.nextDouble();
//		return (height < 1 || height > 300) ? getHeight() : height;
		Scanner k = new Scanner(System.in);
		System.out.print("Ű(m) : "); // ���ͷ� �Է��� �Ϳ� ����
		double height = k.nextDouble();
		if (height < 0) { // 0���� ������ -�� �Է����� �Ǵ��ϰ� ���ϱ� -1
			height *= -1;
		}
		if (height >= 3) { // 3m���� ũ�� cm������ �Է��� ������ �Ǵ��ϰ� ������ 100
			height /= 100;
		}
		return height;
	}
	
	public static double getWeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("������(kg) : ");
		double weight = k.nextDouble();
		return (weight < 0) ? (weight * -1) : weight; // ü���� 0���� ������ ���Է����� �Ǵ� -1�� �����ش�. 
		// if���� ������ ��. ������. 3�� �����ڸ� ���������� �߽����.
	}
	
	public static double getBMI(double hn, double wn) { // wn=ü��, hn=Ű
		return wn / (hn * hn); // �Է� ���� �� m�� �Է� �޾����Ƿ� �ٷ� ����  
//		double result = wn / Math.pow((hn / 100), 2);
//		System.out.println(result);
//		return result;
	}
	
	public static String clacBMI(double nb) {
		if (nb >= 35 ) {
			return "�� ��";
		// return������ �ֱ� ������ ���� ������ else if�� �ǹ̰� ����.
		} 
		if (nb >= 30) {
			return "�ߵ�(2�ܰ�) ��";
		} 
		if (nb >= 25) {
			return "�浵(1�ܰ�) ��";
		} 
		if (nb >= 23) {
			return "��ü��";
		} 
		if (nb >= 18.5) {
			return "����";
		} 
		return "��ü��";
		
//		if (nb <= 18.0) { // �� �ڵ�
//			result ="��ü��";
//		} else if (nb <= 22.9) {
//			result = "����";
//		} else if (nb <= 24.9) {
//			result = "��ü��";
//		} else if (nb <= 29.9) {
//			result = "�浵(1�ܰ�)��";
//		} else if (nb <= 34.9) {
//			result = "�ߵ�(2�ܰ�)��";
//		} else {
//			result = "�� ��";
//		}
//		return result;
	}
	
	public static void printResult(String n, double nb, String cb) {
		// n=�̸�, nb=bmi����, cb=�񸸵�����
		System.out.println("----------------");
		System.out.printf("BMI : %.2f\n", nb);
		System.out.printf("%s���� \"%s\" �Դϴ�.\n", n, cb);
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
