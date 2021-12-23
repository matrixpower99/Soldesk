package com.matrix.dec234a.main;

import com.matrix.dec234a.avengers.Avengers;
import com.matrix.dec234a.avengers.Hulk;
import com.matrix.dec234a.avengers.Ironman;
import com.matrix.dec234a.human.Human;

public class OMain {
	public static void main(String[] args) {
		// 어벤져스
		
		// 아이언맨
		Ironman i = new Ironman("토니", 40, "자비스");
		i.print();
		i.attack();
		i.smoke();
		i.fly();
		System.out.println("---------------");

		// 헐크
		Hulk h = new Hulk("배너", 35, 40);
		h.print();
		h.attack();
		System.out.println("---------------");
		
		// 객체를 만들면서 1회용 클래스를 만들수가 있음
		// anonymous inner class : 자바에만 있는 테크닉
		// Avengers의 하위 클래스
		Avengers a = new Avengers() {
			
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("방패던지기");
			}

			@Override
			public void smoke() {
				// TODO Auto-generated method stub
				
			}
		};
		
		a.print();
		a.attack();
		
		// 홍길동, 20살인 사람
		Human h1 = new Human("홍길동", 20);
		h1.print();
		
	}
	
}
