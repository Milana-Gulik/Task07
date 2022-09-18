import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your mark: ");
        int mark = scanner.nextInt();

        String msg = "Error";

        if (mark >= 0 && mark <= 10) {
            switch (mark) {
                case 0:
                case 1: msg = "Very bad"; break;
                case 2:
                case 3: msg = "Unsatisfactory"; break;
                case 4:
                case 5: msg = "Satisfactory"; break;
                case 6: msg = "Good"; break;
                case 7:
                case 8: msg = "Very Good"; break;
                default: msg = "Well done";
            }
        }
        System.out.println(msg);
        scanner.close();
    }
}
