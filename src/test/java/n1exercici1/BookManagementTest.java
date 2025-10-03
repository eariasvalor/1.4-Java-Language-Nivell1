package n1exercici1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookManagementTest {
    @Test
    void bookListIsNotNull(){
        BookManagement bookManagement = new BookManagement();
        assertNotNull(bookManagement.getBookList());
    }

    @Test
    void listHasSizeThreeWhenAddingThreeBooks(){
        BookManagement bookManagement = new BookManagement();
        bookManagement.addBook(new Book("First Book"));
        bookManagement.addBook(new Book("Second Book"));
        bookManagement.addBook(new Book("Third Book"));
        assertEquals(3, bookManagement.getBookList().size());
    }

    @Test
    void listHasSecondBookInPositionOne(){
        BookManagement bookManagement = new BookManagement();
        bookManagement.addBook(new Book("First Book"));
        bookManagement.addBook(new Book("Second Book"));
        bookManagement.addBook(new Book("Third Book"));
        assertTrue(bookManagement.getBookByTitle(1).equalsIgnoreCase("Second Book"));
    }

    @Test
    void listHasThirdBookInPositionTwo(){
        BookManagement bookManagement = new BookManagement();
        bookManagement.addBook(new Book("First Book"));
        bookManagement.addBook(new Book("Second Book"));
        bookManagement.addBook(new Book("Third Book"));
        assertTrue(bookManagement.getBookByTitle(2).equalsIgnoreCase("Third Book"));
    }

}