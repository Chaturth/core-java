import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = 7;

        for (int i = 1; i <= 3; i++) {

            System.out.print("Guess the number: ");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Correct!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}
