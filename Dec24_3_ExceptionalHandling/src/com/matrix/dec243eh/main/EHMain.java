package com.matrix.dec243eh.main;

import java.util.InputMismatchException;
import java.util.Scanner;

// error : java������ ���� �ʾƼ� ����� ������ �Ұ����� ����(������ �Ұ��� ����)
//			���α׷��� �ϼ����� ����
//			������ �߸�

// warning : �������� �ҽ�(������ �ȵ�)
//			���α׷��� �ϼ���, �������ִ°� ����
//			������ �߸�

// exception : ���α׷����� ���� ����, ������ �� �ܺ����� ���ο� ���� ��������� �ȵǴ� 
//			���α׷��� �ϼ���
//			������ �߸��� �ƴ�����, ���� �س���
//		try {
//			������ ����
//		} catch (Exception�̸� ������) {
//			�� Exception�� �߻��ϸ� ���� ����
//		} catch (Exception�̸� ������) {
//			�� Exception�� �߻��ϸ� ���� ����
//		} ...
//		} finally {
//			Exception �߻����ο� ������� ����, return���� ����
//			�߰��� return�� ���� �� ���
//		}	

// exception ó���� ���� ����
// java - ������ �ؾ� �� -> ���ϸ� ����
// python -> �ϵ� ���� ����

public class EHMain {

	public static void main(String[] args) {
		// ������ 0�� ���� : ���� �̷�
		// �� ���� :�ʵ� -> �����ϱ� �Ⱦ
		// ģ�������� �ڶ�
		try {
			
		} catch (InputMismatchException e) {
			System.out.println("������ �Է����ּ���");
		}
		Scanner k = new Scanner(System.in);
		System.out.print("x : ");
		int x = k.nextInt();
		System.out.print("y : ");
		int y = k.nextInt();
		System.out.println("--------------");

//		try {
//			int d = x / y;
//			System.out.printf("%d / %d = %d\n", x, y, d);
//
//			int[] ar = { 123, 234 };
//			System.out.println(ar[y]);
//			
//		} catch (ArithmeticException e) {
//			System.out.println("������ 0�� ����");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("�迭�� �װ� ����");
//		}

		try {
			int d = x / y;
			System.out.printf("%d / %d = %d\n", x, y, d);

			int[] ar = { 123, 234 };
			System.out.println(ar[y]);
			
		} catch (Exception e) {
			System.out.println("�Ͽ�ư ���� �߻�");
			e.printStackTrace(); // ���� ���(�����ڿ�). ���α׷� �ϼ� �� ����
		} finally {
			System.out.println("������ ����");
		}
		
		int a = x + y;
		int b = x - y;
		int c = x * y;

		System.out.printf("%d + %d = %d\n", x, y, a);
		System.out.printf("%d - %d = %d\n", x, y, b);
		System.out.printf("%d * %d = %d\n", x, y, c);
	}
}
