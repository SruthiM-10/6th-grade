package JavaPrograms;

import java.util.*;
public class MatchstickGame{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int playerNum = 1;
        int playerNumChosen;
        System.out.println("Enter the number of matches: ");
        int nOfMatches = scan.nextInt();
        System.out.println("Enter draw value 1 for draw, 0 for not draw:");
        int drawYesOrNo = scan.nextInt();
        System.out.println("Number of remaining matches: "+ nOfMatches);
        if (drawYesOrNo == 1){
            for (int c = 1; c<nOfMatches+1; c++){
                System.out.print("* ");
            }
            System.out.println();
            for (int a = 1; a<5; a++){
                for (int b = 1; b<nOfMatches+1; b++){
                    System.out.print("| ");
                }
                System.out.println();
            }
        }
        while (nOfMatches > 0){
            System.out.println("Player "+playerNum+": How many matches do you want to pick? (1,2 or 3)");
            playerNumChosen = scan.nextInt();
            while ((nOfMatches - playerNumChosen)<0 || (playerNumChosen<1 || playerNumChosen>3)){
                System.out.println("Invalid move!");
                System.out.println("You can pick 1, 2 or 3 matches.");
                System.out.println("Number of remaining matches: "+ nOfMatches);
                if (drawYesOrNo == 1){
                    for (int c = 1; c<nOfMatches+1; c++){
                        System.out.print("* ");
                    }
                    System.out.println();
                    for (int a = 1; a<5; a++){
                        for (int b = 1; b<nOfMatches+1; b++){
                            System.out.print("| ");
                        }
                        System.out.println();
                    }
                }
                System.out.println("Player " + playerNum + ": How many matches do you want to pick? (1,2 or 3)");
                playerNumChosen = scan.nextInt();
            }
            nOfMatches -= playerNumChosen;
            if (nOfMatches == 0){
                System.out.println("Player "+playerNum+" won the game!");
                break;
            }
            if (playerNum == 1)
                playerNum += 1;
            else
                playerNum = 1;
            System.out.println("Number of remaining matches: "+ nOfMatches);
            if (drawYesOrNo == 1){
                for (int c = 1; c<nOfMatches+1; c++){
                    System.out.print("* ");
                }
                System.out.println();
                for (int a = 1; a<5; a++){
                    for (int b = 1; b<nOfMatches+1; b++){
                        System.out.print("| ");
                    }
                    System.out.println();
                }
            }
        }
    }
}

