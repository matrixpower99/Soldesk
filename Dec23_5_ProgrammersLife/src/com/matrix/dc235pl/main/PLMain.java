package com.matrix.dc235pl.main;

import com.matrix.dc235pl.avengers.Spiderman;

// ����ȸ�� -> ����� ����
// �߻�޼ҵ��� ���� -> ���� Ŭ�������� �ݵ�� ������ �ؾ� �ϴ�
public class PLMain {
	public static void main(String[] args) {
		// �丣 -> Ʃ�丮�� �丣�� ���ͼ� 
		// �����ϱ� ��� : ��ġ�� ��� 
		// �� �����ϱ� ��� : attack�̶�� �̸����� �ϰ�, ������� ���ϰ� 
		// ������ -> �߻�޼ҵ� -> �߻�Ŭ���� -> ��Ӷ����� ���ƹ���
//					      -> �������̽� -> ��Ӷ��� ���� ���� -> ��簡 �̰ɷ� �۾����� �ؾ� ����

		// Avengers �������̽��� Ȱ���ؼ�
		// �����̴���
		// �����ϱ� ��� : �Ź��� �߻�
		Spiderman sm = new Spiderman();
		sm.attack();
		
		// �������̽��� �ڹٰ����ڵ� ���̿� ���� ���δ�. Ư�� Spring
	}
}
