import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your age in numbers: ");
        int age = scanner.nextInt();

        String msg = "";

        if (age <= 0 || age > 120) {
            msg = "Error! The age is specified incorrectly! " +
                    "Input the age from 1 to 120.";
        }

        if (age == 100) {
            msg = "one hundred ";
        }

        if (age >= 101 && age <= 120) {
            msg = "one hundred and ";
        }

        if (age > 1 && age <= 120) {
            switch (age % 100 / 10) {
                case 2: msg += "twenty "; break;
                case 3: msg += "thirty "; break;
                case 4: msg += "forty "; break;
                case 5: msg += "fifty "; break;
                case 6: msg += "sixty "; break;
                case 7: msg += "seventy "; break;
                case 8: msg += "eighty "; break;
                case 9: msg += "ninety "; break;
            }

            if (age % 100 >= 10 & age % 100 < 20) {
                switch (age % 100) {
                    case 10: msg += "ten "; break;
                    case 11: msg += "eleven "; break;
                    case 12: msg += "twelve "; break;
                    case 13: msg += "thirteen "; break;
                    case 14: msg += "fourteen "; break;
                    case 15: msg += "fifteen "; break;
                    case 16: msg += "sixteen "; break;
                    case 17: msg += "seventeen "; break;
                    case 18: msg += "eighteen "; break;
                    case 19: msg += "nineteen "; break;
                }

            } else {
                switch (age % 10) {
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
        }

        String year = "";
        if (age > 1 && age <= 120) {
            year = msg + "years.";
        }

        String result = msg + year;
        System.out.println(result);
        scanner.close();
    }
}
