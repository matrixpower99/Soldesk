package com.matrix.dc232fp.soldesk;

// 2. factory역활을 할 클래스를 같은 패키지에 만들기
public class Manager {
	private int studentCount;
	
	// 3. 학생 객체를 만드는 메소드
	public Student talk(String name) {
		studentCount++;
		return new Student(name, studentCount);
	}

	
}
