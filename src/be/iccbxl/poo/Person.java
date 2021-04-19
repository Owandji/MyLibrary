package be.iccbxl.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;
/**
 * Classe qui répresente une personne membre de la bibliothèque
 * @author Patrick Owandji
 * @version = 1.0
 */
public class Person {
	/**
	 * L'ID de la personne
	 */
	protected UUID id;
	/**
	 * Nom de la personne(membre)
	 */
	private String name;
	/**
	 * Nombre maximum de livre que la personne peut emprunter
	 */
	private byte maxBooks;
	/**
	 * Date d'enregistrement de la personne
	 */
	private LocalDate registrationDate;
	/**
	 * Liste des livres empruntés par la personne
	 */
	private ArrayList<Book> books;
	//public Person(UUID id, String name, byte maxBooks, LocalDate registrationDate, ArrayList<UUID> books){
	/**
	 * Constructeurs de la classe Personne
	 * @param id de la personne
	 * @param name nom de la personne
	 */
	public Person(UUID id, String name) {
		this.id = id;
		this.name = name;
		this.maxBooks = 3;
		this.registrationDate = LocalDate.now();
		this.books = new ArrayList<Book>();
	}
    /**
     * Retourne le nom d ela personne 
     * @return le nom de la personne
     */
	public String getName() {
		return name;
	}
    /**
     * Change le nom de la personne
     * @param name le nouveau nom de la personne
     */
	public void setName(String name) {
		this.name = name;
	}
    /**
     * Retourne le nombre maximum des livres qui peuvent être empruntés
     * @return Retourne le nombre maximum des livres qui peuvent être empruntés
     */
	public byte getMaxBooks() {
		return maxBooks;
	}
	/**
	 * Change le nombre maximum des livres qui peuvent être empruntés
	 * @param maxBooks Le nouveau nombre maximum de livres empruntable par la personne
	 */
	public void setMaxBooks(byte maxBooks) {
		this.maxBooks = maxBooks;
	}
	/**
	 * Retourne l'ID de la personne
	 * @return L'ID de la personne
	 */
	public UUID getId() {
		return id;
	}
    /**
     * Retourne la date de l'enregistrement du membre
     * @return la date de l'enregistrement du membre
     */
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
    /**
     * Retourne la liste des livres de la personne
     * @return la liste des livres de la personne
     */
	public ArrayList<Book> getBooks() {
		return books;
	}
	/**
	 * Répresente l'affichage de la personne sous forme de texte
	 */
	@Override
	/*public String toString() {
		return "Nom: " + name + "\tInscrit le: " + registrationDate + "\tNumber of books borrowed: " + books.size();*/
	public String toString() {
		final int maxLen = 3;
		return "Person [" + id + ": " + name + " ( maxBooks=" + maxBooks + ", Date d'enregistement le " + registrationDate + ") - "
				+ registrationDate + ") - livre ="
				+ (books != null ? books.subList(0, Math.min(books.size(), maxLen)) : null) + "]\n";
	}
    /**
     * Marque la personne comme emprunteur et ajoute le livre emprunter dans la liste
     * @param book Le livre à emprunter
     */
	public void borrows(Book book) {
		this.books.add(book);
		book.setBorrower(this);
		book.borrowingDate = LocalDate.now();
	}
    /**
     * Retire le livre emprunté de <book>
     * @param book le livre à retirer
     */
	public void returns(Book book) {
		this.books.remove(book);
		book.setBorrower(null);
		book.borrowingDate = null;
	}

}
