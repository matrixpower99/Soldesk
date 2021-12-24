package com.matrix.dec241o.main;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.matrix.dec241o.doctor.Doctor;

// 윈도우 프로그램 사라져가는 추세
// 윈도우 프로그램을 왜 굳이 Java로?

// 안드로이드 앱 개발과 구조가 똑같아서 이 분야로 진로를 정하면 도움이 됨.

public class OMain2 {
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
		
		// 버튼 누르면 계산 -> ActionListener인 Doctor
		// resultBtn의 AL로 지정
		Doctor d = new Doctor(nameTF, heightTF, weightTF, resultLB);
		resulBtn.addActionListener(d);
		
		// 버튼 누르면 콘솔에 ㅋㅋㅋ 출력되게
		
		
		
		f.setSize(500, 300);
		f.setVisible(true);
		
		JTextField t = new JTextField();
		
		
	}
}
