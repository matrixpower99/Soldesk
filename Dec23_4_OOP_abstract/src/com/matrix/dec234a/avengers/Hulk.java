package com.matrix.dec234a.avengers;

public class Hulk extends Avengers {
	private int size;
	
	public Hulk() {
		// TODO Auto-generated constructor stub
	}
	
	public Hulk(String name, int age, int size) {
		super(name, age);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(size);
	}
	
	@Override
	public void attack() {
		System.out.println("¡÷∏‘¡˙");
	}

	@Override
	public void smoke() {
		// TODO Auto-generated method stub
		
	}
}
