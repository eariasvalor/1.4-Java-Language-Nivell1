package n1exercici2;

public class DniCalculation {
    static char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};


    public char getDniLetter(int dni){
        int modulus = dni % letters.length;
        char letter = letters[modulus];

        return letter;
    }

}
