import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = scanner.nextInt();

        System.out.println("Enter the month: ");
        int month = scanner.nextInt();


        String msg = "30 days in January";


        if (year >= 1700 && year % 400 != 0 && month >= 1 && month <= 12) {
            switch (month) {
                case 2: msg = "28 days in February"; break;
                case 3: msg = "31 days in March"; break;
                case 4: msg = "30 days in April"; break;
                case 5: msg = "31 days in May"; break;
                case 6: msg = "30 days in June"; break;
                case 7: msg = "31 days in July"; break;
                case 8: msg = "31 days in August"; break;
                case 9: msg = "30 days in September"; break;
                case 10: msg = "31 days in October"; break;
                case 11: msg = "30 days in November"; break;
                case 12: msg = "31 days in December"; break;
            }
        } else
            msg = "Error! Enter the correct data";

        System.out.println(msg);
        scanner.close();
    }
}
