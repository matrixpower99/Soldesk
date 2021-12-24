package com.matrix.dec242mvcp.main2;

public class M {
	public static void calc(XY xy) {
		int a = xy.getX() + xy.getY();
		int b = xy.getX() - xy.getY();
		int c = xy.getX() * xy.getY();
		int d = xy.getX() / xy.getY();
		
		xy.setPlus(a);
		xy.setMinus(b);
		xy.setMul(c);
		xy.setDiv(d);
	}
}
