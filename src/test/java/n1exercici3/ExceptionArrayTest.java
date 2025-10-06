package n1exercici3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionArrayTest {
    @Test
    void assertExceptionThrow(){
        assertThrows(IndexOutOfBoundsException.class,
                () -> {
                ExceptionArray.forceException();
                });
    }

}