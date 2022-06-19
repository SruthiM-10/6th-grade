package USACOPrograms;
/*
Bessie the cow wants to paint a wall that is composed of N×M (1≤N,M≤1,000,000,000) squares. However, she only wants to paint certain squares on the wall.

Bessie has a very particular way to determine which squares she is going to paint. She paints the center square in the wall; if there is no center square, she stops painting. Then she divides up the wall by using the row and column of the painted center square to separate the wall into four equally sized smaller walls. Then she paints the center squares of each of the smaller walls as before. She keeps painting until there is no center square to paint or the field cannot be divided up any further.

For example, if N=7 and M=23, then Bessie will paint the square at row 4, column 12. Then she divides the wall into four 3x11 fields and paints the square at row 2, column 6, further dividing the wall into 1x5 fields. Then she paints the square at row 1, column 3 in each of the 1x5 fields. The resulting 1x2 walls have no center squares, so the process stops here. This process is depicted below, with P denoting a painted square.

.......................    .....................
.......................    .....................
.......................    .....................
....................... -> ...........P......... ->
.......................    .....................
.......................    .....................
.......................    .....................

...........|...........    ..P..|..P..|..P..|..P..
.....P.....|.....P.....    -----P-----|-----P-----
...........|...........    ..P..|..P..|..P..|..P..
-----------P----------- -> -----------P-----------
...........|...........    ..P..|..P..|..P..|..P..
.....P.....|.....P.....    -----P-----|-----P-----
...........|...........    ..P..|..P..|..P..|..P..
Bessie ends up painting 21 squares on this wall. Determine how many squares on the wall Bessie the cow is going to paint.

INPUT FORMAT

* Line 1: Two space-separated integers: N and M

OUTPUT FORMAT

* Line 1: The number of painted squares.

SAMPLE INPUT

7 23
SAMPLE OUTPUT

21
 */
import java.util.*;
public class WallPainting{
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int N = scan.nextInt(), M = scan.nextInt(), squares = 0;
        double num = 1;
        if (N % 2 != 0 && M % 2 != 0){
            int row = (N+1)/2 - 1, column = (M+1)/2 - 1;
            squares += 1;
            while (row % 2 != 0 && column % 2 != 0){
                row = (row-1)/2;
                column = (column-1)/2;
                squares = squares + (int)Math.pow(4,num);
                num += 1;
            }
        }
        String s = Integer.toString(squares);
        System.out.println(s);
    }
}
