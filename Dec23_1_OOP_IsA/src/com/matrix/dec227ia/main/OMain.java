package com.matrix.dec227ia.main;

import com.matrix.dec227ia.human.Soldier;
import com.matrix.dec227ia.human.Student;

public class OMain {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 20, "강남대");
		s.showInfo();
		System.out.println("-------------------");
		
		Soldier sd = new Soldier("김길동", 30, "일병");
		sd.showInfo();
				
		System.out.println("-------------------");
		sd.showName();
	}
}
