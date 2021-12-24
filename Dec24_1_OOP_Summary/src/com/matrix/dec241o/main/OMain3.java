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
		// JFrame에 어떻게 컴퍼넌트를 배치할지 지정하지 않으면 한개만 올라간다.
		// Layout 지정 필요
		JFrame f = new JFrame("BMI 검사");

		GridLayout gl = new GridLayout(4, 2);
		f.setLayout(gl);
		
		// 텍스트가 이름인 JLabel
		JLabel nameLB = new JLabel("이름: ");
		f.add(nameLB);
		JTextField nameTF = new JTextField();
		f.add(nameTF);
		
		JLabel heightLB = new JLabel("키: ");
		f.add(heightLB);
		JTextField heightTF = new JTextField();
		f.add(heightTF);
		
		JLabel weightLB = new JLabel("몸무게: ");
		f.add(weightLB);
		JTextField weightTF = new JTextField();
		f.add(weightTF);
		
		JLabel resultLB = new JLabel("결과: ");
		f.add(resultLB);
		JButton resulBtn = new JButton("확인");
		f.add(resulBtn);
		
		// OMain3.java
		// Doctor.java가 별개의 파일이니 -> 같은 파일이면 편하겠네
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
				
				String result = "저체중";
				if (bmi >= 35 ) {
					result = "고도 비만";
				} else if (bmi >= 30) {
					result = "중도(2단계) 비만";
				} else if (bmi >= 25) {
					result = "경도(1단계) 비만";
				} else if (bmi >= 23) {
					result = "과체중";
				} else if (bmi >= 18.5) {
					result = "정상";
				}				
				String result2 = String.format("BMI : %.1f - %s씨는 %s", bmi, name,result);
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
