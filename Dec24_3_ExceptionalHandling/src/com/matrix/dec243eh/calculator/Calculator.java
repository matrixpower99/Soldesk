package com.matrix.dec243eh.calculator;

public class Calculator {

	// ���� : 7 - 8 - 9 - 14 - 15 - 10
	// ���� �� : 7 - 8 - 9[����] - 11 - 12 - 14 - 15 - 13 
	public static int divide(int a, int b) {
		try {
			int c = a / b;
			return c;
		} catch (Exception e) {
			System.out.println("������ 0����");
			return -999;
		} finally {
			System.out.println("�޸� ũ��������"); // ���ݰ� ���� ��Ȳ�� ����ϴ°� finally
		}
//		System.out.println("�޸� ũ��������"); // return ���ķ� ���� �ȵǴ� �ڵ�
	}
}
