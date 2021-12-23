package com.matrix.dc232fp.car;

public class Taxi extends Car {
	private String taxiType;
	
	protected Taxi() {
		// TODO Auto-generated constructor stub
	}

	public Taxi(String model, String carNum, int id, String taxiType) {
		super(model, carNum, id);
		this.taxiType = taxiType;
	}

	public String getTaxiType() {
		return taxiType;
	}

	public void setTaxiType(String taxiType) {
		this.taxiType = taxiType;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println(taxiType);
	}
}
