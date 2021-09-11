package JavaPrograms;

// The computer will choose a random number and you will get multiple chances to guess it.
// The computer will also give advice as to what the number is.
// For example, if the number is 5 and you said 7, it will output "less"

import java.util.*;
public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(100);
        num += 1;
        System.out.print("Guess My Number: ");
        int playerGuess = scan.nextInt();
        while (playerGuess != num){
            if (playerGuess > num)
                System.out.println("less");
            else
                System.out.println("greater");
            playerGuess = scan.nextInt();
        }
        System.out.println("Correct!");
    }
}
