// 사람이 사는곳으로 지구
public class OMain2 {
	// 홍길동, 30살 사람
	public static void main(String[] args) {
		
		Human h = new Human("홍길동", 30);
		h.print();
		System.out.println("--------------");
		
		// 김길동, 20살 사람
		Human h2 = new Human("김길동", 20);
		h2.print();
		System.out.println("--------------");

		// h의 이름
		// h가 사는별
		System.out.println(h.name);
		System.out.println(Human.home.name);
		System.out.println("--------------");
		
		// 사람들이 사는 별의 정보출력
		Human.home.print();
		System.out.println("--------------");
		
		// 사람 : 홍길동/김기동
		//		사람들이 다 지구에
		//		그 지구의 정보출력기능
		
		// 시스템 : Windows/linux
		//		시스템들이 다 같은 콘솔창 씀
		//		그 콘솔창에 정보출력기능
	}
}
