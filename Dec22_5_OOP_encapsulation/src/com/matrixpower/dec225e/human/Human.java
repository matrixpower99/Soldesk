package com.matrixpower.dec225e.human;

// name, age�� ������ ����� -> public���� ���°� �翬...

// ĸ��ȭ(encapsulation) : ������ �����ϰ� �ֱ� ����. ��ü������ �ϸ鼭 ���� �� �ִ� ���� �� �ϳ�
//		��� ������ public���� �ϸ� -> �ܺο��� ���� ���� ���� -> �߸��� �����Ͱ� �׳� ��
//		1. ��������� private�� -> �ܺ� ������ ���´�
//		2. ��������� ������ �� �ִ� ��θ� ����
//		3. �� ��ο� ������ġ

// 		����� ����, ���� -> �Ա� ���� -> ĸ���� �ָ� �Ա� ���ϴ�
//		����� �ָ� �ڰݾ��� ������� ������ ���� -> ĸ���� �ָ� -> �� �뷮 �״�� �԰� ��

public class Human {
	private String name; // �� �ٴ��� ���. ��� ������ ��װ� �����Ѵ�.
	private int age; // ������� ����Ʈ. ����� ������ �ø��� ����
	
	public void setAge(int a) {
		if (a < 0) {
			a *= -1;
		}
		age = a;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(age);
	}
}
