package USACOPrograms;
/*
Farmer John recently started noticing that his cows have been playing a game which they call “Horn, Grass, Shears.”
The rules of the game are as follows:
Two cows count to five and then at the same time, they make a sign that represents one of three symbols: a horn, a blade of grass, or a pair of shears.
Horn beats shears, shears beat grass, and grass beats horn.
For example, if cow 1 signs “shears” and the second cow signs “horn”, then the second cow wins. If both cows put up the same sign, they tie.

One day, Farmer John decides to watch his cows play N (1≤N≤100).
However, he cannot tell which sign the cows make represent which symbol.
Thus, he has numbered the signs 1, 2, and 3.
Given the numbered signs the cows make over the N games,help Farmer John determine the maximum number of games the first cow could have won!

INPUT FORMAT: The first line of the input contains N.
              Each of the remaining N lines contains two integers that are 1, 2, or 3, depicting a game from Farmer John’s point of view.
              The first integer represents the sign made by the first cow, and the second integer represents the sign made by the second cow.

OUTPUT FORMAT: Print the maximum number of games that the first cow could have won.

SAMPLE INPUT
6
1 2
2 3
3 3
3 2
2 1
1 3

SAMPLE OUTPUT
3

Solution: One possible solution that yields the maximum number of games won is 1 represents “horn”, 2 represents “grass”, and 3 represents “shears”.
          So, the first cow would have won the fourth, fifth, and sixth games.
 */
import java.util.*;
public class HornGrassShears{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to use arrays or if statements? Please answer: 'arrays' or 'if statements'.");
        String answer = scan.nextLine();
        if (answer.equals("arrays")) Solution2();
        else {
            int N = scan.nextInt(), win1 = 0, win2 = 0;
            for (int i = 0; i < N; i++) {
                int firstCow = scan.nextInt();
                int secondCow = scan.nextInt();
                if (firstCow != secondCow) {
                    if ((firstCow > secondCow && firstCow - secondCow != 2) || firstCow - secondCow == -2)
                        win1++;
                    else if (firstCow < secondCow || firstCow - secondCow == 2)
                        win2++;
                }
            }
            System.out.println(Math.max(win1, win2));
        }
    }
    public static void Solution2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Solution2: ");
        int N = scan.nextInt(), win1 = 0, win2 = 0;
        int[][] matches = new int[3][3];
        for (int i = 0; i < N; i ++){
            int firstCow = scan.nextInt();
            int secondCow = scan.nextInt();
            matches[firstCow - 1][secondCow - 1] ++;
        }
        win1 = matches[0][1] + matches[1][2] + matches[2][0];
        win2 = matches[0][2] + matches [2][1] + matches [1][0];
        System.out.println(Math.max(win1, win2));
    }
}