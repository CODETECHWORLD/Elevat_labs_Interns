package com.librarymanagementsystem;

public class User {
	private int id;
	private String name;
	private Book issuedBook;
	
	public User(int id, String name) {
		this.id = id;
		this.name = name;
		this.issuedBook = null;
	}
	

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	
	public Book getIssuedBook() {
		return issuedBook;
	}
	public void setIssuedBook(Book issuedBook) {
		this.issuedBook = issuedBook;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + (issuedBook != null ? " [Has: " + issuedBook.getTitle() + "]" : " [No book issued]");
	}
	
	
}
