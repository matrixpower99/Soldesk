package com.matrix.dc232fp.main;

import com.matrix.dc232fp.soldesk.Manager;
import com.matrix.dc232fp.soldesk.Student;

public class OMain2 {
	public static void main(String[] args) {
		Manager m = new Manager();
		Student s1 = m.talk("ȫ�浿");
		s1.print();
		
		Student s2 = m.talk("��浿");
		s2.print();
	}
}
