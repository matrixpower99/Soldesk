package com.matrix.dec241o.main;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.matrix.dec241o.avengers.Ironman;

public class OMain {
	public static void main(String[] args) {
		// 제목이 지구인 JFrame
		JFrame p = new JFrame("Earth");
		
		// 이름이 홍길동인 JButton
		JButton h = new JButton("홍길동"); 
		
		// 텍스트가 홍길동인 JTextField 만들어서 
		// JTextField h = new JTextField("홍길동");
		
		// JFileChooser
		// JFileChooser h = new JFileChooser();
		
		// 저 JFrame에 저 JButton을 입주
		p.add(h);
		
		// 어벤져스들은 무조건 공격하기 기능이 필요 -> Avengers인터페이스
		// ActionListener들은 무조건 ???기능이 필요 -> ActionListener 인터페이스 사용
		// 어벤져스인 아이언맨
		// ActionListener인 아이언맨
		Ironman i = new Ironman(); 		
		
		// 저 JButton이 담당AL로 아이언맨 찜
		h.addActionListener(i);
		
		// 저 JButton이 위험함 -> 클릭하기
		
		// 그 Jframe 사이즈를 500, 300
		p.setSize(500, 300);
		
		// 그 Jframe 보이게
		p.setVisible(true);
		
	}
}
