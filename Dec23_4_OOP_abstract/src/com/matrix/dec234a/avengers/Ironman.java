package com.matrix.dec234a.avengers;

import com.matrix.dec234a.flyer.Flyer;
import com.matrix.dec234a.human.Smoker;

// Ironman is a Avengers
// Ironman is a Human
// Ironnan is a Smoker
// Ironman is a Flyer

// 다중상속 지원 - x(대부분의 언어들이 지원하지 않음)
// java : 규칙의 언어 -> 질서의 언어
// python : 규칙이 없음, 자유의 언어 -> 혼돈의 언어 -> 중복이 다수 발생 -> 개발자가 다 컨트롤해야

// java는 다중상속 미지원 -> 부족한 상속 
public class Ironman extends Avengers implements Smoker, Flyer {
	private String comName;
	
	public Ironman() {
		// TODO Auto-generated constructor stub
	}

	
	public Ironman(String name, int age, String comName) {
		super(name, age);
		this.comName = comName;
	}


	public String getComName() {
		return comName;
	}


	public void setComName(String comName) {
		this.comName = comName;
	}


	@Override
	public void print() {
		super.print();
		System.out.println(comName);
	}
	
	@Override
	public void attack() {
		System.out.println("빔 발사");
	}
	
	@Override
	public void smoke() {
		// TODO Auto-generated method stub
		System.out.println("담배피기");
	}


	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("날기");
	}
}
