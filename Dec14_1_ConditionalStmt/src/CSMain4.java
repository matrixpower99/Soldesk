import java.util.Scanner;

// ���ǹ�
//		if - else if - else
//		switch - case

public class CSMain4 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = k.next();
		System.out.println("-------------");
		// ��浿 : ����
		// �ٸ��̸� : xxx�� �ȳ� ���
		if (name.equals("��浿")) {
			System.out.println("�� ��");
		} else {
			System.out.println(name + "�� �ȳ�");
		}
		
		System.out.println("-------------");
		// switch - case ��� : case�� ���ڸ� ���� ���� �ƴϴ�.
		switch (name) {
		case "��浿":
			System.out.println("�� ��");
			break;
		case "�ڱ浿":
			System.out.println("�ȳ��Ͻʴϱ�");
			break;
		default:
			System.out.println(name + "�� �ȳ�");
			break;
		}
	}

}
