import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        String msg = "";

        if (age <= 0 || age > 120) {
            msg = "Ошибка! Возраст указан неверно! " +
                    "Введите возраст от 1 до 120 лет.";
        }

        if (age == 100) {
            msg = "сто лет";
        }

        if (age >= 101 && age <= 120) {
            msg = "сто ";
        }

        if (age > 1 && age <= 120) {
            switch (age % 100 / 10) {
                case 2: msg += "двадцать "; break;
                case 3: msg += "тридцать "; break;
                case 4: msg += "сорок "; break;
                case 5: msg += "пятьдесят "; break;
                case 6: msg += "шестьдесят "; break;
                case 7: msg += "семьдесят "; break;
                case 8: msg += "восемьдесят "; break;
                case 9: msg += "девяносто "; break;
            }

            if (age % 100 >= 10 & age % 100 < 20) {
                switch (age % 100) {
                    case 10: msg += "десять "; break;
                    case 11: msg += "одинадцать "; break;
                    case 12: msg += "двенадцать "; break;
                    case 13: msg += "тринадцать "; break;
                    case 14: msg += "четырнадцать "; break;
                    case 15: msg += "пятнадцать "; break;
                    case 16: msg += "шестнадцать "; break;
                    case 17: msg += "семнадцать "; break;
                    case 18: msg += "восемнадцать "; break;
                    case 19: msg += "девятнадцать "; break;
                }

            } else {
                switch (age % 10) {
                    case 1: msg += "один "; break;
                    case 2: msg += "два "; break;
                    case 3: msg += "три "; break;
                    case 4: msg += "четыре "; break;
                    case 5: msg += "пять "; break;
                    case 6: msg += "шесть "; break;
                    case 7: msg += "семь "; break;
                    case 8: msg += "восемь "; break;
                    case 9: msg += "девять "; break;
                }
            }
        }

            String add = "";

            if (age > 1 && age <= 120) {
                if ((age % 10) == 1)
                    add = "год";
                if (((age % 10) >= 2) && (age % 10) <= 4)
                    add = "года";
                if (((age % 10) >= 5))
                    add = "лет";
                if (age >= 11 && age <= 19 || age >= 111 && age <= 120)
                    add = "лет";
            }


            System.out.println(msg + add);
            scanner.close();
    }
}
