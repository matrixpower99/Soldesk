package com.matrixpower.dec225e.tv;

public class Tv {
	private String name;
	private int size;
	
	public Tv() {
		// TODO Auto-generated constructor stub
	}
	
	public Tv(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public void print() {
		System.out.println(name);
		System.out.println(size);
	}
}
