package com.matrix.dc232fp.car;

public class Bus extends Car {
	private String busType;
	private int nop;
	
	protected Bus() {
		// TODO Auto-generated constructor stub
	}

	public Bus(String model, String carNum, int id, String busType, int nop) {
		super(model, carNum, id);
		this.busType = busType;
		this.nop = nop;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public int getNop() {
		return nop;
	}

	public void setNop(int nop) {
		this.nop = nop;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(busType);
		System.out.println(nop);
	}
}
