package com.matrixpower.dec222pl.main;

import org.jsoup.Jsoup;

// java -> db -> java+db(jdbc.jar) -> 웹기초 -> JSP(자바로 웹서버프로그래밍 jsp.jar)
// -> 유지보수하기 좋게(spring.jar)
import com.matrixpower.dec222pl.animal.Cat;

// .java를 작업
// .java를 공유 -> 받은 사람이 소스를 봄 x
// .jar를 공유
//		jar Archive 파일 : .java -> 기계어로 번역(compile) -> .class(기계어)를 압축
// https://mvnrepository.com/
public class OMain {
	public static void main(String[] args) {
		// 고양이 : 나비, 2살, 정보출력
		Cat c = new Cat("나비", 2);
		c.print();
				
		// soldesk.com에서 web crawling -> java에 없음 -> 처음부터 다 만들어야
		// 다른 누군가가 해놨음
		
		Jsoup j;
		
		
		
		
	}
}
