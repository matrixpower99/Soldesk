package com.matrix.dec234a.main;

import com.matrix.dec234a.avengers.Avengers;
import com.matrix.dec234a.avengers.Hulk;
import com.matrix.dec234a.avengers.Ironman;
import com.matrix.dec234a.human.Human;

public class OMain {
	public static void main(String[] args) {
		// �����
		
		// ���̾��
		Ironman i = new Ironman("���", 40, "�ں�");
		i.print();
		i.attack();
		i.smoke();
		i.fly();
		System.out.println("---------------");

		// ��ũ
		Hulk h = new Hulk("���", 35, 40);
		h.print();
		h.attack();
		System.out.println("---------------");
		
		// ��ü�� ����鼭 1ȸ�� Ŭ������ ������� ����
		// anonymous inner class : �ڹٿ��� �ִ� ��ũ��
		// Avengers�� ���� Ŭ����
		Avengers a = new Avengers() {
			
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("���д�����");
			}

			@Override
			public void smoke() {
				// TODO Auto-generated method stub
				
			}
		};
		
		a.print();
		a.attack();
		
		// ȫ�浿, 20���� ���
		Human h1 = new Human("ȫ�浿", 20);
		h1.print();
		
	}
	
}
