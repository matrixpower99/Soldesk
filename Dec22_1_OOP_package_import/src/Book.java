
public class Book extends Product {
	String author;
	
	public Book() {
	}

	public Book(String name, int price, String author) {
		super(name, price);
		this.author = author;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(author);
	}
}
