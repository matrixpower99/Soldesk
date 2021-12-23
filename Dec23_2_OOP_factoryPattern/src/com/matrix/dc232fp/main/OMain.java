package com.matrix.dc232fp.main;

import com.matrix.dc232fp.car.Bus;
import com.matrix.dc232fp.car.Car;
import com.matrix.dc232fp.car.CarFactory;
import com.matrix.dc232fp.car.Taxi;

// 변수 왜 만드나? -> 데이터 임시 저장하려고 / 영구저장은 파일에
// 객체 왜 만드나? -> 데이터 임시 저장하려고(근데 좀 실생활스럽게)

// 객체를 만들어야 하나?
//		No: [멤버변수 없다면?] -> 객체를 만들 필요가 없다. static메소드 기반
//		Yes : [멤버변수 있다면?] -> 그 객체가 여러개 필요한가? (상황의 판단)
//			No: singleton 패턴
//			Yes: 
//				대량으로 필요? : 데이터 자동관리가 됐으면. 지금의 차대번호처럼
//					Yes : factory패턴
//					No : 수작업?

public class OMain {
	public static void main(String[] args) {
		// 자동차를 대량으로 찍어내는 입장에서는 상당히 편리함
		CarFactory cf = new CarFactory();
		
		Car c1 = cf.make();
		c1.print();
		System.out.println("-------------------");
		
		Car c2 = cf.make();
		c2.print();
		System.out.println("-------------------");
		
		
	}
}
