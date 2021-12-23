package com.matrixpower.dec224am.book;

// 접근제어자, 접근지정자(access modifier) 
//		클래스의 멤버(멤버변수/메소드/클래스)들 외부에서 접근여부를 조절하는
//		public : 모두 접근 가능
// 		protected : 같은 패키지 or 다른패키지지만 상속 관계가 있으면 접근 가능
//		(default/friendly) : 같은 패키지만 접근 가능
//		private : 외부에서 접근 불가능(내부 사용만 가능)
//		책은 위와 같이 나와 있지만 실제로 저렇게 동작하지 않음

//		public : open
//		protected or default : 같은 패키지 한정 오픈
//		private : close

public class Book {
	public String title;
	protected String writer;
	int price;
	private int pageCount;

	
	
}
