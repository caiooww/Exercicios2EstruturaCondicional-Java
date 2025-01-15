import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N<0){
            System.out.println("NEGATIVE");
        }
        else {
            System.out.println("NON NEGATIVE");
        }
        sc.close();
        }
    }
