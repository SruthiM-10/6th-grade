package JavaPrograms;

/*
Pennies in boxes is a two player board game.
The board is a sequence of N boxes. Initially, each box has some pennies.
Players take turns. In each turn, current player picks either the leftmost or the rightmost box.
The game ends when there are no remaining boxes. At the end of the game, the player who has most pennies wins the game.
If both players have the same amount of pennies then the game is tied. An example game is as follows:

Board (N = 8)        Player turn  Player move  Player 1 score  Player 2 score
-----------------    -----------  -----------  --------------  --------------
8 12 2 4 6 3 7 10        1           Right          10              0
8 12 2 4 6 3 7           2           Right          10              7
8 12 2 4 6 3             1           Left           18              7
 12 2 4 6 3              2           Left           18             19
    2 4 6 3              1           Left           20             19
      4 6 3              2           Left           20             23
        6 3              1           Left           26             23
          3              2           Right          26             26
- The game is a tie!

Task 1:
Write a two player pennies in boxes game.

Game design:
The boss initially enter the size of the board N (1<=N<=20)  and N integers each number is greater than 0.
Player 1 starts the game.
In each turn, output the board, the player in turn and their scores.
Program asks the player to enter the move. The player will enter 1 for left or 2 for right. Otherwise the program will tell the move is invalid and ask the same player to make the move again.
If there is a winner or it is a tie, the program should output the game result and stop.
Sample Input and Output:
('>' indicates the user input)

Enter the number of boxes:
>5
Enter pennies in each box:
>1 5 8 3 17

Boxes:
1 5 8 3 17
Player 1 score:0
Player 2 score:0
Enter player 1 move (1 for leftmost,2 for rightmost):
>1

Boxes:
5 8 3 17
Player 1 score:1
Player 2 score:0
Enter player 2 move (1 for leftmost,2 for rightmost):
>2

Boxes:
5 8 3
Player 1 score:1
Player 2 score:17
Enter player 1 move (1 for leftmost,2 for rightmost):
>7
Invalid move!

Enter player 1 move (1 for leftmost,2 for rightmost):
>7
Invalid move!

Enter player 1 move (1 for leftmost,2 for rightmost):
>8
Invalid move!

Enter player 1 move (1 for leftmost,2 for rightmost):
>1

Boxes:
8 3
Player 1 score:6
Player 2 score:17
Enter player 2 move (1 for leftmost,2 for rightmost):
>2

Boxes:
8
Player 1 score:6
Player 2 score:20
Enter player 1 move (1 for leftmost,2 for rightmost):
>1
Player 1 score:14
Player 2 score:20
Player 2 won!


Task 2:
In addition to Task 1, improve your program so that it will allow the players to undo their moves.
The player will enter 1 for left, 2 for right, 3 for undo.
Otherwise the program will tell the move is invalid and ask the same player to make the move again.
If the player enters 3 you need to go back the previous state.
You need to cancel the last move, update the scores and update the turn accordingly.
If there are no moves for undo, in other words if you reached the beginning of the game, there won’t be any changes when user enters 3.

Sample Input and Output:
('>' indicates the user input)

Enter the number of boxes:
>5
Enter pennies in each box:
>1 5 8 3 17

Boxes:
1 5 8 3 17
Player 1 score:0
Player 2 score:0
Enter player 1 move (1 for leftmost,2 for rightmost):
>1

Boxes:
5 8 3 17
Player 1 score:1
Player 2 score:0
Enter player 2 move (1 for leftmost,2 for rightmost):
>3

Boxes:
1 5 8 3 17
Player 1 score:0
Player 2 score:0
Enter player 1 move (1 for leftmost,2 for rightmost):
>3

Boxes:
1 5 8 3 17
Player 1 score:0
Player 2 score:0
Enter player 1 move (1 for leftmost,2 for rightmost):
>3

Boxes:
1 5 8 3 17
Player 1 score:0
Player 2 score:0
Enter player 1 move (1 for leftmost,2 for rightmost):
>5
Invalid move!

Enter player 1 move (1 for leftmost,2 for rightmost):
>6
Invalid move!

Enter player 1 move (1 for leftmost,2 for rightmost):
>3

Boxes:
1 5 8 3 17
Player 1 score:0
Player 2 score:0
Enter player 1 move (1 for leftmost,2 for rightmost):
>1

Boxes:
5 8 3 17
Player 1 score:1
Player 2 score:0
Enter player 2 move (1 for leftmost,2 for rightmost):
>1

Boxes:
8 3 17
Player 1 score:1
Player 2 score:5
Enter player 1 move (1 for leftmost,2 for rightmost):
>2

Boxes:
8 3
Player 1 score:18
Player 2 score:5
Enter player 2 move (1 for leftmost,2 for rightmost):
>1

Boxes:
3
Player 1 score:18
Player 2 score:13
Enter player 1 move (1 for leftmost,2 for rightmost):
>3

Boxes:
8 3
Player 1 score:18
Player 2 score:5
Enter player 2 move (1 for leftmost,2 for rightmost):
>3

Boxes:
8 3 17
Player 1 score:1
Player 2 score:5
Enter player 1 move (1 for leftmost,2 for rightmost):
>3

Boxes:
5 8 3 17
Player 1 score:1
Player 2 score:0
Enter player 2 move (1 for leftmost,2 for rightmost):
>3

Boxes:
1 5 8 3 17
Player 1 score:0
Player 2 score:0
Enter player 1 move (1 for leftmost,2 for rightmost):
>3

Boxes:
1 5 8 3 17
Player 1 score:0
Player 2 score:0
Enter player 1 move (1 for leftmost,2 for rightmost):
>1

Boxes:
5 8 3 17
Player 1 score:1
Player 2 score:0
Enter player 2 move (1 for leftmost,2 for rightmost):
>1

Boxes:
8 3 17
Player 1 score:1
Player 2 score:5
Enter player 1 move (1 for leftmost,2 for rightmost):
>2

Boxes:
8 3
Player 1 score:18
Player 2 score:5
Enter player 2 move (1 for leftmost,2 for rightmost):
>2

Boxes:
8
Player 1 score:18
Player 2 score:8
Enter player 1 move (1 for leftmost,2 for rightmost):
>2
Player 1 score:26
Player 2 score:8
Player 1 won!

 */
