import java.util.*;
import java.lang.Math;

class Taks1 {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int random_number = (int) (Math.random() * (max - min + 1) + min);

        Scanner in = new Scanner(System.in);
        int i, k = 4;
        System.out.println("A number is chosen"
                + " between 1 to 100."
                + "Guess the number"
                + " within 4 trials.");
        for (i = 0; i < k; i++) {
            System.out.println("guess a number");
            int guess_number = in.nextInt();
            if (guess_number == random_number) {
                System.out.println("Congratulation! " + " You guessed the number");
                break;
            } else if (random_number > guess_number
                    && i != k - 1) {
                System.out.println(
                        "The number is "
                                + "greater than " + guess_number);
            } else if (random_number < guess_number
                    && i != k - 1) {
                System.out.println(
                        "The number is"
                                + " less than " + guess_number);
            }
        }
        if (i == k) {
            System.out.println(
                    "You have exhausted"
                            + " 4 trials.");

            System.out.println(
                    "The number was " + random_number);
        }

    }
}