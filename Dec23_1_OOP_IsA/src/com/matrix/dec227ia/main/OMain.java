package com.matrix.dec227ia.main;

import com.matrix.dec227ia.human.Soldier;
import com.matrix.dec227ia.human.Student;

public class OMain {
	public static void main(String[] args) {
		Student s = new Student("ȫ�浿", 20, "������");
		s.showInfo();
		System.out.println("-------------------");
		
		Soldier sd = new Soldier("��浿", 30, "�Ϻ�");
		sd.showInfo();
				
		System.out.println("-------------------");
		sd.showName();
	}
}
