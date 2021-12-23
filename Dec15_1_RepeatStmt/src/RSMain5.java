import java.util.Random;

// 반복횟수 명확하다면 - for
// 반복조건이 명확하다면 - while, do-while(거의 의미가 없고 사용하지도 않음)

// 반복제어 - break, continue
public class RSMain5 {

	public static void main(String[] args) {
		// 0 ~ 10사이의 랜덤값 계속 출력(4가 뜨면 그만)
		Random r = new Random();
		int a = r.nextInt(11);
		System.out.println(a);
		while (a != 4) {
			a = r.nextInt(11);
			System.out.println(a);
		}
		System.out.println("---------------------");
		
		int b = 0;
		while (b != 4) { // 검사하고 나서 실행
			b = r.nextInt(11);
			System.out.println(b);
		}
		System.out.println("---------------------");
		
		// 최소 1번의 반복은 보장됨
		do { // 실행하고 나서 검사
			a = r.nextInt(11);
			System.out.println(a);
		} while (a != 4);
		
	}

}
