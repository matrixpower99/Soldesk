package com.matrix.dc232fp.monster;

public class Monster {
	private String name;
	private int level;
	
	protected Monster() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Monster(String name, int level) {
		super();
		this.name = name;
		this.level = level;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void print() {
		System.out.println(name);
		System.out.println(level);
	}
}
