import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the dignity of the card: ");
        int dignity = scanner.nextInt();

        System.out.print("Input the suit of the card: ");
        int suit = scanner.nextInt();

        String suit_msg = "";


        if (suit >= 1 && suit <= 4 && dignity >= 6 && dignity <=14) {
            switch (suit) {
                case 1: suit_msg = " of spades"; break;
                case 2: suit_msg = " of clubs"; break;
                case 3: suit_msg = " of diamonds"; break;
                case 4: suit_msg = " of hearts"; break;
                default: suit_msg = "Error! This card does not exist!"; break;
            }
        }

        String dignity_msg = "Error! This card does not exist!";

        if (dignity >= 6 && dignity <=14 && suit >= 1 && suit <=4) {
            switch (dignity) {
                case 6: dignity_msg = "Six"; break;
                case 7: dignity_msg = "Seven"; break;
                case 8: dignity_msg = "Eight"; break;
                case 9: dignity_msg = "Nine"; break;
                case 10: dignity_msg = "Ten"; break;
                case 11: dignity_msg = "Jack"; break;
                case 12: dignity_msg = "Queen"; break;
                case 13: dignity_msg = "King"; break;
                default: break;
            }
        }

        String result = dignity_msg + suit_msg;
        System.out.println(result);
        scanner.close();
    }
}
