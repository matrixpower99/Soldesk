package com.matrix.dc232fp.car;

import java.util.Scanner;

public class CarFactory {
	private int carCount;

	public Car make() {
		Scanner k = new Scanner(System.in);
		System.out.print("뭐[1.택시 2.버스]");
		int what = k.nextInt();

		System.out.print("이름: ");
		String name = k.next();
		System.out.print("번호: ");
		String no = k.next();
		carCount++;
		if (what == 1) {
			System.out.print("택시종류: ");
			String taxiType = k.next();
			System.out.println("-----------------");
			return new Taxi(name, no, carCount, taxiType);
		} else {
			System.out.print("버스종류: ");
			String busType = k.next();
			System.out.print("몇인승: ");
			int nop = k.nextInt();
			System.out.println("-----------------");
			return new Bus(name, no, carCount, busType, nop);
		}

	}
}
