package com.matrix.dec226sp.main;

import java.util.Calendar;

import com.matrix.dec226sp.myphone.MyPhone;
import com.matrix.dec226sp.myself.Myself;

public class OMain {

	public static void main(String[] args) {
		// 이름이 이지상, 나이가 51, 집이 남양주
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
		
		// 내 핸드폰 모델명, 전화번호
		MyPhone mp1 = MyPhone.getMp();
		System.out.println(mp1);
		mp1.print();
		
		MyPhone mp2 = MyPhone.getInstance();
		System.out.println(mp2);
//		mp1.setNumber("010-2222-3333");
//		System.out.println(mp1.getNumber());
//		나의 폰 자체는 바뀌지 않지만 번호는 바꿀 수 있는
//		내 이름은 바꿀 수 있지만 내 자신이 바뀌지는 않는.
//		System.out.println(MyPhone.getMp());
		
		// 객체 - 틀로 찍어낸 제품 (instance라고도 함)
		// 클래스 - 틀
		Calendar.getInstance();
		
	}

}
