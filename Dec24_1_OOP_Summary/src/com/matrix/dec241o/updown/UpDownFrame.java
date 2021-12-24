package com.matrix.dec241o.updown;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UpDownFrame extends JFrame {
	
	public UpDownFrame() {
		setTitle("UpDown����");

		GridLayout gl = new GridLayout(2, 2);
		setLayout(gl);

		JLabel noLB = new JLabel("��: ");
		add(noLB);
		JTextField noTF = new JTextField();
		add(noTF);
		JLabel resultLB = new JLabel("���");
		add(resultLB);
		JButton btn = new JButton("Ȯ��");
		add(btn);
		
		ActionListener al = new ActionListener() {
			private int gameAns;
			private int turn;
			private boolean played; 
			
			private void newGame() {
				int gameAns = new Random().nextInt(1000) + 1;
				turn = 0;
				System.out.println(gameAns);
			}
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!played) {
					newGame();
					played = true;
				}
				turn++;
				String userAns = noTF.getText();
				int userAns2 = Integer.parseInt(userAns);
//				noTF.setText("");
				if (userAns2 == gameAns) {
					String result2 = String.format("%d�ϸ��� ����", turn);
					resultLB.setText(result2);
					newGame();
				} else if (userAns2 > gameAns) {
					resultLB.setText("DOWN");
				} else {
					resultLB.setText("UP");
				}
			}
		};
		btn.addActionListener(al);

		setSize(400, 300);
		setVisible(true);

	}
}
