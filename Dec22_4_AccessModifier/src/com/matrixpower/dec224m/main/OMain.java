package com.matrixpower.dec224m.main;

import com.kwon.pl.product.Pen;
import com.matrixpower.dec224am.coffee.Coffee;

// import�� jar ������ �������� ������������� import�� ������ �̵��ϸ� �ȵȴ�.

// �������� -> �翬
// .jar -> �翬

// ���� -> ���� / �л� -> ����
// Java -> DB -> Java+DB-> HTML+CSS -> JSP
// Spring -> ������
public class OMain {
	public static void main(String[] args) {
		Pen p = new Pen("�𳪹�153", 500);
		
		// ������ 1000������
		// not visible �ذ� ����� ���Ŀ�
//		p.price = 1000;
		
		p.print();
//		System.out.println(p.name);
		
		// �Ƹ޸�ī��, 2000 Ŀ��
		Coffee c = new Coffee("�Ƹ޸�ī��", 2000);
		c.name = "�������";
		
		
	}
}
