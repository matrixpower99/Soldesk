package com.matrix.dc232fp.main;

import com.matrix.dc232fp.monster.Boss;
import com.matrix.dc232fp.monster.Monster;

// 자바수업
// 프로그래밍 그 자체 수업
// 	
// 3진도
// 5를 넘어서는
// 2잡담
// -------------------
// 내년도 제안서
//		jsp하는데 필요한 기본 자바를 한다
//		심사 받을 때 기본 자바가 어느 정도냐?
// 선생마다 다 다르지
// 조건문, 반복문, 배열로 기본적인 프로그램을 만드는 절차지형 프로그래밍과
// 유지보수에 용이한 형태로 프로그램을 만드는 객체지향 프로그래밍과
// 라이브러리 활용이다 - 권기웅 감사님 커리쿨럼
//		-> 네트워크 프로그래밍 : 채팅, 날씨, 미세먼지, 대중교통(버스, 지하철)
//		
// 저 질문에 저도 저렇게 대답하면 되나요?
//
public class OMain3 {
	public static void main(String[] args) {
		// 몬스터 만들기 ->
		// 		이름이 좀비, 오크, 귀신 셋중에 하나 랜덤을 정해지게
		//		레벨이 1 ~ 50사이 랜덤으로 정해지게
		
		Boss b = Boss.getBoss();
		Monster m1 = b.summon();
		m1.print();
		
		Monster m2 = b.summon();
		m2.print();
		
	}
}
