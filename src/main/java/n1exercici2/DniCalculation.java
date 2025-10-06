package n1exercici2;

public class DniCalculation {
    private int number;
    private char letter;
    private static final char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public DniCalculation(int number){
        if(number < 0 || number > 99999999) {
            throw new IllegalArgumentException("The DNI number must have between 0 and 99999999 characters");
        }

        this.number = number;
        this.letter = getDniLetter();
    }

    public char getDniLetter(){
        int modulus = this.number % letters.length;
        char letterCalculated = letters[modulus];

        return letterCalculated;
    }

}
