package com.matrix.dec241o.main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.matrix.dec241o.doctor.Doctor;

public class OMain3 {
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
		
		// OMain3.java
		// Doctor.java�� ������ �����̴� -> ���� �����̸� ���ϰڳ�
		resulBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nameTF.getText();
				String height = heightTF.getText();
				String weight = weightTF.getText();
				// String -> double
				double height2 = Double.parseDouble(height);
				// String -> int
				int weight2 = Integer.parseInt(weight);
				
				double hm = height2 / 100;
				double bmi = weight2 / (hm * hm);
				
				String result = "��ü��";
				if (bmi >= 35 ) {
					result = "�� ��";
				} else if (bmi >= 30) {
					result = "�ߵ�(2�ܰ�) ��";
				} else if (bmi >= 25) {
					result = "�浵(1�ܰ�) ��";
				} else if (bmi >= 23) {
					result = "��ü��";
				} else if (bmi >= 18.5) {
					result = "����";
				}				
				String result2 = String.format("BMI : %.1f - %s���� %s", bmi, name,result);
				resultLB.setText(result2);
			}
		});
		
//		ActionListener al = new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
		f.setSize(500, 300);
		f.setVisible(true);
		
		JTextField t = new JTextField();
		
		
	}
}
