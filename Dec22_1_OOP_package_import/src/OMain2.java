// Ŭ������ �ߺ�? �ڹ��� Ư���� ����ϰ� �߻� -> ���� �۾����ذ�(���̺����)�� ���������� ���� Java

// package > class 
// package : Ŭ�������� �ߺ��� �� ������ ����
//		class�� ���� �� �� package�ӿ� �ֱ� -> �� �ٴ��� ���
//		package����� �ߺ��Ǹ� ������ ������ ���� -> ������ ����
//			-> package ���� ������������ �����ؾ�(����ũ)
//			com.ȸ���(������Ʈ �ּҸ� �Ųٷ�).���α׷���.ī�װ� -> �����ڵ鰣�� ���(Java �ٴ��� ���)
// ex)
// com.soldesk.calculator
// com.soldesk.bmi.main
// com.soldesk.bmi.doctor
// com.soldesk.bmi.calc
public class OMain2 {
	public static void main(String[] args) {
		// ��ü ����
		// 		Ŭ������ ������ = new ������; -> �����
		//		��Ű����.Ŭ������ ������ = new ��Ű����.Ŭ������(); -> ���� ����
		java.lang.String s = new java.lang.String("��"); // ���� ����
		
		java.util.Scanner k = new java.util.Scanner(java.lang.System.in); // ���� ���� -> Ŭ������ �ߺ��� ó�����
		System.out.print("��: ");
		String msg = k.next();
		System.out.println(msg);
		
		Scanner sc = new Scanner("ĳ��123", 500000, 10);
		sc.print();
		
	}
}
