package USACOPrograms;
/*
Given up to 20 possible integer values for each of the variables S,O,M,E,B,I,G,
determine how many ways values can be assigned to the variables so the expression
(O+M+O)(S+I+S+B+E+E)(E+G+O+S) evaluates to an even number.

INPUT FORMAT
* Line 1: A single integer N
* Line 2 ... N + 1: A variable and a possible value between -300 and 300 for the variable.
                    Each variable will appear between 1 and 20 times and each possible value is unique.

OUTPUT FORMAT
A single integer representing the number of ways values can be assigned to the variables so the expression yields an even answer.

SAMPLE INPUT
12
S 5
E 3
S 7
I 8
O -4
B 12
G -10
O 9
M 1
B -11
B 17
G 6

SAMPLE OUTPUT
16

Explanation:
There are 16 ways we can assign variables to yield an even result:

(S,O,M,E,B,I,G) = (5, -4, 1, 3, 12, 8, -10) -> 1,512
                = (5, 9, 1, 3, 12, 8, -10) -> 4,788
                = (5, -4, 1, 3, 12, 8, 6) -> -2,520
                = (5, 9, 1, 3, 12, 8, 6) -> 15,732
                = (7, -4, 1, 3, 12, 8, -10) -> 1,120
                = (7, 9, 1, 3, 12, 8, -10) -> 6,840
                = (7, -4, 1, 3, 12, 8, 6) -> -3,360
                = (7, 9, 1, 3, 12, 8, 6) -> 19,000
                = (5, -4, 1, 3, -11, 8, -10) -> 546
                = (5, -4, 1, 3, -11, 8, 6) -> -910
                = (7, -4, 1, 3, -11, 8, -10) -> 476
                = (7, -4, 1, 3, -11, 8, 6) -> -1,428
                = (5, -4, 1, 3, 17, 8, -10) -> 1,722
                = (5, -4, 1, 3, 17, 8, 6) -> -2,870
                = (7, -4, 1, 3, 17, 8, -10) -> 1,260
                = (7, -4, 1, 3, 17, 8, 6) -> -3,780
 */
import java.util.*;
public class MathExpression{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), ans = 0;
        int[][] parity = new int[7][2];
        for (int i = 0; i < N; i ++){
            scan.nextLine();
            String s = scan.next();
            int num = scan.nextInt();
            int x= Math.abs(num) %2;
            if (s.equals("S")) parity[0][x] ++;
            if (s.equals("O")) parity[1][x] ++;
            if (s.equals("M")) parity[2][x] ++;
            if (s.equals("E")) parity[3][x] ++;
            if (s.equals("B")) parity[4][x] ++;
            if (s.equals("I")) parity[5][x] ++;
            if (s.equals("G")) parity[6][x] ++;
        }
        for (int s = 0; s < 2; s ++){
            for (int o = 0; o < 2; o ++){
                for (int m = 0; m < 2; m ++){
                    for (int e = 0; e < 2; e ++){
                        for (int b = 0; b < 2; b++){
                            for (int i = 0; i < 2; i ++){
                                for (int g = 0; g < 2; g ++){
                                    int k = (o + m + o) * (s + i + s + b + e + e) * (e + g + o + s);
                                    if (k % 2 == 0) ans += parity[0][s] * parity[1][o] * parity[2][m] *
                                            parity[3][e] * parity[4][b] * parity[5][i] * parity[6][g];
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
