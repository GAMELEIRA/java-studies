package com.gameleira.app;

import com.gameleira.model.Author;
import com.gameleira.model.Book;
import com.gameleira.model.Library;
import com.gameleira.model.User;

public class App {

	public static void main(String[] args) {
		
		Library library = new Library();
		Author author = new Author("John Green");
		
		Book book1 = new Book("Culpa das Estrelas", author, 500);
		Book book2 = new Book("A procura de Alaska", author, 500);
		Book book3 = new Book("Cidades de Papel", author, 500);
		Book book4 = new Book("Tartarugas Até la Embaixo", author, 500);

		library.setBook(book1);
		library.setBook(book2);
		library.setBook(book3);
		library.setBook(book4);
		
		User user1 = new User(library.getBooks().size(), "Gabriel");
		User user2 = new User(library.getBooks().size(), "Cibele");
		User user3 = new User(library.getBooks().size(), "Miriam");
		User user4 = new User(library.getBooks().size(), "Paulo");
		
		library.setUser(user1);
		library.setUser(user2);
		library.setUser(user3);
		library.setUser(user4);
		
		library.lendBook(user1, book1);
		library.lendBook(user2, book1);
		library.lendBook(user4, book4);
		
		for (Book book: library.listLibrarysIsRented()) {
			System.out.println("Livros Indisponivel: " + book);
		}
		
		for (Book book: library.listLibrarysIsNotRented()) {
			System.out.println("Livro disponivel: " + book);
		}

		library.returnBook(user1, book1);
		
		for (Book book: library.listLibrarysIsRented()) {
			System.out.println("Livros Indisponivel: " + book);
		}
		
		for (Book book: library.listLibrarysIsNotRented()) {
			System.out.println("Livro disponivel: " + book);
		}

	}

}
