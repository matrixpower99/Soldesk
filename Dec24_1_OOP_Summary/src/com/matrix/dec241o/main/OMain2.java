package com.matrix.dec241o.main;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.matrix.dec241o.doctor.Doctor;

// ������ ���α׷� ��������� �߼�
// ������ ���α׷��� �� ���� Java��?

// �ȵ���̵� �� ���߰� ������ �Ȱ��Ƽ� �� �о߷� ���θ� ���ϸ� ������ ��.

public class OMain2 {
	public static void main(String[] args) {
		// JFrame�� ��� ���۳�Ʈ�� ��ġ���� �������� ������ �Ѱ��� �ö󰣴�.
		// Layout ���� �ʿ�
		JFrame f = new JFrame("BMI �˻�");

		GridLayout gl = new GridLayout(4, 2);
		f.setLayout(gl);
		
		// �ؽ�Ʈ�� �̸��� JLabel
		JLabel nameLB = new JLabel("�̸�: ");
		f.add(nameLB);
		JTextField nameTF = new JTextField();
		f.add(nameTF);
		
		JLabel heightLB = new JLabel("Ű: ");
		f.add(heightLB);
		JTextField heightTF = new JTextField();
		f.add(heightTF);
		
		JLabel weightLB = new JLabel("������: ");
		f.add(weightLB);
		JTextField weightTF = new JTextField();
		f.add(weightTF);
		
		JLabel resultLB = new JLabel("���: ");
		f.add(resultLB);
		JButton resulBtn = new JButton("Ȯ��");
		f.add(resulBtn);
		
		// ��ư ������ ��� -> ActionListener�� Doctor
		// resultBtn�� AL�� ����
		Doctor d = new Doctor(nameTF, heightTF, weightTF, resultLB);
		resulBtn.addActionListener(d);
		
		// ��ư ������ �ֿܼ� ������ ��µǰ�
		
		
		
		f.setSize(500, 300);
		f.setVisible(true);
		
		JTextField t = new JTextField();
		
		
	}
}
