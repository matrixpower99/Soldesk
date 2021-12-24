package com.matrix.dec242mvcp.main2;

import java.util.Scanner;

public class V {

	public static XY getXY() {
		Scanner k = new Scanner(System.in);
		System.out.print("x: ");
		int x = k.nextInt();
		System.out.print("y: ");
		int y = k.nextInt();
		System.out.println("-------------");
		
		XY xy = new XY(x, y);
		return xy;
	}
	
	public static void printResult(XY xy) {
		System.out.printf("%d + %d = %d\n",xy.getX(), xy.getY(), xy.getPlus());
		System.out.printf("%d - %d = %d\n",xy.getX(), xy.getY(), xy.getMinus());
		System.out.printf("%d * %d = %d\n",xy.getX(), xy.getY(), xy.getMul());
		System.out.printf("%d / %d = %d\n",xy.getX(), xy.getY(), xy.getDiv());
	}
}
