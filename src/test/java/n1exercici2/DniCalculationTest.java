package n1exercici2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DniCalculationTest {

    @Test
    void negativeNumberThrowsException(){
        assertThrows(IllegalArgumentException.class,
                () -> {
                    DniCalculation dniCalculation = new DniCalculation((-253));
                });
    }

    @Test
    void greaterNumberThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    DniCalculation dniCalculation = new DniCalculation((548796321));
                });
    }

    @Test
    void sameNumbersReturnsSameLetter(){
        DniCalculation dniCalculation = new DniCalculation(79643278);
        DniCalculation dniCalculation1 = new DniCalculation(79643278);

        assertEquals(dniCalculation1.getDniLetter(), dniCalculation.getDniLetter());
    }

   @ParameterizedTest(name = "Dni{0}  → letter {1}")
    @CsvSource({
        "53625693, C",
        "46404816, Q",
        "22544885, D",
        "12345678, Z",
        "11111111, H",
        "22222222, J",
        "33333333, P",
        "44444444, A",
        "55555555, K",
        "99999999, R"
    })
    void letterCalculationIsOk(int number, char expectedLetter){
        DniCalculation dniCalculation = new DniCalculation(number);

        assertEquals(expectedLetter, dniCalculation.getDniLetter(),
                "Incorrect letter for number " + number);
   }


}