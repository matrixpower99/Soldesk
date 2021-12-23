// 변수 왜 만드나? -> 데이터 임시 저장하려고
// 객체 왜 만드나? -> 실생활을 묘사한 변수 만들려고

// 멤버변수없음 -> 저장할 데이터가 없음 -> 객체 만들 필요 없음
// -> static메소드 기반
public class Calculator {
	public static void printSum(int x, int y) {
		System.out.println(x + y);
	}
}
