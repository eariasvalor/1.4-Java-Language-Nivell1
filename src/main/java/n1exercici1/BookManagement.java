package n1exercici1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookManagement {
    private List<Book> books;

    public BookManagement() {
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks(){
        return Collections.unmodifiableList(books);
    }

    public String getBookTitle(int index){
        return books.get(index).getTitle();
    }

    public void addBook(Book book){
        if(book == null) {
            throw new IllegalArgumentException("The book cannot be null.");
        }
        books.add(book);
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
    }

    public void clearBooks(){
        books.clear();
    }

}
