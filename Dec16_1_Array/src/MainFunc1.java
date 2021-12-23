
public class MainFunc1 {
	
	// JVM이 자동으로 호출해 줌
	// 프로그램 실행할 때 프로그램쪽으로 정보 주려면
	// 원래 실행 명렁어 : java -jar xxx.jar
	// 정보 주려면 java -jar xxx.jar AAA BBB CCC
	// 빅데이터 분석할 때 분석할 파일명 등을 넣을 때 사용할 예정
	public static void main(String[] args) throws InterruptedException {
		for (String string : args) {
			System.out.println(string);
		}
		Thread.sleep(5000);
	}
}
