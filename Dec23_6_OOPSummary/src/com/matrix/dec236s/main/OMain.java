package com.matrix.dec236s.main;

import com.matrix.dec236s.avengers.Ironman;
import com.matrix.dec236s.human.Human;
import com.matrix.dec236s.planet.Planet;

public class OMain {
	public static void main(String[] args) {
		// 이름이 지구인 행성
		// 사이즈가 500
		// 그 행성은 보임 -> 별들이 보였다 안보였다 (수성, 금성)
		Planet p = new Planet("지구");
		
		// 이름이 홍길동인 사람
		Human h = new Human("홍길동");
		
		// 홍길동은 지구에, 길길동은 수성에 살도록
		p.add(h);
		
		Planet p2 = new Planet("수성");
		Human h2= new Human("김길동");
		p2.add(h2);
		
		// 어벤저스들은 무조건 공격하기 기능이 필요 -> Avengers인터페이스
		Ironman i = new Ironman();
		h.pick(i);
		
		// 저 사람이 위험함
		h.helpMe();
		
		// 그 행성사이즈가 500
		p.setSize(500);
		// 그 행성은 보임
		p.setVisible(true);
		
		
		
		
	}
}
