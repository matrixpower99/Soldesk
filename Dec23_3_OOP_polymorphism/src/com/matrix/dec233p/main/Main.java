package com.matrix.dec233p.main;

import com.matrix.dec233p.product.Monitor;
import com.matrix.dec233p.product.Mouse;
import com.matrix.dec233p.product.Product;

// ���� : ������ ��� �׸�
// �ٸ� ������ �� ��´�
// ������(polymorphism)
//		������ ���鶧�� ����Ÿ��(Product)
//		�� ������ ���� ��ü ����� �������� ����Ÿ��(Monitor, Mouse, ..., etc)
//		-> ����Ÿ�� ������ ����Ÿ�� ��ü �ֱ� ���� -> ���������δ� ���� Ÿ��

public class Main {
	public static void main(String[] args) {
		// ���θ��� �Ǹ� ��ǰ��

		Product p = new Product(); // ��ǰ�� ���� �� �ִ� �׸� p�� ��ǰ�� ����� ����
		Product p2 = new Monitor(); // ��ǰ�� ���� �� �ִ±׸� p2�� ����͸� ����� ����? �������� ����.
		Product p3;
		p3 = new Monitor();

		boolean b = p2 instanceof Product; // p2�� Product�ΰ�?
		System.out.println(b);

		boolean b2 = p3 instanceof Monitor; //
		System.out.println(b2);

		boolean b3 = p instanceof Mouse;
		System.out.println(b3);

		Mouse mou = new Mouse();// ���콺�� ���� �� �ִ� m�� ��ǰ�� ����� ����? �������� �´°�?
		Monitor mon = new Monitor(); // ����͸� ���� �� �ִ� �׸� m�� ���콺�� ����� ����? �������� ���� �Ұ���.
		Product[] ar = { mon, mou };
		
		// ��ǰ�����
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
