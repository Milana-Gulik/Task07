import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("*** The name of the number as a string ***\n" + "Input number: ");
        int number = scanner.nextInt();

        String msg = "";

        if (number <= 0 || number > 999) {
            System.out.println("Error! Enter the correct data!");
        }

        switch (number / 100) {
            case 1: msg = " one hundred "; break;
            case 2: msg = " two hundred "; break;
            case 3: msg = " three hundred "; break;
            case 4: msg = " four hundred "; break;
            case 5: msg = " five hundred "; break;
            case 6: msg = " six hundred "; break;
            case 7: msg = " seven hundred "; break;
            case 8: msg = " eight hundred "; break;
            case 9: msg = " nine hundred "; break;
        }

        switch (number % 100 / 10) {
            case 2: msg += "twenty "; break;
            case 3: msg += "thirty "; break;
            case 4: msg += "forty "; break;
            case 5: msg += "fifty "; break;
            case 6: msg += "sixty "; break;
            case 7: msg += "seventy "; break;
            case 8: msg += "eighty "; break;
            case 9: msg += "ninety "; break;
        }

        if (number % 100 >= 10 & number % 100 < 20) {
            switch (number % 100) {
                case 10: msg += "ten "; break;
                case 11: msg += "eleven "; break;
                case 12: msg += "twelve "; break;
                case 13: msg += "thirteen "; break;
                case 14: msg += "fourteen "; break;
                case 15: msg += "fifteen "; break;
                case 16: msg += "sixteen ";break;
                case 17: msg += "seventeen "; break;
                case 18: msg += "eighteen "; break;
                case 19: msg += "nineteen "; break;
            }

        } else {
            switch (number % 10) {
                case 1: msg += "one "; break;
                case 2: msg += "two "; break;
                case 3: msg += "three "; break;
                case 4: msg += "four "; break;
                case 5: msg += "five "; break;
                case 6: msg += "six "; break;
                case 7: msg += "seven "; break;
                case 8: msg += "eight "; break;
                case 9: msg += "nine "; break;
            }
        }
        if (number >= 1 && number <= 999) {
            System.out.println("The number as a string:" +msg);
            scanner.close();
        }
    }
}
