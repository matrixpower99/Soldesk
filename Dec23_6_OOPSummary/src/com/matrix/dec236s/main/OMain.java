package com.matrix.dec236s.main;

import com.matrix.dec236s.avengers.Ironman;
import com.matrix.dec236s.human.Human;
import com.matrix.dec236s.planet.Planet;

public class OMain {
	public static void main(String[] args) {
		// �̸��� ������ �༺
		// ����� 500
		// �� �༺�� ���� -> ������ ������ �Ⱥ����� (����, �ݼ�)
		Planet p = new Planet("����");
		
		// �̸��� ȫ�浿�� ���
		Human h = new Human("ȫ�浿");
		
		// ȫ�浿�� ������, ��浿�� ������ �쵵��
		p.add(h);
		
		Planet p2 = new Planet("����");
		Human h2= new Human("��浿");
		p2.add(h2);
		
		// ��������� ������ �����ϱ� ����� �ʿ� -> Avengers�������̽�
		Ironman i = new Ironman();
		h.pick(i);
		
		// �� ����� ������
		h.helpMe();
		
		// �� �༺����� 500
		p.setSize(500);
		// �� �༺�� ����
		p.setVisible(true);
		
		
		
		
	}
}
