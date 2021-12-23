
public class VMain3 {
	public static void main(String[] args) {
		// 본인 컴퓨터 CPU 모델명을 임시 저장
		String cpu = "i5-8500";

		// 본인 컴 RAM 용량 임시 저장
		double ram = 8.00;
		
		// 본인 컴 HDD 용량 임시 저장
		int hdd = 931;
		
		// 콘솔창에 정보출력
		System.out.printf("CPU : %s\n", cpu);
		System.out.printf("RAM : %.0fGB\n", ram);
		System.out.printf("HDD : %dGB", hdd);
	}
}
