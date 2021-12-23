// �Ķ��� ������� : ��ü�� �Ӽ�
// �˻� �������� : �� �޼ҵ� �����ϴ� ���� �ӽ÷� �ʿ���

// PP -> OOP �з������� ������ �ٲ����

public class Doctor {
	
	public void start() {
		Guest g = callGuest();
		ask(g);
		calculate(g);
		judge(g);
		tellResult(g);
	}
	
	public Guest callGuest() {
		return new Guest();
	}
	
	public void ask(Guest g) {
		System.out.print("�̸� : ");
		g.tellName();
		System.out.print("Ű(cm) : ");
		g.tellHeight();
		System.out.print("ü��(kg) : ");
		g.tellWeight();
	}
	
	public void calculate(Guest g) {
		double hm = g.height / 100; // �մ��� Ű�� cm -> m�� ����
		g.bmi = g.weight / (hm * hm); 
	}
	
	public void judge(Guest g) {
		g.health = "��ü��";
		if (g.bmi >= 35 ) {
			g.health = "�� ��";
		} 
		if (g.bmi >= 30) {
			g.health = "�ߵ�(2�ܰ�) ��";
		} 
		if (g.bmi >= 25) {
			g.health = "�浵(1�ܰ�) ��";
		} 
		if (g.bmi >= 23) {
			g.health = "��ü��";
		} 
		if (g.bmi >= 18.5) {
			g.health = "����";
		} 
	}
	
	public void tellResult(Guest g) {
		System.out.println("----------------");
		System.out.printf("BMI : %.2f\n", g.bmi);
		System.out.printf("%s���� \"%s\" �Դϴ�.\n", g.name, g.health);
	}
}
