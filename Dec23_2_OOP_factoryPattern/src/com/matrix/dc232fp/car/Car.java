package com.matrix.dc232fp.car;

public class Car {
	private String model; // �ڵ��� ��
	private String carNum; // ������Ϲ�ȣ
	private int id; // �����ȣ
	
	protected Car() {
		// TODO Auto-generated constructor stub
	}
	
	protected Car(String model, String carNum, int id) {
		super();
		this.model = model;
		this.carNum = carNum;
		this.id = id;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void print() {
		System.out.println(model);
		System.out.println(carNum);
		System.out.println(id);
	}
}