import java.util.*;
public class PenniesInBoxes{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of boxes:");
        int n = scan.nextInt(), startIndex = 0, endIndex = n-1, p1 = 0, p2 = 0, move, playerNum = 2, t = 0;
        int[] pennies = new int[n];
        int[] moves = new int[n];
        System.out.println("Enter pennies in each box:");
        for (int i = 0; i < n; i ++){
            pennies[i] = scan.nextInt();
        }
        while(startIndex <= endIndex){
            if( t == 0)
                playerNum = 1;
            else
                playerNum = 3 - playerNum;
            System.out.println();
            System.out.println("Boxes:");
            for (int i = startIndex; i <= endIndex; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("Player 1 score:" + p1 + "\n" + "Player 2 score:" + p2);
            System.out.println("Enter player "+playerNum+" move (1 for leftmost,2 for rightmost):");
            move = scan.nextInt();
            while(move > 3 || move < 1){
                System.out.println("Invalid move!" + "\n");
                System.out.println("Enter player "+playerNum+" move (1 for leftmost,2 for rightmost):");
                move = scan.nextInt();
            }
            if (move != 3){
                moves[t] = move;
                t ++; }
            if (move == 1){
                if (playerNum == 2)
                    p2 += pennies[startIndex];
                else
                    p1 += pennies[startIndex];
                startIndex ++;
            }
            else if(move == 2){
                if (playerNum == 2)
                    p2 += pennies[endIndex];
                else
                    p1 += pennies[endIndex];
                endIndex -= 1;
            }
            else if( t != 0){
                if (playerNum == 2)
                    p1 = moves(p1, moves, t, startIndex, endIndex, pennies);
                else
                    p2 = moves(p2, moves, t, startIndex, endIndex, pennies);
                startIndex = startIndex(moves, t, startIndex);
                endIndex = endIndex(moves, t, endIndex);
                moves[t-1] = 0;
                t--;
            }
        }
        System.out.println("Player 1 score:" + p1 + "\n" + "Player 2 score:" + p2);
        if (p1 > p2)
            System.out.println("Player 1 won!");
        else if(p2 > p1)
            System.out.println("Player 2 won!");
        else
            System.out.println("It is a tie!");
    }
    static int moves(int p1,int[] moves, int t, int startIndex, int endIndex, int[] pennies) {
        if (moves[t-1] == 1)
            p1 -= pennies[startIndex - 1];
        else if (moves[t -1] == 2)
            p1 = p1 - pennies[endIndex + 1];
        return p1;
    }
    static int startIndex(int[] moves, int t, int startIndex){
        if (moves[t-1] == 1)
            startIndex -= 1;
        return startIndex;
    }

    static int endIndex(int[] moves, int t, int endIndex){
        if (moves[t-1] == 2)
            endIndex += 1;
        return endIndex;
    }
}
