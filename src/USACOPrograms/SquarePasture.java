package USACOPrograms;

/*
Square Pasture
==============

Farmer John has decided to update his farm to simplify its geometry.
Previously, his cows grazed in two rectangular fenced-in pastures.
Farmer John would like to replace these with a single square
fenced-in pasture of minimum size that still covers all the regions
of his farm that were previously enclosed by the former two fences.

Please help Farmer John figure out the minimum area he needs to make
his new square pasture so that if he places it appropriately, it can
still cover all the area formerly covered by the two older
rectangular pastures. The square pasture should have its sides
parallel to the x and y axes.

PROBLEM NAME: square

INPUT FORMAT:

The first line in the input file specifies one of the original
rectangular pastures with four space-separated integers x1 y1 x2 y2,
each in the range 0...10. The lower-left corner of the pasture is at
the point (x1,y1), and the upper-right corner is at the point
(x2,y2), where x2>x1 and y2>y1.

The second line of input has the same 4-integer format as the first
line, and specifies the second original rectangular pasture. This
pasture will not overlap or touch the first pasture.

OUTPUT FORMAT:

The output should consist of one line containing the minimum area
required of a square pasture that would cover all the regions
originally enclosed by the two rectangular pastures.

SAMPLE INPUT:

6 6 8 8
1 8 4 9

SAMPLE OUTPUT:

49

In the example above, the first original rectangle has corners (6,6)
and (8,8). The second has corners at (1,8) and (4,9). By drawing a
square fence of side length 7 with corners (1,6) and (8,13), the
original areas can still be enclosed; moreover, this is the best
possible, since it is impossible to enclose the original areas with a
square of side length only 6. Note that there are several different
possible valid placements for the square of side length 7, as it
could have been shifted vertically a bit.
 */

import java.util.*;
public class SquarePasture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1_1 = scan.nextInt(), y1_1 = scan.nextInt(), x2_1 = scan.nextInt(), y2_1 = scan.nextInt();
        int x1_2 = scan.nextInt(), y1_2 = scan.nextInt(), x2_2 = scan.nextInt(), y2_2 = scan.nextInt();
        int x1_3 = Math.min(x1_1,x1_2), x2_3 = Math.max(x2_1,x2_2);
        int y1_3 = Math.min(y1_1, y1_2), y2_3 = Math.max(y2_1,y2_2);
        int height = x2_3 - x1_3, width = y2_3 - y1_3;
        if (height >= width)
            System.out.println(height*height);
        else
            System.out.println(width*width);
    }
}
