import java.util.Scanner;

// 1. ������
// ���� �ѷ�: (�� �� ���� �ѷ��� ���ٰ� ����)
// �� ��� ��� ��:
// �� ��� ��� ��:
// �� ���� Ƚ�� : (��� ���� Ƚ��. �� ����?)
// ----------------------------------
// �̵��Ÿ� : 

public class PMain {
	public static double WheelRate() {
		Scanner k = new Scanner(System.in);
		System.out.print("�����ѷ�(cm) : ");
		double wv = k.nextDouble();
		wv = (wv > 0) ? wv : WheelRate();
		return (double)wv / 100; //m(����) ������ ����
	}
	
	public static double gearRate() {
		Scanner k = new Scanner(System.in);
		System.out.print("�� ��� ��� ��: ");
		double fg = k.nextInt();
		System.out.print("�� ��� ��� ��: ");
		double bg = k.nextInt();
		return (double)fg / bg; 
	}
	
	public static double getNor() {
		Scanner k = new Scanner(System.in);
		System.out.print("�� ���� Ƚ��: ");
		double nr = k.nextDouble();
		return (nr > 0) ? nr : getNor();
		
	}
	public static void main(String[] args) {
		// �̵��Ÿ� = �����ѷ� * Ƚ�� * (�ձ�� / �ޱ��)
		double wvr, gr, nr, mv;
		wvr = WheelRate();
		gr = gearRate();
		nr = getNor();
		mv = (double) wvr * gr * nr;
		System.out.println(mv + "m �̵�");
		
	}
}
