package com.matrix.dec241o.main;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.matrix.dec241o.avengers.Ironman;

public class OMain {
	public static void main(String[] args) {
		// ������ ������ JFrame
		JFrame p = new JFrame("Earth");
		
		// �̸��� ȫ�浿�� JButton
		JButton h = new JButton("ȫ�浿"); 
		
		// �ؽ�Ʈ�� ȫ�浿�� JTextField ���� 
		// JTextField h = new JTextField("ȫ�浿");
		
		// JFileChooser
		// JFileChooser h = new JFileChooser();
		
		// �� JFrame�� �� JButton�� ����
		p.add(h);
		
		// ��������� ������ �����ϱ� ����� �ʿ� -> Avengers�������̽�
		// ActionListener���� ������ ???����� �ʿ� -> ActionListener �������̽� ���
		// ������� ���̾��
		// ActionListener�� ���̾��
		Ironman i = new Ironman(); 		
		
		// �� JButton�� ���AL�� ���̾�� ��
		h.addActionListener(i);
		
		// �� JButton�� ������ -> Ŭ���ϱ�
		
		// �� Jframe ����� 500, 300
		p.setSize(500, 300);
		
		// �� Jframe ���̰�
		p.setVisible(true);
		
	}
}
