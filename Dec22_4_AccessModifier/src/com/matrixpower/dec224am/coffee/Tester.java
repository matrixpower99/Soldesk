package com.matrixpower.dec224am.coffee;

import com.matrixpower.dec224am.book.Book;

public class Tester extends Book {
	public static void main(String[] args) {
		Book b = new Book();
		b.title = "자바";
		b.writer = "홍길동"; // 이론적으로 돌아가지 않음. 버그성?
		b.price = 20000;
		b.pageCount = 200;
		
	}
}
