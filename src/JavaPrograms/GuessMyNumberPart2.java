package JavaPrograms;

import java.util.*;
public class GuessMyNumberPart2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter a number between 1 and 100! The computer will guess what your number is!");
        System.out.print("Type -1 if the computer's guess is greater than your number, type 1 if the computer's guess is less, ");
        System.out.println("and type 0 if the computer is correct!");
        int num = scan.nextInt(), guess = random.nextInt(100),previousGuess = 1;
        guess += 1;
        System.out.println(guess);
        int greaterOrLess = scan.nextInt();
        while (guess != num){
            while (greaterOrLess == -1){
                if (previousGuess == guess - 1 || previousGuess == guess - 10){
                    while (guess > previousGuess && guess != num) {
                        guess -= 1;
                        System.out.println(guess);
                        greaterOrLess = scan.nextInt();
                    }
                }
                else if (guess <= 10){
                    previousGuess = guess;
                    guess -= 2;
                    System.out.println(guess);
                    greaterOrLess = scan.nextInt();
                }
                else{
                    previousGuess = guess;
                    guess -= 10;
                    System.out.println(guess);
                    greaterOrLess = scan.nextInt();
                }
            }
            while (greaterOrLess == 1){
                if (previousGuess == guess + 2 || previousGuess == guess + 10){
                    while (guess < previousGuess && guess != num) {
                        guess += 1;
                        System.out.println(guess);
                        greaterOrLess = scan.nextInt();
                    }
                }
                else if (guess > 90){
                    guess += 1;
                    System.out.println(guess);
                    greaterOrLess = scan.nextInt();
                }
                else{
                    previousGuess = guess;
                    guess += 10;
                    System.out.println(guess);
                    greaterOrLess = scan.nextInt();
                }
            }
        }
        System.out.println("I got it correct!! Yay!");
    }
}
