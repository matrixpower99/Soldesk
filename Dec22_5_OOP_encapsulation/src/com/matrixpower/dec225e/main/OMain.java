package com.matrixpower.dec225e.main;

import java.util.Scanner;

import javax.swing.JFrame;

import com.matrixpower.dec225e.computer.Computer;
import com.matrixpower.dec225e.human.Human;
import com.matrixpower.dec225e.tv.Tv;

// 프로젝트 할 때 한 사람이 팩키지 하나씩 맡아서 한다

public class OMain {

	public static void main(String[] args) {
		// win응용프로그램 -> webbase로 넘어가는 추세
		// win응용프로그램 -> java - x -> windows API를 사용 
		
		// 자바에 이미 클래스가 내장되어 있으니 -> 클래스 만들지 마시고 -> 그냥
		// 타이틀이 ㅋㅋㅋ인 JFrame
		// 그 jframe 사이즈 500, 300으로 바꾸기
		// 그 jframe visible을 true로 바꾸기
		// 여기에 집중할 필요 없음
		JFrame jf = new JFrame("ㅋㅋㅋㅋ");
		jf.setSize(500, 300);
		jf.setVisible(true);
		System.out.println("-----------------");
		
		Tv t = new Tv("LG123x", 50); // 이름이 LG123x, 사이즈가 50인 TV
		t.setName("삼성456z"); // 그 tv 이름을 삼성456z로 바꿈
		System.out.println(t.getSize());
		t.print();
		System.out.println("-----------------");
		
		Computer c = new Computer("i7-4790", 16, 500);
		c.setRam(32);
		System.out.println(c.getRam());
		c.print();
		System.out.println("-----------------");
		
		// 홍길동, 20살 사람
		Human h = new Human("홍길동", 20);
		h.print();
		System.out.println("-----------------");

		Scanner k = new Scanner(System.in);
		System.out.print("수정할 이름: ");
		String n = k.next();
		System.out.print("수정할 나이: ");
		int a = k.nextInt();
		
		h.setName(n);
		h.setAge(a);
		System.out.println(h.getAge());
		h.print();
		
		
	}
}
