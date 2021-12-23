package com.matrixpower.dec224m.main;

import com.kwon.pl.product.Pen;
import com.matrixpower.dec224am.coffee.Coffee;

// import한 jar 파일은 실행파일 만들기전까지는 import한 폴더를 이동하면 안된다.

// 실행파일 -> 당연
// .jar -> 당연

// 강사 -> 강사 / 학생 -> 강사
// Java -> DB -> Java+DB-> HTML+CSS -> JSP
// Spring -> 웹개발
public class OMain {
	public static void main(String[] args) {
		Pen p = new Pen("모나미153", 500);
		
		// 가격을 1000원으로
		// not visible 해결 방법은 오후에
//		p.price = 1000;
		
		p.print();
//		System.out.println(p.name);
		
		// 아메리카노, 2000 커피
		Coffee c = new Coffee("아메리카노", 2000);
		c.name = "헤이즐넛";
		
		
	}
}
