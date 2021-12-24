package com.matrix.dec242mvcp.main;

import java.util.Scanner;

// View
//		실제로 사용자들에게 보여지는 영역
//		입/출력
//		디자이너의 작업영역

public class V {
	
	public static int getX() {
		Scanner k = new Scanner(System.in);
		System.out.print("뭐: ");
		int x = k.nextInt();
		return x;
	}
	
	public static void printResult(String result) {
		System.out.println(result);
	}
}
