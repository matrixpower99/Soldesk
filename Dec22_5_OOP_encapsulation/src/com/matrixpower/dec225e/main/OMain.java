package com.matrixpower.dec225e.main;

import java.util.Scanner;

import javax.swing.JFrame;

import com.matrixpower.dec225e.computer.Computer;
import com.matrixpower.dec225e.human.Human;
import com.matrixpower.dec225e.tv.Tv;

// ������Ʈ �� �� �� ����� ��Ű�� �ϳ��� �þƼ� �Ѵ�

public class OMain {

	public static void main(String[] args) {
		// win�������α׷� -> webbase�� �Ѿ�� �߼�
		// win�������α׷� -> java - x -> windows API�� ��� 
		
		// �ڹٿ� �̹� Ŭ������ ����Ǿ� ������ -> Ŭ���� ������ ���ð� -> �׳�
		// Ÿ��Ʋ�� �������� JFrame
		// �� jframe ������ 500, 300���� �ٲٱ�
		// �� jframe visible�� true�� �ٲٱ�
		// ���⿡ ������ �ʿ� ����
		JFrame jf = new JFrame("��������");
		jf.setSize(500, 300);
		jf.setVisible(true);
		System.out.println("-----------------");
		
		Tv t = new Tv("LG123x", 50); // �̸��� LG123x, ����� 50�� TV
		t.setName("�Ｚ456z"); // �� tv �̸��� �Ｚ456z�� �ٲ�
		System.out.println(t.getSize());
		t.print();
		System.out.println("-----------------");
		
		Computer c = new Computer("i7-4790", 16, 500);
		c.setRam(32);
		System.out.println(c.getRam());
		c.print();
		System.out.println("-----------------");
		
		// ȫ�浿, 20�� ���
		Human h = new Human("ȫ�浿", 20);
		h.print();
		System.out.println("-----------------");

		Scanner k = new Scanner(System.in);
		System.out.print("������ �̸�: ");
		String n = k.next();
		System.out.print("������ ����: ");
		int a = k.nextInt();
		
		h.setName(n);
		h.setAge(a);
		System.out.println(h.getAge());
		h.print();
		
		
	}
}
