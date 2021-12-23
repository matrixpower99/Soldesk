package com.matrixpower.dec225e.computer;

// ������幦�� 			- �ҽ� ���ذ� ������
// 1 class=1 file 	-> �ҽ� ������ ����
// ĸ��ȭ 				- �����͸� �����ϰ� ���� �� ����

public class Computer {
	// ��������� ����θ� �����ϹǷ� ��ŵд�. �� �ٴ��� ����̱⵵ ��
	// 1.�������
	private String cpu;
	private int ram;
	private int hdd;
	
	// 2. ������ �ø���
	// 2-1. �⺻������
	public Computer() {
		// TODO Auto-generated constructor stub
	}

	// 2-2. �����ε��� ������
	public Computer(String cpu, int ram, int hdd) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}

	// 3. ĸ��ȭ ���(setter, getter �� �ٴ��� ���)
	// Generate Getters and Setters -> ctrl + shift + c
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	// 4. �Ϲ� �޼ҵ�
	public void print() {
		System.out.println(cpu);
		System.out.println(ram);
		System.out.println(hdd);
	}
	
}
