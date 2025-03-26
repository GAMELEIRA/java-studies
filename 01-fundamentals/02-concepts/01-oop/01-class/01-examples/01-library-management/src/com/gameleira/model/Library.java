package com.gameleira.model;

import java.util.ArrayList;

public class Library {
	
	private ArrayList<Book> books;
	private ArrayList<User> users;
	
	public Library() {
		this.books = new ArrayList<Book>();
		this.users = new ArrayList<User>();
	}
	
	public Library(ArrayList<Book> books, ArrayList<User> users) {
		this.books = new ArrayList<Book>();
		this.users = new ArrayList<User>();
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBook(Book book) {
		this.books.add(book);
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUser(User user) {
		this.users.add(user);
	}
	
	public ArrayList<Book> listLibrarysIsRented() {
		ArrayList<Book> listLibrarysIsRented = new ArrayList<Book>();
		
		for (Book book: this.books) {
			if (book.isRented()) {
				listLibrarysIsRented.add(book);
			}
		}
		
		return listLibrarysIsRented;
	}
	
	public ArrayList<Book> listLibrarysIsNotRented() {
		ArrayList<Book> listLibrarysIsNotRented = new ArrayList<Book>();
		
		for (Book book: this.books) {
			if (!book.isRented()) {
				listLibrarysIsNotRented.add(book);
			}
		}
		
		return listLibrarysIsNotRented;
	}
	
	public void lendBook(User user, Book book) {
		if (!book.isRented()) {
			user.setBooks(book);
			book.setRented(true);
			System.out.println("Emprestimo realizado");
		} else {
			System.out.println("Livro indisponivel para emprestimo");
		}
	}
	
	public void returnBook(User user, Book book) {
		if (book.isRented()) {
			user.setBooks(book);
			book.setRented(false);
			System.out.println("Devolucao realizada");
		} else {
			System.out.println("Nao ha emprestimos para esse livro");
		}
	}
}
