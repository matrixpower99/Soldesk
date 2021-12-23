package com.matrixpower.dec225e.computer;

// 리얼월드묘사 			- 소스 이해가 쉬워짐
// 1 class=1 file 	-> 소스 재사용이 편리함
// 캡슐화 				- 데이터를 안전하게 넣을 수 있음

public class Computer {
	// 멤버변수는 열어두면 위험하므로 잠궈둔다. 이 바닥의 약속이기도 함
	// 1.멤버변수
	private String cpu;
	private int ram;
	private int hdd;
	
	// 2. 생성자 시리즈
	// 2-1. 기본생성자
	public Computer() {
		// TODO Auto-generated constructor stub
	}

	// 2-2. 오버로딩된 생성자
	public Computer(String cpu, int ram, int hdd) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}

	// 3. 캡슐화 통로(setter, getter 이 바닥의 약속)
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

	// 4. 일반 메소드
	public void print() {
		System.out.println(cpu);
		System.out.println(ram);
		System.out.println(hdd);
	}
	
}
