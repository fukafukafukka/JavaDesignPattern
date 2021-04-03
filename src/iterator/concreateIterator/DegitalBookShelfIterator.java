package iterator.concreateIterator;

import iterator.Book;
import iterator.Iterator;
import iterator.concreateAggregate.DegitalBookShelf;

public class DegitalBookShelfIterator implements Iterator {

	private DegitalBookShelf bookShelf;
	private int index;

	public DegitalBookShelfIterator(DegitalBookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

    public boolean hasNext() {
    	if (index < this.bookShelf.getLength()) {
    		return true;
    	} else {
    		return false;
    	}
    }

    public Object next() {
    	Book book = this.bookShelf.getBookAt(index);
    	index++;
    	return book;
    }

}
