import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Are multiples");
        } else {
            System.out.println("Are not multiples");
        }
        sc.close();
    }
}
