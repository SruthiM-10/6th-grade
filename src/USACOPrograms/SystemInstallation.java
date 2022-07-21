package USACOPrograms;
/*
Farmer John wants to install a new sprinkler system on his farm.
However, because new sprinkler systems are expensive, Farmer John can only afford to have new sprinklers on part of his farm.
To figure out where on his farm he will install the system,
he divides his farm up into a grid with NR (3 <= NR <= 100) rows and NC (3 <= NC <= 100) columns,
determines the number of cows graze on each square of the grid Prc,
and decides to put the new sprinklers on the 3 x 3 grid with the most cows so the grass will grow better on those squares.

Determine the 3 x 3 grid whose squares sum to the greatest number and then output its upper left corner.
If multiple grids have the same total, output the grid with the smallest row number.
The multiple grids are on the same row, output the grid with the smallest column number.

INPUT FORMAT
* Line 1: Two space-separated integers NR and NC
* Line 2 … NR + 1: NC space separated integers that depict a row of the grid

OUTPUT FORMAT
* Line 1: A single integer that is the largest total of a 3 x 3 grid.
* Line 2: Two space-separated integers that indicate the row and column of the 3 x 3 grid that Farmer John will install his sprinklers on.


SAMPLE INPUT
6 7
1 2 6 5 7 3 4
2 4 8 7 8 6 6
3 5 7 8 5 4 1
4 6 5 9 4 5 7
3 7 4 3 5 3 2
4 3 2 6 7 8 9

SAMPLE OUTPUT
61
1 3

Explanation:
Farmer John has a 6 by 7 grid.
The largest sum is 61, found in 2 (3 by 3) grids: the one on row 1 column 3, and the one on row 2 column 3.
Since the first grid has a smaller row number, Farmer John will install the sprinkler system on the grid on row 1 column 3.

 */
import java.util.*;
public class SystemInstallation{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt(), c = scan.nextInt();
        int[][] grid = new int[r][c];
        for (int i = 0; i < r; i ++){
            for (int b = 0; b < c; b ++){
                grid[i][b] = scan.nextInt();
            }
        }
        int sum, largest = Integer.MIN_VALUE;
        int r1 = 0, c1 = 0;
        for (int i = 1; i <= r - 2; i ++){
            for (int b = 1; b <= c - 2; b ++){
                sum = 0;
                for (int e = 0; e < 3; e ++){
                    for (int d = 0; d < 3; d ++){
                        sum += grid[i + e - 1][b + d - 1];
                    }
                }
                if (sum > largest){
                    largest = sum;
                    r1 = i;
                    c1 = b;
                }
            }
        }
        System.out.println(largest);
        System.out.println(r1 + " " + c1);
    }
}
