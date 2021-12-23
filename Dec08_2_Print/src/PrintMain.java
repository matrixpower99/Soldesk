
public class PrintMain {

	public static void main(String[] args) {
		// 중간 확인용
		// 콘솔창에 뭐 출력하고 줄바꿈 
		System.out.println("ㅋㅋㅋ");

		// 콘솔창에 뭐 출력
		System.out.print("ㅎㅎㅎ");
		
		// 콘솔창에 형식 지정해서 뭐 출력
		System.out.printf("%.2f", 123.456789);
		System.out.println("ㅡㅡ");
		System.out.println("-----------------------");
		
		// 특수문자[모든 프로그래밍 언어들의 공통]
		//		\t - tab키
		//		\n - new line(줄만 바꾸기)
		//		\r - carriage return(커서를 맨 앞으로)
		//		\b - backspace(1byte 지우기)
		//			java : 1글자 = 2byte
		//			c언어 : 1글자 = 1byte
		//		\\ - \
		//		\" - "
		
		
		// 정상적인 줄바꿈을 하려면 \r\n을 해야
		// 출력장치 중에는 \n만 있어도 정상 줄바꿈처리를 해주는 경우가 있음
		//		콘솔창, Windows10의 메모장은 정상처리 해주는데
		//		Windows7까지의 메모장은 깨짐
		
		System.out.println("언제\t: 금요일");
		System.out.println("뭐\t: 학원 인터넷 작업");
		System.out.println("그래서\r\n: 수업시간에 난리 좀 날걸요\b");
		System.out.println("\\(^^)/");
		System.out.println("\\(\" \")/");
		System.out.println("----------------------------");
		
		// 따옴표 안친 글자는 자바 문법
		// 따옴표로 둘러친 글자는 글자 데이터
		System.out.println("ㅋ");
		System.out.println(123);
		System.out.println(123.345);
		
		// 정수(소수점 없는)데이터가 들어올 자리 : %d
		// %03d
		System.out.printf("숫자 : %d ㅋㅋㅋ\n", 1);
		System.out.printf("hero_kick_%02d.png", 2);
		System.out.println();
		// 실수(소수점 있는)데이터가 들어올 자리 : %f
		// %.2f
		System.out.printf("숫자아 : %f\n", 1231.2123);
		System.out.printf("숫자아 : %.2f\n", 1231.2173);
		// 글자데이터가 들어올 자리 : %s
		System.out.printf("글자 : %s\n", "ㅋ");
		
		System.out.printf("키 : %dcm, 몸무게 : %fkg\n", 180, 80.123);
		
		// %% : %(printf때만)
		System.out.printf("등수 : %d\n상위 %.1f%%", 3, 10.12);
	}

}

// 전공
// 3시간
// 2시간 - 실습[조교 - 저 3시간동안 배운걸로 할수있는 문제 - 다 한사람 가]






