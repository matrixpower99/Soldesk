package com.matrix.dc232fp.car;

import java.util.Scanner;

public class CarFactory {
	private int carCount;

	public Car make() {
		Scanner k = new Scanner(System.in);
		System.out.print("��[1.�ý� 2.����]");
		int what = k.nextInt();

		System.out.print("�̸�: ");
		String name = k.next();
		System.out.print("��ȣ: ");
		String no = k.next();
		carCount++;
		if (what == 1) {
			System.out.print("�ý�����: ");
			String taxiType = k.next();
			System.out.println("-----------------");
			return new Taxi(name, no, carCount, taxiType);
		} else {
			System.out.print("��������: ");
			String busType = k.next();
			System.out.print("���ν�: ");
			int nop = k.nextInt();
			System.out.println("-----------------");
			return new Bus(name, no, carCount, busType, nop);
		}

	}
}
