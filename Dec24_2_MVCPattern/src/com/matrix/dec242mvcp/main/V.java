package com.matrix.dec242mvcp.main;

import java.util.Scanner;

// View
//		������ ����ڵ鿡�� �������� ����
//		��/���
//		�����̳��� �۾�����

public class V {
	
	public static int getX() {
		Scanner k = new Scanner(System.in);
		System.out.print("��: ");
		int x = k.nextInt();
		return x;
	}
	
	public static void printResult(String result) {
		System.out.println(result);
	}
}
