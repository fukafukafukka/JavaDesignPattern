package iterator.concreateAggregate;

import java.util.ArrayList;

import iterator.Aggregate;
import iterator.Book;
import iterator.Iterator;
import iterator.concreateIterator.DegitalBookShelfIterator;

public class DegitalBookShelf implements Aggregate {

	private ArrayList<Book> books;

	public DegitalBookShelf(int size) {
		this.books = new ArrayList<Book>();
	}

	public Book getBookAt(int index) {
		return this.books.get(index);
	}

	public void appendBook(Book book) {
		this.books.add(book);
	}

	public int getLength() {
		return this.books.size();
	}

    public Iterator iterator() {
    	return new DegitalBookShelfIterator(this);
	}

}
