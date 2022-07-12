package USACOPrograms;
/*
Like all detectives, Sherlock likes to solve crossword puzzles.
His sister Enola, unfortunately, spilled milk all over his crossword book, smearing the text and making it difficult for him to see where each clue begins.
It's up to you to assist Sherlock and retrieve the clue numbering!

An unlabeled crossword is given to you as an N by M grid (3 <= N <= 50, 3 <= M <= 50).
Some cells will be clear (typically colored white) and some cells will be blocked (typically colored black).
Given this layout, clue numbering is a simple process which follows two logical steps:

Step 1: We determine if each cell begins with a horizontal or vertical clue.
If a cell begins a horizontal clue:
- it must be clear,
- its neighboring cell to the left must be blocked or outside the crossword grid
- the two cells on its right must be clear (that is, a horizontal clue can only represent a word of 3 or more characters).

The rules for a cell beginning a vertical clue are analogous:
- the cell above must be blocked or outside the grid, and the two cells below must be clear.

Step 2: We assign a number to each cell that begins a clue.
Cells are assigned numbers sequentially starting with 1 in the same order that you would read a book;
cells in the top row are assigned numbers from left to right, then the second row, etc.
Only cells beginning a clue are assigned numbers.
For example, consider the grid, where '.' indicates a clear cell and '#' a blocked cell.
...
#..
...
..#
.##

Cells that can begin a horizontal or vertical clue are marked with !below:
!!!
#..
!..
..#
.##

We get the following results if we assign numbers to these cells:
123
#..
4..
..#
.##

It's worth noting that the crossword described in the input data might not meet the constraints found in published crosswords.
Some clear cells, for example, may not be part of any clue.

INPUT FORMAT
N and M are separated by a space on the first line of input.
The following N lines of input each describe a grid row.
Each cell has M characters: either a '.' (clear cell) or a '#' (blocked cell).

OUTPUT FORMAT
Print the number of clues on the first line of output.
Print the row and column indicating the position of a single clue on each remaining line (ordered as described above).
Position of the top left cell  is (1, 1).

SAMPLE INPUT
5 3
...
#..
...
..#
.##

SAMPLE OUTPUT
4
1 1
1 2
1 3
3 1

 */
import java.util.*;
public class Crossword{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), M = scan.nextInt(), count = 0;
        scan.nextLine();
        char[][] crossword = new char[N][M];
        for (int r = 0; r < N; r ++){
            String s = scan.nextLine();
            for (int c = 0; c < M; c ++){
                crossword[r][c] = s.charAt(c);
            }
        }
        for (int r = 0; r < N; r ++){
            for (int c = 0; c < M; c ++){
                if (crossword[r][c]  == '.'){
                    if (((c - 1 < 0 || crossword[r][c - 1] == '#') && c + 2 < M) && crossword[r][c + 1] == '.' && crossword[r][c + 2] == '.'){
                        crossword[r][c] = '!';
                        count ++;
                    }
                    else if ((r - 1 < 0 || crossword[r-1][c] == '#') && r + 2 < N && crossword[r+1][c] == '.' && crossword[r+2][c] == '.'){
                        crossword[r][c] = '!';
                        count ++;
                    }
                }
            }
        }
        System.out.println(count);
        for (int r = 0; r < N; r ++){
            for (int c = 0; c < M; c ++){
                int r_2 = r + 1;
                int c_2 = c + 1;
                if (crossword[r][c] == '!') System.out.println(r_2 + " " + c_2 );
            }
        }
    }
}


