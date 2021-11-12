package ACSL;

/*
PROBLEM: ACSL Ninety-Nine is a two-player card game played with a deck of 40-cards. The cards are labeled 0 – 9.
To start, each player gets 3 cards and the remaining cards are placed face down on the table (the pile).
In an actual game the point total is set to zero but for this program an initial point total will be given.
Cards are played in the order they are added to a player’s hand.
Each player in turn puts down a card and changes the point total according to the point value of his card.
Then, they select a card from the top of the pile.
Each card adds its face value in points (e.g. a 5 is worth five points) to the point total.
However, there are certain cards that have special values or meanings:
           - A 9 is a pass (and does not change point total)
           - A 4 subtracts 10 points from the total
           - A 0 adds either 1 or 11 to the point total.
                    - The 11 is played first as long as it does not put the point total over 99.
If a player plays a card that puts the total over 99, that player loses the game.

INPUT:  There will be 5 lines of input.  Each line will contain 11 integers.
The first integer gives the initial point total. The next 3 integers will represent the 3 cards dealt to the player.
The remaining integers will be, in order, the card picked by the player and the card played by the dealer.

OUTPUT:  For each line of input, print the point total when the game ends and who won (player or dealer).
We guarantee the data will always produce a winner.

In Sample Input #1, the point total is set equal to 87.
The player uses the first card dealt (5) and adds it to the point total (now 92).
The player adds the 7 to his hand.  The dealer plays the 4.  The point total is now 82.
The player plays the next card dealt (an 8) and the point total is 90.  The player adds a 6 to his hand.
The dealer plays the 3.  The point total is now 93.  The player plays his 9 but the point total does not change.
The player adds a 9 to his hand.  The dealer plays the last 0 and the point total is 94.
The player plays the 7 he picked up after his first turn.  The point total is now 101.
The player loses and the dealer wins.  If cards are still available at the end of the line, they are not used.

SAMPLE INPUT						                SAMPLE OUTPUT

1.  87, 5, 8, 9, 7, 4, 6, 3, 9, 0, 2				1.  101, dealer
2.  78, 2, 4, 8, 3, 8, 5, 0, 6, 9, 8				2.  100, dealer
3.  85, 7, 9, 7, 6, 5, 9, 4, 5, 0, 1				3.  101, dealer
4.  84, 8, 4, 2, 7, 9, 0, 1, 9, 8, 3				4.  100, dealer
5.  95, 9, 0, 9, 0, 1, 0, 1, 0, 2, 5				5.  100, player
 */

import java.util.*;
public class Game99 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 5; i ++) {
            String input = scan.nextLine(), player = "player";
            String[] Line = input.split(", ");
            int pointTotal = Integer.parseInt(Line[0]), x = 1, y = 5;
            while (pointTotal <= 99) {
                if (player.equals("player")) {
                    pointTotal = specialCards(Integer.parseInt(Line[x]), pointTotal);
                    x += 1;
                    player = "dealer";
                }
                else{
                    if (y < 11)
                        pointTotal = specialCards(Integer.parseInt(Line[y]), pointTotal);
                    y += 2;
                    player = "player";
                }
            }
            System.out.println(pointTotal + ", " + player);
        }
    }
    public static int specialCards(int valueOfCard, int pointTotal){
        int total;
        if(valueOfCard == 4)
            total = pointTotal- 10;
        else if (valueOfCard == 0){
            if (pointTotal + 11 <= 99)
                total = pointTotal + 11;
            else
                total = pointTotal + 1;
        }
        else if (valueOfCard == 9)
            total = pointTotal;
        else
            total = pointTotal + valueOfCard;
        return total;
    }
}
