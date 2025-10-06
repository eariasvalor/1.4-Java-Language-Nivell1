package n1exercici1;

import org.junit.jupiter.api.Test;

import java.util.List;

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

    @Test
    void ThereIsNoDuplicatedQuijote(){
        BookManagement bookManagement = new BookManagement();

        bookManagement.addBook(new Book("El Quijote"));
        int sizeBefore = bookManagement.getBookList().size();

        bookManagement.addBook(new Book("El Quijote"));
        int sizeAfter = bookManagement.getBookList().size();

        assertEquals(sizeBefore, sizeAfter);

    }

    @Test
    void getQuijoteByPositionOne(){
        BookManagement bookManagement = new BookManagement();

        bookManagement.addBook(new Book("Les Misérables"));
        bookManagement.addBook(new Book("Crime and Punishment"));
        bookManagement.addBook(new Book("El Quijote"));

        assertTrue(bookManagement.getBookList().get(1).getTitle().equalsIgnoreCase("El Quijote"));
    }

    @Test
    void addingNewBookChangesListSize(){
        BookManagement bookManagement = new BookManagement();

        bookManagement.addBook(new Book("Les Misérables"));
        bookManagement.addBook(new Book("Crime and Punishment"));

        int sizeBefore = bookManagement.getBookList().size();

        bookManagement.addBook(new Book("El Quijote"));

        assertEquals((sizeBefore + 1), bookManagement.getBookList().size());
    }

    @Test
    void removingBookReducesListSize(){
        BookManagement bookManagement = new BookManagement();

        bookManagement.addBook(new Book("Les Misérables"));
        bookManagement.addBook(new Book("Crime and Punishment"));
        bookManagement.addBook(new Book("El Quijote"));

        int sizeBefore = bookManagement.getBookList().size();

        bookManagement.removeBook(bookManagement.getBookList().get(2));

        assertEquals((sizeBefore - 1), bookManagement.getBookList().size());
    }
    @Test
    void listRemainsAlphabeticallySortedAfterAdd() {
        BookManagement bm = new BookManagement();

        bm.addBook(new Book("Zorro"));
        bm.addBook(new Book("Árbol"));
        bm.addBook(new Book("El Quijote"));
        bm.addBook(new Book("Les Misérables"));
        bm.addBook(new Book("Crime and Punishment"));

        List<Book> books = bm.getBookList();

        for (int i = 1; i < books.size(); i++) {
            String prev = books.get(i - 1).getTitle();
            String current = books.get(i).getTitle();

            assertTrue(prev.compareToIgnoreCase(current) <= 0,
                    "The list is not sorted: '" + prev + "' goes before '" + current + "'");
        }
    }

    @Test
    void listRemainsAlphabeticallySortedAfterRemove() {
        BookManagement bm = new BookManagement();

        bm.addBook(new Book("Zorro"));
        bm.addBook(new Book("Árbol"));
        bm.addBook(new Book("El Quijote"));
        bm.addBook(new Book("Les Misérables"));
        bm.addBook(new Book("Crime and Punishment"));

        bm.removeBook(bm.getBookList().get(2));

        List<Book> books = bm.getBookList();

        for (int i = 1; i < books.size(); i++) {
            String prev = books.get(i - 1).getTitle();
            String current = books.get(i).getTitle();

            assertTrue(prev.compareToIgnoreCase(current) <= 0,
                    "The list is not sorted: '" + prev + "' goes before '" + current + "'");
        }
    }

    @Test
    void listRemainsAlphabeticallySortedAfterRemoveByTitle() {
        BookManagement bm = new BookManagement();

        bm.addBook(new Book("Zorro"));
        bm.addBook(new Book("Árbol"));
        bm.addBook(new Book("El Quijote"));
        bm.addBook(new Book("Les Misérables"));
        bm.addBook(new Book("Crime and Punishment"));

        bm.removeBookByTitle("Árbol");

        List<Book> books = bm.getBookList();

        for (int i = 1; i < books.size(); i++) {
            String prev = books.get(i - 1).getTitle();
            String current = books.get(i).getTitle();

            assertTrue(prev.compareToIgnoreCase(current) <= 0,
                    "The list is not sorted: '" + prev + "' goes before '" + current + "'");
        }
    }



}