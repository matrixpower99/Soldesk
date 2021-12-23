package com.matrix.dec234a.avengers;

import com.matrix.dec234a.flyer.Flyer;
import com.matrix.dec234a.human.Smoker;

// Ironman is a Avengers
// Ironman is a Human
// Ironnan is a Smoker
// Ironman is a Flyer

// ���߻�� ���� - x(��κ��� ������ �������� ����)
// java : ��Ģ�� ��� -> ������ ���
// python : ��Ģ�� ����, ������ ��� -> ȥ���� ��� -> �ߺ��� �ټ� �߻� -> �����ڰ� �� ��Ʈ���ؾ�

// java�� ���߻�� ������ -> ������ ��� 
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
		System.out.println("�� �߻�");
	}
	
	@Override
	public void smoke() {
		// TODO Auto-generated method stub
		System.out.println("����Ǳ�");
	}


	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}
}
