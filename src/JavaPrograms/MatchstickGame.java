package JavaPrograms;

import java.util.*;
public class MatchstickGame{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int player = 2, guess;
        System.out.println("Enter the number of matches:");
        int numOfMatches = scan.nextInt();
        System.out.println("Enter draw value 1 for draw, 0 for not draw:");
        int d = scan.nextInt();
        while (numOfMatches > 0){
            System.out.println("Number of remaining matches: "+ numOfMatches);
            if (d == 1){
                for (int i = 1; i <= numOfMatches; i++)
                    System.out.print("* ");
                for (int i = 1; i <= 4; i++){
                    System.out.println();
                    for (int n = 1; n <= numOfMatches; n++)
                        System.out.print("| ");
                }
                System.out.println();
            }
            player = player%2 + 1;
            System.out.println("Player " + player + ": How many matches do you want to pick? (1,2 or 3)");
            guess = scan.nextInt();
            while (guess > 3 || guess < 1 || numOfMatches - guess < 0){
                System.out.println("Invalid move!\nYou can pick 1, 2 or 3 matches.");
                System.out.println("Number of remaining matches: "+ numOfMatches);
                if (d == 1){
                    for (int i = 1; i <= numOfMatches; i++)
                        System.out.print("* ");
                    for (int i = 1; i <= 4; i++){
                        System.out.println();
                        for (int n = 1; n <= numOfMatches; n++)
                            System.out.print("| ");
                    }
                    System.out.println();
                }
                System.out.println("Player " + player + ": How many matches do you want to pick? (1,2 or 3)");
                guess = scan.nextInt();
            }
            numOfMatches -= guess;
        }
        System.out.println("Player "+player+" won the game!");
    }
}