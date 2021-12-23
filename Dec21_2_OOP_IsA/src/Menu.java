// 생성자
//		상속이 안됨 -> 각자 만들어서 써야
// 		하위클래스 객체 만들면(Coffee) 상위클래스 생성자(Menu) 자동 호출
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
