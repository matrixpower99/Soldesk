// ������
//		����� �ȵ� -> ���� ���� ���
// 		����Ŭ���� ��ü �����(Coffee) ����Ŭ���� ������(Menu) �ڵ� ȣ��
public class Menu {
	String Name;
	int price;
	
	public Menu() {
		// TODO Auto-generated constructor stub
	}
	
	public Menu(String name, int price) {
		super();
		this.Name = name;
		this.price = price;
	}

	public void print() {
		System.out.println(Name);
		System.out.println(price);
	}
	
}
