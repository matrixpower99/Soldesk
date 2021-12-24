package com.matrix.dec242upg.main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class OMain1 {
	public static void main(String[] args) {
		JFrame f = new JFrame("UpDown ����");
		GridLayout gl = new GridLayout(2, 2);
		f.setLayout(gl);
		
		JLabel userLB = new JLabel("��: ");
		f.add(userLB);
		JTextField userTF = new JTextField();
		f.add(userTF);
		JLabel resultLB = new JLabel("���: ");
		f.add(resultLB);
		JButton resultBtn = new JButton("Ȯ��");
		f.add(resultBtn);
		
		f.setSize(500, 300);
		f.setVisible(true);
		
		resultBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int gameAns = new Random().nextInt(1000) + 1;
				int userAns = 0;
				for (int turn = 0; true; turn++) {
					userAns = say();
					if (!judge(gameAns, userAns, turn)) {
						turn = 0;
						resultLB.setText("������ �ٽ� �����մϴ�.");
					}
				}
				
				public int say() {
					int userAns = Integer.parseInt(userTF.getText());
					return (userAns >= 0 && userAns <= 1000) ? userAns : say();
				}
				
				public boolean judge(int ga, int ua, int t) {
					if (ga < ua) { 
						resultLB.setText("Down"); 
					} else if (ga > ua) {
						resultLB.setText("Up");
					} else {
						String result2 = String.format("%d�ϸ��� ����", t);
						resultLB.setText(result2);
						return false;
					}
					return true;
				}
			}
			
		});
		
	}
	

}