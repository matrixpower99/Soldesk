import java.sql.Time;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

// 프로그램 : 위 -> 아래로 차례대로 실행

// 제어문(Control Statement) : 흐름이 달라지도록 제어(변화가 생기도록)
// 		-> 조건문(Conditional Statement) : 조건에 따른 분기점
// 		-> 반복문(Repeat Statement) : 조건에 따른 반복

// 문법, 사용법이 어려운 게 아님.
// 적재적소에 사용하는 것에 대한 판단력
// 효율성 - 수학적 사고력 필요 (정보올림피라드 기출문제 풀어볼 것 : 풀기 쉽지 않음. 다양한 방법으로 풀어 볼 것)

// 정보올림피아드
//		10문제 -> 동점자가 많음 -> 속도 빠르고 용량 적게 
// 전공대학생 = 3:이론 2:실습 나머지 과제
// C언어 : 메모리 공간에 자유롭게 접근

// 프로그래밍 언어를 하나 마스터한다. 최적화.
//		조건문
//		반복문
//		컬렉션[변수=1 : 데이터n]
//		언어만의 특징 - 남이 작업한거 잘 쓰기(자신의 작업물 공유 문화)
//		=> 현재 날씨정도 확인하는 프로그램 만들기(결과물)
// 배우는 동안에는 오버해서 생각하지 말고, 주어진 조건이 무엇인지 차분히 생각해 보자.
//	if (조건식) {
//		조건식 만족했을 때 실행할 문장
//	} else {
//		조건식 만족하지 못했을 때 실행할 문장
//	}

public class CSMain {
	public static void main(String[] args) throws InterruptedException {
		Scanner k = new Scanner(System.in);
		System.out.print("나이: ");
		int age = k.nextInt();

		System.out.println("----------");
		System.out.printf("나이는 %d살\n", age); // \n자주 잊어버린다. 습관화 해보자.

		// 나이가 20살 이상이면 -> 어서오세요 출력
		// 아니면 1초쯤 멈췄다가 -> 나가 출력
		// 10 < 나이 < 20 : 부모님 모셔오면 입장 가능
		if (age >= 20) {
			System.out.println("어서오세요");
		} else {
			Thread.sleep(1000);
			System.out.println("나가");
			if (age > 10) { // 20살 이상이면 이미 입장가능하므로 10살 초과인지만 체크.
				System.out.println("부모님 모셔오면 입장 가능");
			}
		}

		System.out.println("ㅋㅋㅋㅋ");
		
	}
}
