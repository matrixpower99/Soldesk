package com.matrix.dec233p.main;

import com.matrix.dec233p.product.Monitor;
import com.matrix.dec233p.product.Mouse;
import com.matrix.dec233p.product.Product;

// 변수 : 데이터 담는 그릇
// 다른 데이터 못 담는다
// 다형성(polymorphism)
//		변수를 만들때는 상위타입(Product)
//		그 변수에 실제 객체 만들어 넣을때는 하위타입(Monitor, Mouse, ..., etc)
//		-> 상위타입 변수에 하위타입 객체 넣기 가능 -> 최종적으로는 하위 타입

public class Main {
	public static void main(String[] args) {
		// 쇼핑몰의 판매 상품들

		Product p = new Product(); // 상품을 담을 수 있는 그릇 p에 상품을 만들어 넣음
		Product p2 = new Monitor(); // 상품만 담을 수 있는그릇 p2에 모니터를 만들어 넣음? 논리적으로 가능.
		Product p3;
		p3 = new Monitor();

		boolean b = p2 instanceof Product; // p2가 Product인가?
		System.out.println(b);

		boolean b2 = p3 instanceof Monitor; //
		System.out.println(b2);

		boolean b3 = p instanceof Mouse;
		System.out.println(b3);

		Mouse mou = new Mouse();// 마우스만 담을 수 있는 m에 상품을 만들어 넣음? 논리적으로 맞는가?
		Monitor mon = new Monitor(); // 모니터만 담을 수 있는 그릇 m에 마우스를 만들어 넣음? 논리적으로 성립 불가능.
		Product[] ar = { mon, mou };
		
		// 상품만들기
	}
	buy(mou);
	
	public static void buy(Product m) {
		
	}
	
	public Product make() {
		if (condition) {
			return new Monitor();
		} else {
			return new Mouse();
		}
			
	}
	
	

}
