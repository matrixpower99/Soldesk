package com.matrix.dec226sp.main;

import java.util.Calendar;

import com.matrix.dec226sp.myphone.MyPhone;
import com.matrix.dec226sp.myself.Myself;

public class OMain {

	public static void main(String[] args) {
		// �̸��� ������, ���̰� 51, ���� ������
		Myself my1 = Myself.getMy();
		System.out.println(my1);
		my1.print();
		System.out.println("----------------");
		
		Myself my2 = Myself.getMy();
		System.out.println(my2);
		my2.print();
		System.out.println("----------------");
		
		Myself my3 = Myself.getMy();
		System.out.println(my3);
		my3.print();
		System.out.println("----------------");
		
		// �� �ڵ��� �𵨸�, ��ȭ��ȣ
		MyPhone mp1 = MyPhone.getMp();
		System.out.println(mp1);
		mp1.print();
		
		MyPhone mp2 = MyPhone.getInstance();
		System.out.println(mp2);
//		mp1.setNumber("010-2222-3333");
//		System.out.println(mp1.getNumber());
//		���� �� ��ü�� �ٲ��� ������ ��ȣ�� �ٲ� �� �ִ�
//		�� �̸��� �ٲ� �� ������ �� �ڽ��� �ٲ����� �ʴ�.
//		System.out.println(MyPhone.getMp());
		
		// ��ü - Ʋ�� �� ��ǰ (instance��� ��)
		// Ŭ���� - Ʋ
		Calendar.getInstance();
		
	}

}
