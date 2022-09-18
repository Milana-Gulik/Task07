import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a letter of the English alphabet: ");

        char letter = scanner.next().charAt(0);

        letter = Character.toUpperCase(letter);

        String feedback;

        switch (letter) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'Y':
                feedback = "Letter " + letter + " is a vowel!";
                break;
            case 'B':
            case 'C':
            case 'D':
            case 'F':
            case 'G':
            case 'H':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'V':
            case 'W':
            case 'X':
            case 'Z':
                feedback = "Letter " + letter + " is a consonant!";
                break;
            default:
                feedback = "You have entered incorrect data!";
        }

        System.out.println(feedback);
        scanner.close();

    }
}
