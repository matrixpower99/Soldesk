// 함수(function) - 자바에서는 method 
// 		연관된 작업들을 묶어서 정의해놓고, 필요할때마다 작업을 호출.
// 		소스정리
//		똑같은 작업을 여러번 해야할 때 소스가 짧아짐.
//		수정 및 관리가 용이해짐. 소스의 수정해야 할 부분을 찾기가 편해짐. 

// ctrl + shift + (numpad) */ -> 전체 메소드(함수) 펴기 / 접기.

public class FMain {
	public static void yaDambae() {
		System.out.println("야 5천원 줄테니까");
		System.out.println("동네슈퍼로 가서");
		System.out.println("한라산 한갑 달라고 하고");
		System.out.println("돈 남는거 너 사탕하나 사먹고");
		System.out.println("한라산은 가져와");
	}
	
	public static void main(String[] args) {
		yaDambae();
		System.out.println("----------------");
		
		int a = 10 + 20;
		System.out.println(a);

		yaDambae();
	}

}
