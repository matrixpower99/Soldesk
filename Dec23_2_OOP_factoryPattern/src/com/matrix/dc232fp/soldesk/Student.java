package com.matrix.dc232fp.soldesk;

// .jar -> 최종적으로 넘겨줄 파일
public class Student {
	private String name;
	private int no;
	
	// 1. 다른 팩키지에서 객체 생성 못하게(protected/default)
	// 		다른 프로그램에서도 객체 생성 못하게 됨
	//		내가 작업중인 이 프로그램 이 패키지에서만 생성가능하게 됨
	
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
