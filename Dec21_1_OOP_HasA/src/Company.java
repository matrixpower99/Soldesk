
public class Company {
	String name;
	int employee;
	Phone product;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}
	
	public Company(String name) {
		super();
		this.name = name;
	}

	public Company(String name, int employee, Phone product) {
		super();
		this.name = name;
		this.employee = employee;
		this.product = product;
	}


	public void print() {
		System.out.println(name);
		System.out.println(employee);
		if (product !=null) {
			product.print();
		}
	}
}
