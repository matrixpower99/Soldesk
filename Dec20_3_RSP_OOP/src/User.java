import java.util.Scanner;

public class User {
	Scanner brain;
	int win;
//	public int win;
	
	public User() {
		brain = new Scanner(System.in);
	}
	
	public int fire() {
		return brain.nextInt();
	}
}
