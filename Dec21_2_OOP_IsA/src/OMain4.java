import java.util.Random;
import java.util.Scanner;

// A : �������¿��� �������� ���� ����
public class OMain4 {
	public static void main(String[] args) {
		// Ȧ���� ������ ���� ����
		Random r = new Random();
		int x = r.nextInt(1000);
		System.out.println(x);
		System.out.println("-----------------");
		
		MyRandom mr = new MyRandom();
		int y = mr.nextInt(10);
		System.out.println(y);
		
		// �Է� ���� �� �ڵ����� "��: " ��� Scanner
		
	}
}
