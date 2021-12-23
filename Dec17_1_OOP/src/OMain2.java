// �޸�(RAM) - ������ϸ� �� �����
//		���� ����
//		?
//		stack
//			���α׷� ����� �ڵ����� �����
//			-> ���ᰡ �ȵǸ� ������ ����
//		heap
//			�ڵ����� ������� ���� -> �����ڰ� ���� ó���ؾ�

// Garbage Collection
//		heap���� �ڵ� ����(���ִ� System) -> ����?
//		�� ������ ����Ű�� ������ �� �̻� ������ �ߵ�

// Ŭ����(class) : �ؾƲ/����(�������ڸ�) -> ���忡 ���� ������ ������ 
// ��ü(object, instance) : �ǻ�Ȱ�� �����ϴ� �� -> �ؾ(�������ڸ�)/���� ������
public class OMain2 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.name = "�ǻ�";
		d1.age = 2;
		d1.printInfo();
		OMain.printHbar();
		
		Dog d2 = new Dog();
		d2.name = "�ѻ�";
		d2.age = 5;
		d2.printInfo();
		OMain.printHbar();
		
		// d1�� d3�ε� �θ� �� �ְ�
		Dog d3 = d1; // ���� 2�����ε� ������ 3���� ����
		d1.age = 10;
		d3.printInfo();
		OMain.printHbar();
		
		d1 = null; // ������ �������� ����� ��(stack ����)
		d2 = null;
//		d3.printInfo(); // d1.xxx -> Error, d3�δ� ȣ�� ����
		d3 = null; // �������÷��� �ߵ�. ���α׷� ����� Stack ������ �������Ƿ� heap������ �Ű� �� �ʿ� ����.

	}
}
