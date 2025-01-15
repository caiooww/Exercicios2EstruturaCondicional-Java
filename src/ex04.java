import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the start and end time of the game: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        int duration;
        if (start < end) {
            duration = end - start;
        } else {
            duration = 24 - start + end;
        }

        System.out.println("The game lasted " + duration + " hours");
        sc.close();
}}

