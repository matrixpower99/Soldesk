package com.matrix.dec243eh.main;

import java.util.Calendar;
import java.util.Scanner;

import com.matrix.dec243eh.calculator.Calculator;

public class EHMain2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("x: ");
		int x = k.nextInt();
		System.out.print("y: ");
		int y = k.nextInt();
		
		int z = Calculator.divide(x,y);
		System.out.println(z);
		
	}
}	
