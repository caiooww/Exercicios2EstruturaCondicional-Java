import java.util.Locale;
import java.util.Scanner;

public class ex06 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double number = sc.nextDouble();

        if (number < 0.0 || number > 100.0) {
            System.out.println("Out of range");
        }
        else if (number <= 25.0) {
            System.out.println("Range [0,25]");
        }
        else if (number <= 50.0) {
            System.out.println("Range (25,50]");
        }
        else if (number <= 75.0) {
            System.out.println("Range (50,75]");
        }
        else {
            System.out.println("Range (75,100]");
        }

        sc.close();
    }
}