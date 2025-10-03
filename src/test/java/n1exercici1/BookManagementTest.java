package n1exercici1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookManagementTest {
    @Test
    void BookListIsNotNull(){
        BookManagement bookManagement = new BookManagement();
        assertNotNull(bookManagement.getBookList());
    }
}