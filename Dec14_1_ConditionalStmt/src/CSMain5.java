//switch (���) {
//	case ��A(�����):
//		����� �� A �϶� ���� ����
//		break;
//	case ��B :
//		����� �� B �϶� ���� ����
//		break;
//	...
//	default:
//		���� �ش���� ������ ����
//		break;
//} 

// case �� ���� �ڸ��� ���ǽ� ��� �Ұ� -> if������ ����� ����?
// ������ ����. break�� ������ �� �Ʒ����α��� ��� ����ȴ�.
// break�� �ⱳ �θ��� ���� ����Ѵ�. �������� ���� �뵵�� �� �ϳ� �ִ�.
// 
public class CSMain5 {

	public static void main(String[] args) {
//		int age= 30;
////		age /= 10;
//		
//		switch (age) {
//		case 30:
//			System.out.println("����");
//			break;
//		case 40:
//			System.out.println("����");
//			break;
//		default:
//			System.out.println("I don't know.");
//			break;
//		}
		String rank = "�Ϻ�";
		
		System.out.println(rank);
		System.out.println("----------------");
		switch (rank) {
		case "�̺�":
			System.out.println("��ġ");
		case "�Ϻ�":
			System.out.println("�����");
		case "��":
			System.out.println("�Ʒ�");
		default:
			System.out.println("��");
			break;
		}
		System.out.println("---------------");			
		
		// 1.5 : ũ�� �ٲ�. ���ڷ� switch ������ ��밡���ϵ��� ���� 
		// 1.8 : ���� �ַ�
		
		String role = "DBA";
		// ����ó���� break�� �Ϻη� ���� ����� �� �����ϴ�.
		switch (role) {
		case "DBA":
			System.out.println("��������");
			System.out.println("���/����");
		case "DBP":
			System.out.println("CRUD");
		default:
			System.out.println("���� ���");
			break;
		}
		
		
	}

}
