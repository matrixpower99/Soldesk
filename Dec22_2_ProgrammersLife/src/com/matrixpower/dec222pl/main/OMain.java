package com.matrixpower.dec222pl.main;

import org.jsoup.Jsoup;

// java -> db -> java+db(jdbc.jar) -> ������ -> JSP(�ڹٷ� ���������α׷��� jsp.jar)
// -> ���������ϱ� ����(spring.jar)
import com.matrixpower.dec222pl.animal.Cat;

// .java�� �۾�
// .java�� ���� -> ���� ����� �ҽ��� �� x
// .jar�� ����
//		jar Archive ���� : .java -> ����� ����(compile) -> .class(����)�� ����
// https://mvnrepository.com/
public class OMain {
	public static void main(String[] args) {
		// ����� : ����, 2��, �������
		Cat c = new Cat("����", 2);
		c.print();
				
		// soldesk.com���� web crawling -> java�� ���� -> ó������ �� ������
		// �ٸ� �������� �س���
		
		Jsoup j;
		
		
		
		
	}
}
