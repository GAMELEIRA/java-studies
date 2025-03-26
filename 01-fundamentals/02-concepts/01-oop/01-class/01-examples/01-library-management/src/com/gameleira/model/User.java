package com.gameleira.model;

import java.util.ArrayList;

public class User {
	
	private long id;
	private String name;
	ArrayList<Book> books;
	
	public User() {}
	
	public User(long id, String name) {
		this.id = id;
		this.name = name;
		this.books = new ArrayList<Book>();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(Book book) {
		if (!book.isRented()) {
			this.books.add(book);
		} else {
			this.books.remove(book);
		}
	}
}
