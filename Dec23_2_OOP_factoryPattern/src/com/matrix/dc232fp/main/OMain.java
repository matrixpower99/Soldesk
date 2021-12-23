package com.matrix.dc232fp.main;

import com.matrix.dc232fp.car.Bus;
import com.matrix.dc232fp.car.Car;
import com.matrix.dc232fp.car.CarFactory;
import com.matrix.dc232fp.car.Taxi;

// ���� �� ���峪? -> ������ �ӽ� �����Ϸ��� / ���������� ���Ͽ�
// ��ü �� ���峪? -> ������ �ӽ� �����Ϸ���(�ٵ� �� �ǻ�Ȱ������)

// ��ü�� ������ �ϳ�?
//		No: [������� ���ٸ�?] -> ��ü�� ���� �ʿ䰡 ����. static�޼ҵ� ���
//		Yes : [������� �ִٸ�?] -> �� ��ü�� ������ �ʿ��Ѱ�? (��Ȳ�� �Ǵ�)
//			No: singleton ����
//			Yes: 
//				�뷮���� �ʿ�? : ������ �ڵ������� ������. ������ �����ȣó��
//					Yes : factory����
//					No : ���۾�?

public class OMain {
	public static void main(String[] args) {
		// �ڵ����� �뷮���� ���� ���忡���� ����� ����
		CarFactory cf = new CarFactory();
		
		Car c1 = cf.make();
		c1.print();
		System.out.println("-------------------");
		
		Car c2 = cf.make();
		c2.print();
		System.out.println("-------------------");
		
		
	}
}
