package USACOPrograms;
/*
It has rained for the past two days.
Bessie notices that the rain has formed some puddles on Farmer John’s field.
This field has R (1 <= R <= 100) rows and C (1 <= C <= 100) columns. She wants to count the number of puddles in the field.

Since it has not been raining very long, the puddles can be shown on a diagram of the field as either one ‘#’ symbol or two adjacent ‘#’ symbols (not including diagonals).
All parts of the field with no puddles are shown as a ‘.’ symbol.
Using a diagram of the field, help Bessie determine the number of puddles in the field.

For example, Bessie has this diagram of a field with R = 6 rows and C = 8 columns:
......#.
.#...#..
.#.....#
...##..#
#.......
.#..#.##
This field has a total of 9 puddles as shown in the picture below:

There is one on the row 1 column 7,
one on rows 2 and 3 of column 2,
one on row 2 column 6,
one on rows 3 and 4 of column 8,
one on row 4 columns 4 and 5,
one on row 5 column 1,
one on row 6 column 2,
one on row 6 column 5, and
one on row 6 columns 7 and 8.

Picture:
......1.
.2...3..
.2.....4
...55..4
6.......
.7..8.99

INPUT FORMAT
* Line 1: Two space-separated integers: R and C
* Line 2…. R + 1: Line i + 1 has C characters that are either a ‘.’ or a ‘#’, which describe the i th row of the field.

OUTPUT FORMAT
* Line 1: A single integer representing the number of puddles on the field

SAMPLE INPUT
6 8
......#.
.#...#..
.#.....#
...##..#
#.......
.#..#.##

SAMPLE OUTPUT
9
 */
import java.util.*;
public class Puddles{
    public static void main(String[] main){
        Scanner scan = new Scanner(System.in);
        int R = scan.nextInt(), C = scan.nextInt(), puddles = 0;
        scan.nextLine();
        char[][] field = new char[R][C];
        for (int r = 0; r < R; r ++){
            String row = scan.nextLine();
            for (int c = 0; c < C; c ++){
                field[r][c] = row.charAt(c);
                if (field[r][c] == '#'){
                    if (!((c-1 >= 0 && field[r][c - 1] == '#') || (r-1 >= 0 && field[r-1][c] == '#')))
                        puddles ++;
                }
            }
        }
        System.out.println(puddles);
    }
}

