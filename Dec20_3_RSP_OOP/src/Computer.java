import java.util.Random;

public class Computer {
	Random brain;
	
	public Computer() {
		brain = new Random();
	}
	
	public int fire() {
		return brain.nextInt(3) + 1;
	}
	
}
