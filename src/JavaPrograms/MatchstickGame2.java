package JavaPrograms;

import java.util.*;
public class MatchstickGame2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of matches:");
        int numOfMatches = scan.nextInt(), player = 2, check, guess;
        System.out.println("Enter the maximum amount that a player can pick:");
        int amountOfMatches = scan.nextInt();
        while(numOfMatches > 0){
            player = 3 - player;
            System.out.println("Number of remaining matches: "+ numOfMatches);
            System.out.println("Player "+player+": How many matches do you want to pick? (1.."+amountOfMatches+")");
            if (player == 1){
                for (int i = amountOfMatches; i >= 1; i -= 1){
                    check = 0;
                    if (numOfMatches - i == 0){
                        System.out.println(i);
                        numOfMatches -= i;
                        break;
                    }
                    for (int n = 1; n <= amountOfMatches; n++){
                        if (numOfMatches - i == n){
                            check = 1;
                            break;
                        }
                    }
                    if (check == 0 && numOfMatches - i > 0){
                        System.out.println(i);
                        numOfMatches -= i;
                        break;
                    }
                }
            }
            else{
                guess = scan.nextInt();
                while (guess > amountOfMatches || guess < 1 || numOfMatches - guess < 0){
                    System.out.println("Invalid move!\nYou can pick 1.."+amountOfMatches+" matches.");
                    System.out.println("Number of remaining matches: "+ numOfMatches);
                    System.out.println("Player "+player+": How many matches do you want to pick? (1.."+amountOfMatches+")");
                    guess = scan.nextInt();
                }
                numOfMatches -= guess;
            }
        }
        System.out.println("Player "+player+" won the game!");
    }
}