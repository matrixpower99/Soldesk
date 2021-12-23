package com.matrix.dec226sp.myphone;

public class MyPhone {
	private String name;
	private String number;
	
	// ΩÃ±€≈Ê∆–≈œ
	private static final MyPhone MP = new MyPhone("∞∂∑∞Ω√52s", "010-2220-1970");
	
	public static MyPhone getMp() {
		return MP;
	}

	//	public static MyPhone getInstance() {
//		return MP;
//	}
	
	private MyPhone() {
		// TODO Auto-generated constructor stub
	}
	
	private MyPhone(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}


	public void print() {
		System.out.println(name);
		System.out.println(number);
	}

	public static MyPhone getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
