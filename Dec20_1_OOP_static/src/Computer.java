// static final ������� : ���ȭ(���� �Ұ����ϰ�)
// 		�츮 ���θ� ��ǻ�ʹ� �� �Ｚ, ������ ����

// static �޼ҵ�
//		�޸� ���� -> �ܼ� �޼ҵ� ȣ���� ���� ��ü�� ������ ������
//		���� -> x
//		��ü ������ �ʾƵ� ��� ������
//		static�޼ҵ忡�� static�� �ƴѰ� ��� �Ұ���
public class Computer {
	String cpu;
	int ram;
	int hdd;
	static final String MAKER = "�Ｚ";
	
	public static void staticTest() {
		System.out.println("staticTest");
	}
	
	public static void printMaker() {
		System.out.println(MAKER);
		// System.out.println(cpu);
	}
	
	public void printInfo() {
		System.out.println(cpu);
		System.out.println(ram);
		System.out.println(hdd);
		System.out.println(MAKER);
	}
}
