package n1exercici1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookManagement {
    private List<Book> books;

    public BookManagement() {
        this.books = new ArrayList<>();
    }

    public List<Book> getBookList(){
        return Collections.unmodifiableList(books);
    }

    public void addBook(Book book){
        if(book == null) {
            throw new IllegalArgumentException("The book cannot be null.");
        }
        for(Book b : books) {
            if (b.getTitle().equalsIgnoreCase(book.getTitle())) {
                return;
            }
        }
        books.add(book);

        books.sort((b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
    }

    public String getBookTitleByIndex(int index){
        return books.get(index).getTitle();
    }

    public void addBookIntoPosition(Book book, int index){
        if(book == null) {
            throw new IllegalArgumentException("The book cannot be null.");
        }
        books.add(index, book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public void removeBookByTitle(String title){
        for(int i = 0; i < books.size(); i++) {
            if(books.get(i).getTitle().equalsIgnoreCase(title)){
                books.remove(i);
            }
        }
        books.sort((b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
    }

    public void clearBooks(){
        books.clear();
    }

}
