package com.matrix.dec226sp.myself;

// static�������
//		�� ��ü���� ����Ӽ�

// singleton pattern : ���� �ϳ����� ��ü�� ���鶧(only one)

public class Myself {
	private String name;
	private int age;
	private String adrs;
	// 2. ��ü�� ���ο��� �����, �����Ұ����ϰ�
	private static final Myself MY = new Myself("������", 51, "������");
	
	// 1. ��ü�� �ܺο��� ������ ���ϰ�(�����ڵ��� private��)
	private Myself() {
		// TODO Auto-generated constructor stub
	}

	private Myself(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.adrs = address;
	}
	
	// 3. 2���� �� ��ü�� �ܺο��� �ҷ��� ����� �� �ְ�
	public static Myself getMy() {
		return MY;
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

	public String getAdrs() {
		return adrs;
	}

	public void setAdrs(String adrs) {
		this.adrs = adrs;
	}

	public void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(adrs);
		
	}
}
