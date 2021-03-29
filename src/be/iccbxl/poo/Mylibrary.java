package be.iccbxl.poo;

import java.util.ArrayList;
/**
 * Biblioth�que r�pr�sent�e par 
 * 
 * @author JAVA Patrick Owandji
 * @version 1.0
 * 
 *
 */

public class Mylibrary {
	
	
	/**
	 * Nom de la biblioth�que
	 */
	private String name;
	
	/**
	 * Liste des livres
	 */
	private ArrayList<Book> books;
	
	/**
	 * Liste des membres
	 */
	private ArrayList<Person> people;
	
	/**
	 * Cr�e une biblioth�que en sp�cifiant son nom
	 * 
	 * @param name Nom de la biblioth�que
	 */
	public MyLibrary(String name) {
		this.name = name;
		this.books = new ArrayList<Book>();
		this.people = new ArrayList<Person>();
	}

	/**
	 * Renvoie le nom de la biblioth�que
	 * 
	 * @return Le nom de la biblioth�que
	 */
	public String getName() {
		return name;
	}

	/**
	 * Modifie le nom de la biblioth�que
	 * 
	 * @param name Nouveau nom de la biblioth�que
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Renvoie la liste des livres
	 * 
	 * @return la liste des livres
	 */
	public ArrayList<Book> getBooks() {
		return books;
	}

	/**
	 * Renvoie la liste des membres
	 * 
	 * @return la liste des membres
	 */
	public ArrayList<Person> getPeople() {
		return people;
	}

	@Override
	public String toString() {
		final int maxLen = 3;
		return "MyLibrary [name=" + name + ", books="
				+ (books != null ? books.subList(0, Math.min(books.size(), maxLen)) : null) + ", people="
				+ (people != null ? people.subList(0, Math.min(people.size(), maxLen)) : null) + "]";
	}

	public void addBook(Book book) {
		this.books.add(book);
	}

	public void addPerson(Person person) {
		this.people.add(person);
	}

}
