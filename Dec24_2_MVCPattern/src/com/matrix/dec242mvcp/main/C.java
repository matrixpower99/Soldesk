package com.matrix.dec242mvcp.main;

// �������α׷��� - Ŀ��ŧ�� �ƴ�
// Spring ���� -> 

// java -> jsp -> spring
// java -> jsp
// 		-> JSP�� MVC���� �����Ų�� : JSP Model 2
// 		-> JSP Model 2 ������ : Spring
//
// MVC����
//		������ ������ ���� �ϳ��� M/V/C�߿� �ϳ��� ���Ҹ�
//			A.java -> M
//			B.java -> V
//			C.java -> C
// 		���� �ϳ��� �Ѹ��� �۾��ϴ°� ����
// 		������Ʈ���� �پ��� ������ ������� ������
//		
//		������ ������
//		���� ������
//		�����̳�
//		��

// Controller
// 		����ڵ鿡�� ���������� ����
//		�帧����(M�� �ʿ��ϸ� M ��ȯ, V�� �ʿ��ϸ� V ��ȯ)
//		������ �������� �۾�����

public class C {
	public static void main(String[] args) {
		int x = V.getX();
		String result = M.judge(x);
		V.printResult(result);
	}
}
