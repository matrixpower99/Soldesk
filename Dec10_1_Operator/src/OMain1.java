import java.util.Scanner;

// 논리 결합 연산자는 1개만 사용해도 된다.
// || && 하지만 가능하다면 2개짜리를 사용 권
// 2개짜리는 선행 조건을 만족하지 못하면 거기서 종료.
// 1개짜리는 선행 조건을 만족하지 못하더라도 모든 조건을 끝까지 진행.

public class OMain1 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = k.next();

		System.out.print("키 : ");
		double height = k.nextDouble();

		System.out.print("나이 : ");
		int age = k.nextInt();
		System.out.println("-----------");

		// 90% 10%
		// 나이가 80살 미만이고 키가 200cm 초과
		// boolean z = (age <80 & height > 200);
		// 위의 코드는 90%확률로 2번 검사한다.

		// 수정된 코드 : 키를 먼저 체크하고 나이를 체크한다.
		// 10%확률로 2번 검사하고 90% 확률로 1번 검사한다.
		// && 쓸때는 확률 낮은 조건식을 먼저 배치.
		// 결과는 같지만 컴퓨터의 작업량이 달라진다. 실행속도.
		boolean z = (height > 200) && (age < 80);
		System.out.printf("조건 z: %s\n", (z) ? "예" : "아니오");

		// 키가 200cm이거나, 나이가 2살이 아니면
		// or는 두 조건 중 하나만 만족하면 OK
		// 아래의 코드는 희박한 조건을 먼저 체크하기 때문에 90%이상 확률로 2번 검사
		// boolean y = (height == 200) || (age !=2);

		// 아래의 수정된 코드는 90% 이상의 확률로 1번 검사
		// &&와 반대의 상황
		// || 쓸때는 확률 높은 상황을 앞으로 배치(먼저 체
		boolean y = (age != 2) || (height == 200);
		System.out.printf("조건 y: %s\n", (y) ? "예" : "아니오");
		// 조건식 배치에 따라서 실행속도에 차이가 나므로 확률을 잘 따져서 배치하자

		// 이름이 홍길동이거나 키가 100cm 이상이면
		boolean x = (height >= 100) || name.matches("홍길동");
		boolean x2 = (height >= 100) || name.equals("홍길동");
		System.out.printf("조건 x: %s\n", (x) ? "예" : "아니오");
		System.out.printf("조건 x2: %s\n", (x2) ? "예" : "아니오");

		// 키가 100cm 이상이고, 키가 150cm 이상이면 -> ??
		// 성립이 불가능한 문장. 대부분의 의뢰인이 생업에 바빠서 정신이 없음.
		boolean w = (height >= 150);
		System.out.printf("조건 w: %s\n", (w) ? "예" : "아니오");
		// 개발사 -> 개발자
		// 슈퍼마켓(개발언어를 모름) -> 개발사에 웹사이트 제작 의뢰

		// 나이가 짝수면
		boolean v = (age % 2 == 0); // 2로 나누어 나머지가 0이면 짝수
		System.out.printf("조건 v: %s\n", (v) ? "예" : "아니오");

		// 나이가 짝수거나 나이가 홀수면 -> ?
//		boolean u = (age != 0); // 나이가 0살이 아니면 짝수 또는 홀수 -> 내코드
		boolean u = true; // 강사님 수정 코드 -> 그냥 타라는 소리
		System.out.printf("조건 u: %s\n", (u) ? "예" : "아니오");

		// 5 < 나이 < 10살 이면
//		boolean t = (5 < age < 10); // 파이썬은 이런 코딩이 가능
		// 파이썬에서 쓰는 and or는 && ||와 같은 의미
		boolean t = (age < 10) && (age > 5); // &&는 확률이 적은것을 앞으로 배치
		System.out.printf("조건 t: %s\n", (t) ? "예" : "아니오");

		// 나이 <> 3살이면
		boolean s = (age != 3); // 3살만 아니면 조건을 만족
		System.out.printf("조건 s: %s\n", (s) ? "예" : "아니오");

		// 이름이 홍길동이 아니면
		// 결과를 뒤집고 싶으면 ! not 논리연산자 사용
		boolean r = !(name.equals("홍길동"));
//		boolean r = !(name.matches("홍길동")); // 정규식과 오브젝트의 차이점 공부
		System.out.printf("조건 r: %s\n", (r) ? "예" : "아니오");

		// 나이가 5살 이상이면 "타", 아니면 "집에 가"
		String q = (age >= 5) ? "타" : "집에 가";
		System.out.println(q);
		
		// 놀이기구 한번 탈때마다 포인트 적립
		// 10 < 나이 < 40이면 100포인트, 아니면 80 포인트
		int point = (age < 40) && (age > 10) ? 100 : 80; 
		System.out.printf("적립포인트 : %3d", point);
		
// 연산자 
//		단항연산자 !
//		2항연산자 1+2, 30*1.5, 나이 > 5, 등 대부분의 연산자
//		3항연산자 - 조건에 따라서 값을 대입하고 싶을 때
//		조건식 ? 참일때 값 : 거짓일 때 값
//		학문 앞에서 겸손하자. 기존 낡은 지식을 머리속에서 지우자.
		
	}
}
