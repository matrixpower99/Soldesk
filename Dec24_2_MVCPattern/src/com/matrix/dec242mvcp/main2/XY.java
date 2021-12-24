package com.matrix.dec242mvcp.main2;

// M
// Javabean
// DTO(Data Temp/Transfer Object)
public class XY {
	private int x;
	private int y;
	
	private int plus;
	private int minus;
	private int mul;
	private int div;
	
	public XY() {
		// TODO Auto-generated constructor stub
	}

	public XY(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getPlus() {
		return plus;
	}

	public void setPlus(int plus) {
		this.plus = plus;
	}

	public int getMinus() {
		return minus;
	}

	public void setMinus(int minus) {
		this.minus = minus;
	}

	public int getMul() {
		return mul;
	}

	public void setMul(int mul) {
		this.mul = mul;
	}

	public int getDiv() {
		return div;
	}

	public void setDiv(int div) {
		this.div = div;
	}

}
