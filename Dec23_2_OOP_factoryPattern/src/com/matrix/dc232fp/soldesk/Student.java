package com.matrix.dc232fp.soldesk;

// .jar -> ���������� �Ѱ��� ����
public class Student {
	private String name;
	private int no;
	
	// 1. �ٸ� ��Ű������ ��ü ���� ���ϰ�(protected/default)
	// 		�ٸ� ���α׷������� ��ü ���� ���ϰ� ��
	//		���� �۾����� �� ���α׷� �� ��Ű�������� ���������ϰ� ��
	
	protected Student() {
		// TODO Auto-generated constructor stub
	}

	protected Student(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(no);
	}
	
	
}
