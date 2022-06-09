package JavaPrograms;

import java.util.*;

public class TicTacToe {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Tic-tac-toe! First to get three in a row (diagonal, row, or column) wins!");
        String[][] board = new String[3][3];
        for (int r = 0; r < 3; r ++){
            System.out.println(" ---- ---- ----");
            for (int c = 0; c < 3; c ++){
                board [r][c] = " ";
                System.out.print(" | " + board [r][c]);
            }
            System.out.println(" |");
        }
        String Player1, Player2;
        int playernum = 2;
        String[] player = new String[2];
        boolean condition = true, condition1 = true;
        while (condition){
            playernum = 3 - playernum;
            condition1 = false;
            System.out.println("Player" + playernum + ", it's now your turn!");
            System.out.println("Please enter the coordinates you want your circle/cross to be placed in! (Example: 1,2 = row 1 , column 2) ");
            if (playernum == 1){
                Player1 = scan.nextLine();
                player = Player1.split(",");
                board[Integer.parseInt(player[0]) - 1][Integer.parseInt(player[1]) - 1] = "O";
            }
            else{
                Player2 = scan.nextLine();
                player = Player2.split(",");
                board[Integer.parseInt(player[0]) - 1][Integer.parseInt(player[1]) - 1] = "X";
            }
            for (int r = 0; r < 3; r ++){
                if (board[r][0] == board [r][1] && board [r][1] == board [r][2] && board [r][0] != " ")
                        condition = false;
                if (board [0][r] == board [1][r] && board [1][r] == board [2][r] && board [0][r] != " ")
                    condition = false;
            }
            if (board [0][0] == board [1][1] && board[1][1] == board [2][2] && board [0][0] != " ")
                condition = false;
            if (board [0][2] == board [1][1] && board[1][1] == board [2][0] && board [1][1] != " ")
                condition = false;

            System.out.println();
            System.out.println("Here is the current board:");
            for (int r = 0; r < 3; r ++){
                System.out.println(" ---- ---- ----");
                for (int c = 0; c < 3; c ++){
                    System.out.print(" | " + board [r][c]);
                    if (board[r][c] == " ") condition1 = true;
                }
                System.out.println(" |");
            }
            if (!condition1) break;
        }
//        System.out.println();
//        System.out.println("Here is the current board:");
//        for (int r = 0; r < 3; r ++){
//            System.out.println(" ---- ---- ----");
//            for (int c = 0; c < 3; c ++)
//                System.out.print(" | " + board [r][c]);
//            System.out.println(" |");
//        }
        if (condition == false) System.out.println("Congratulations, Player" + playernum + "! You are the winner!");
        else if (condition1 == false) System.out.println("This game has resulted in a tie!");

    }
}
