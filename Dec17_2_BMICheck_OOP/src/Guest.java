import java.util.Scanner;

public class Guest {
	String name;
	double height;
	double weight;
	Scanner ans = new Scanner(System.in);
	double bmi;
	String health;
	
	public void tellName() {
		name = ans.next();
	}
	
	public void tellHeight() {
		height = ans.nextDouble();
	}
	
	public void tellWeight() {
		weight = ans.nextDouble();
	}
	
}
