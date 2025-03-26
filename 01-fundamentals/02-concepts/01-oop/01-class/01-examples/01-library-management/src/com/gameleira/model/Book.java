package com.gameleira.model;

public class Book {
	
	private String title;
	private Author author;
	private int numberPages;
	private boolean isRented;
	
	public Book() {}
	
	public Book(String title, Author author, int numberPages) {
		this.title = title;
		this.author = author;
		this.numberPages = numberPages;
		this.isRented = false;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public int getNumberPages() {
		return numberPages;
	}

	public void setNumberPages(int numberPages) {
		this.numberPages = numberPages;
	}

	public boolean isRented() {
		return isRented;
	}

	public void setRented(boolean isRented) {
		this.isRented = isRented;
	}
	
	@Override() 
	public String toString() {
		return "Titulo: " + this.title + ", Autor: " + this.author + ", Numero de Paginas: " + this.numberPages + ", Disponivel: " + this.isRented;
	}
		
}
