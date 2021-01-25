package org.comstudy21.ClassEx;

public class Book {
	String title;
	String author;
	void show() { System.out.println(title+" "+author); }

	public Book() {
		this("","");
		System.out.println("생성자 호출 됨");
	}
	public Book(String title) {
		this(title, "작자미상");
	}
	public Book(String title, String author) {
		this.title = title; this.author = author;
	}
	public static void main(String[] args) {
		Book javabook = new Book("Java", "황기태");
		Book bible = new Book("bible");
		Book emptyBook = new Book();
		
		bible.show();
		javabook.show();
	}
}