package com.matrix.dec241o.doctor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream.GetField;

import javax.swing.JLabel;
import javax.swing.JTextField;

// Doctor is a 버튼이벤트 처리자
public class Doctor implements ActionListener {
	private JTextField nameTF;
	private JTextField heightTF;
	private JTextField weightTF;
	private JLabel resultLB;
	
	public Doctor() {
	}	

	public Doctor(JTextField nameTF, JTextField heightTF, JTextField weightTF, JLabel resultLB) {
	super();
	this.nameTF = nameTF;
	this.heightTF = heightTF;
	this.weightTF = weightTF;
	this.resultLB = resultLB;
	}
	
	
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
		
		System.out.println(name);
		System.out.println(bmi);
		System.out.println(result);
		System.out.println("-------------");
	}

}
