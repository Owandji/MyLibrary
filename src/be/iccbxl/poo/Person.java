package be.iccbxl.poo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * La classe person caractérise par un nom (name), 
 * le nombre de livres maximum qu’il peut emprunter en même temps (maxBooks)
 *  et sa date d’inscription (registrationDate)
 *  
 * @author Patrick Owandji
 *
 *@version 1.0
 */

public class Person {

	protected int id;
	private String name;
	private byte maxBooks;
	private LocalDate registrationDate;
	private ArrayList<Book> books;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		this.maxBooks = 3;
		this.registrationDate = LocalDate.now();
		this.books = new ArrayList<Book>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getMaxBooks() {
		return maxBooks;
	}

	public void setMaxBooks(byte maxBooks) {
		this.maxBooks = maxBooks;
	}

	public int getId() {
		return id;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	@Override
	public String toString() {
		final int maxLen = 3;
		return "Person [id=" + id + ", name=" + name + ", maxBooks=" + maxBooks + ", registrationDate="
				+ registrationDate + ", books="
				+ (books != null ? books.subList(0, Math.min(books.size(), maxLen)) : null) + "]";
	}

	public void borrows(Book book) {
		this.books.add(book);
		book.setBorrower(this);
		book.borrowingDate = LocalDate.now();
	}

	public void returns(Book book) {
		this.books.remove(book);
		book.setBorrower(null);
		book.borrowingDate = null;
	}
	

}
