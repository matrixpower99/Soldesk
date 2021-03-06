package com.matrixpower.dec225e.main;

import java.util.Scanner;

import javax.swing.JFrame;

import com.matrixpower.dec225e.computer.Computer;
import com.matrixpower.dec225e.human.Human;
import com.matrixpower.dec225e.tv.Tv;

// 覗稽詮闘 拝 凶 廃 紫寓戚 苫徹走 馬蟹梢 乎焼辞 廃陥

public class OMain {

	public static void main(String[] args) {
		// win誓遂覗稽益轡 -> webbase稽 角嬢亜澗 蓄室
		// win誓遂覗稽益轡 -> java - x -> windows API研 紫遂 
		
		// 切郊拭 戚耕 適掘什亜 鎧舌鞠嬢 赤生艦 -> 適掘什 幻級走 原獣壱 -> 益撹
		// 展戚堂戚 せせせ昔 JFrame
		// 益 jframe 紫戚綜 500, 300生稽 郊荷奄
		// 益 jframe visible聖 true稽 郊荷奄
		// 食奄拭 増掻拝 琶推 蒸製
		JFrame jf = new JFrame("せせせせ");
		jf.setSize(500, 300);
		jf.setVisible(true);
		System.out.println("-----------------");
		
		Tv t = new Tv("LG123x", 50); // 戚硯戚 LG123x, 紫戚綜亜 50昔 TV
		t.setName("誌失456z"); // 益 tv 戚硯聖 誌失456z稽 郊嘩
		System.out.println(t.getSize());
		t.print();
		System.out.println("-----------------");
		
		Computer c = new Computer("i7-4790", 16, 500);
		c.setRam(32);
		System.out.println(c.getRam());
		c.print();
		System.out.println("-----------------");
		
		// 畠掩疑, 20詞 紫寓
		Human h = new Human("畠掩疑", 20);
		h.print();
		System.out.println("-----------------");

		Scanner k = new Scanner(System.in);
		System.out.print("呪舛拝 戚硯: ");
		String n = k.next();
		System.out.print("呪舛拝 蟹戚: ");
		int a = k.nextInt();
		
		h.setName(n);
		h.setAge(a);
		System.out.println(h.getAge());
		h.print();
		
		
	}
}
