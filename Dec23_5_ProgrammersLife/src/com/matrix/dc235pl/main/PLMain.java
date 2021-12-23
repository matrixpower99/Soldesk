package com.matrix.dc235pl.main;

import com.matrix.dc235pl.avengers.Spiderman;

// 게임회사 -> 어벤져스 게임
// 추상메소드의 위력 -> 하위 클래스에서 반드시 구현을 해야 하는
public class PLMain {
	public static void main(String[] args) {
		// 토르 -> 튜토리얼에 토르가 나와서 
		// 공격하기 기능 : 망치질 출력 
		// 저 공격하기 기능 : attack이라는 이름으로 하게, 까먹지도 못하게 
		// 강제성 -> 추상메소드 -> 추상클래스 -> 상속라인을 막아버림
//					      -> 인터페이스 -> 상속라인 막지 않음 -> 상사가 이걸로 작업지시 해야 맞음

		// Avengers 인터페이스를 활용해서
		// 스파이더맨
		// 공격하기 기능 : 거미줄 발사
		Spiderman sm = new Spiderman();
		sm.attack();
		
		// 인터페이스는 자바개발자들 사이에 많이 쓰인다. 특히 Spring
	}
}
