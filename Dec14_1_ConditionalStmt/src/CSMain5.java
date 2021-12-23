//switch (대상) {
//	case 값A(대상의):
//		대상의 값 A 일때 여기 실행
//		break;
//	case 값B :
//		대상의 값 B 일때 여기 실행
//		break;
//	...
//	default:
//		위에 해당사항 없으면 실행
//		break;
//} 

// case 값 들어가는 자리에 조건식 사용 불가 -> if문보다 기능이 부족?
// 문법이 별남. break가 없으면 그 아래라인까지 계속 실행된다.
// break로 기교 부리는 맛에 사용한다. 실전에서 쓰는 용도가 딱 하나 있다.
// 
public class CSMain5 {

	public static void main(String[] args) {
//		int age= 30;
////		age /= 10;
//		
//		switch (age) {
//		case 30:
//			System.out.println("서른");
//			break;
//		case 40:
//			System.out.println("마흔");
//			break;
//		default:
//			System.out.println("I don't know.");
//			break;
//		}
		String rank = "일병";
		
		System.out.println(rank);
		System.out.println("----------------");
		switch (rank) {
		case "이병":
			System.out.println("눈치");
		case "일병":
			System.out.println("관등성명");
		case "상병":
			System.out.println("훈련");
		default:
			System.out.println("잠");
			break;
		}
		System.out.println("---------------");			
		
		// 1.5 : 크게 바뀜. 문자로 switch 조건을 사용가능하도록 변경 
		// 1.8 : 현재 주력
		
		String role = "DBA";
		// 권한처리에 break를 일부러 빼고 사용할 때 유용하다.
		switch (role) {
		case "DBA":
			System.out.println("전원관리");
			System.out.println("백업/복구");
		case "DBP":
			System.out.println("CRUD");
		default:
			System.out.println("서비스 사용");
			break;
		}
		
		
	}

}
