// Pen is a Product - O -> ��� ��밡��
// ���� ��ǰ

// ��� - inheritance -> �ڹٿ� ���������� �̷��� ����
// Ȯ�� - extend -> ���Ŀ��

public class Pen extends Product {
	// �ƹ��͵� ���� ��������
	// ����/�θ�/Super Ŭ����(Product)�� �ִ� ������� �� �����޾ƿ�
	String color; // ��� �߰�

	// Product�κ��� �����޾ƿ� �޼ҵ� print�� �̸�, ���� ��� ��ɸ� ����
	// Pen���� color����� �߰��� -> �޼ҵ� print�� color��� ��ɵ� �ְ� ����

	// overloading -> ��Ӱ��� ���� -> �޼ҵ�� ����, �Ķ���ʹ� �ٸ���
	// �����޾ƿ� �޼ҵ忡 ��� ������(�ٲٱ�) -> overriding

	// @xxx : annotation (xxx�ڸ��� ������ �����Ŀ� ���� �ٸ���)
	// ������ζ�� �������� �۾��ؾ� -> �ڵ����� ó��

	// @Override : �ٷ� ���� �޼ҵ尡 overriding�� �޼ҵ尡 �ƴϸ� ����
	// �ҽ��� �������� ����. �����ڰ� �ҽ����� overriding�� �޼ҵ����� �ٷ� �� �� �ְ� ����.
	@Override
	public void print() {
		// super : ����Ŭ����(Product)
		super.print(); // Product�� �ִ� print�� ȣ�� -> �̸�, ����
		System.out.println(color);
	}
}
