
public class MainFunc1 {
	
	// JVM�� �ڵ����� ȣ���� ��
	// ���α׷� ������ �� ���α׷������� ���� �ַ���
	// ���� ���� ���� : java -jar xxx.jar
	// ���� �ַ��� java -jar xxx.jar AAA BBB CCC
	// ������ �м��� �� �м��� ���ϸ� ���� ���� �� ����� ����
	public static void main(String[] args) throws InterruptedException {
		for (String string : args) {
			System.out.println(string);
		}
		Thread.sleep(5000);
	}
}
