package com.matrix.dc232fp.soldesk;

// 2. factory��Ȱ�� �� Ŭ������ ���� ��Ű���� �����
public class Manager {
	private int studentCount;
	
	// 3. �л� ��ü�� ����� �޼ҵ�
	public Student talk(String name) {
		studentCount++;
		return new Student(name, studentCount);
	}

	
}
