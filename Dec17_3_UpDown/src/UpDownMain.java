// OOD
public class UpDownMain {

	public static void main(String[] args) {
		// 친구가 학원에 앉아있다가, 게임이 하고 싶어져서, 나를 불러서 시작
//		Computer c = new Computer();
//		c.start();

		// 내가 학원에 앉아있다가, 게임이 하고 싶어져서, 친구를 불러서 시작
//		Computer c = new Computer();
//		c.start();

		// 친구/나 학원에 있다가, 친구가 하고 싶어져서, 나한테 말 걸어서 시작
		Computer c = new Computer();
		User u = new User();
		c.start(u);
		
		// 친구/나 학원에 있다가, 내가 하고 싶어져서, 친구한테 말 걸어서 시작
//		Computer c = new Computer();
//		User u = new User();
//		u.start(c);
		

	}

}
