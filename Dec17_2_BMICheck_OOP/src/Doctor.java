// 파란색 멤버변수 : 객체의 속성
// 똥색 지역변수 : 그 메소드 실행하는 동안 임시로 필요한

// PP -> OOP 패러다임이 완전히 바뀌었음

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
		System.out.print("이름 : ");
		g.tellName();
		System.out.print("키(cm) : ");
		g.tellHeight();
		System.out.print("체중(kg) : ");
		g.tellWeight();
	}
	
	public void calculate(Guest g) {
		double hm = g.height / 100; // 손님의 키를 cm -> m로 변경
		g.bmi = g.weight / (hm * hm); 
	}
	
	public void judge(Guest g) {
		g.health = "저체중";
		if (g.bmi >= 35 ) {
			g.health = "고도 비만";
		} 
		if (g.bmi >= 30) {
			g.health = "중도(2단계) 비만";
		} 
		if (g.bmi >= 25) {
			g.health = "경도(1단계) 비만";
		} 
		if (g.bmi >= 23) {
			g.health = "과체중";
		} 
		if (g.bmi >= 18.5) {
			g.health = "정상";
		} 
	}
	
	public void tellResult(Guest g) {
		System.out.println("----------------");
		System.out.printf("BMI : %.2f\n", g.bmi);
		System.out.printf("%s씨는 \"%s\" 입니다.\n", g.name, g.health);
	}
}
