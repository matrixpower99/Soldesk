package com.matrixpower.dec222pl.animal;

// �������� -> .java �Ѱ��ִ� �� �ƴ�
// �ҽ��� �ִ°� �ƴ϶� jar������ �ѱ�� �����Ѵ�

/**
 * ������������
 * @author matrixpower
 *
 */
public class Cat {
	String name;
	int age;

	
	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	/**
	 * �̸��� ���� ���
	 */
	public void print() {
		System.out.println(name);
		System.out.println(age);
	}
	/**
	 * ���� 2���� ������ ���� ��ȯ�ϴ� �޼ҵ�
	 * @param a - Ű
	 * @param b - ������
	 * @return - ��հ�
	 */
	public int add(int a, int b) {
		return a + b;
		
	}
}
