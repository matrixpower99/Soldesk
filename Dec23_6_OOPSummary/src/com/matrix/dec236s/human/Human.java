package com.matrix.dec236s.human;

import com.matrix.dec236s.avengers.Avengers;

public class Human {
	private String name;
	private Avengers hero; // ��翵��. ������ ��������� ���Ͽ�

	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void pick(Avengers a) {
		hero = a;
	}
	
	public void helpMe() {
		hero.attack();
	}
}
