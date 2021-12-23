package com.matrix.dec234a.avengers;

import com.matrix.dec234a.human.Smoker;

// ������
// ����/��Ʈ��ũ -> ���߿� ������� ����

// abstract Ŭ���� : ��ü�� ���� �� ����.
// abstract �޼ҵ� : �̿ϼ� �޼ҵ�(����κ��� ����)
//		����Ŭ�������� �ϼ��� ��������� -> overriding�ؾ� ��.
// 		abstract �޼ҵ尡 �ϳ��� �ִٸ� -> �� Ŭ������ abstract Ŭ��������
// � Ŭ������ �߻� class�� �� ����
// ���̾��,��ũ ���� �ֵ��� ���� ���� -> �߻����� ���� -> �������� ������ ���°� ����

// �������̽��� ��ӹ��� ���� implements ���
public abstract class Avengers implements Smoker {
	private String name;
	private int age;
	
	public Avengers() {
		// TODO Auto-generated constructor stub
	}

	public Avengers(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(age);
	}
	
	// ��������� �������� ����̴� ����� ����� �ߴµ� -> ���������� ���
	// �������°� ���� �߻����� ������ ���̴�
	public abstract void attack(); // �߻�޼ҵ�
	public abstract void smoke(); 
}
