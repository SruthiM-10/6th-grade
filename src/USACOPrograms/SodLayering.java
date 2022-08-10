package USACOPrograms;
/*
Topher the mole has dug holes in Harry the squirrel’s field.
Harry wants to cover his field with a new layer of grass sod to make his field even.
Because there are trees and shrubs in his field,
he will have to overlap some of his grass sod to both completely cover all available surfaces and avoid the obstacles.
Harry demands that Topher do the actual layering and wants to know exactly how many squares of his field is covered by the sod.
The rectangles are described by giving its lower left and upper right x, y coordinates.

The field is divided into squares whose sides are parallel to the x and y axes.
The field has X width and Y height (1 <= X <= 240; 1 <= Y <= 240).
Each sod-layering action taken by Topher is defined as A (1 <= A <= 200);
it is comprised of four integers: x_ll, y_ll, x_ur, and y_ur (1 <= x_ll <= x_ur; x_ll <= x_ur <= X; 1 <= y_ll <= y_ur; y_ll <= y_ur <= Y),
which are the lower left and upper right coordinates of the rectangle to be covered.
Topher will layer sod all over the field’s squares in the range (x_ll..x_ur, y_ll..y_ur) which might be one more row and column that might be initially assumed.

Consider a field that is 7 squares wide and 5 squares high. As Harry issues a pair of sod layering instructions (shown),
the field a new layer of sod as shown by '*' and '#' ('#' is used only for clarity, in order to show the newest layer of sod-all sod layers are the same):

    .......             .......             .......
    .......             .**....             ######.
    .......  (2,1)(3,4) .**....  (1,3)(6,4) ######.
    .......             .**....             .**....
    .......             .**....             .**....
A total of 16 squares are plowed.

INPUT FORMAT

Line 1: X, Y, and A (all separated by a space)
Lines 2...A+1: Line a+1 contains sod layering instruction a which is described by four integers: x_ll, y_ll, x_ur, and y_ur

OUTPUT FORMAT

Line 1: A single integer of the total number of squares covered by sod

SAMPLE INPUT

7 5 2
2 1 3 4
1 3 6 4
SAMPLE OUTPUT

16
 */
import java.util.*;
public class SodLayering{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt(), Y = scan.nextInt(), A = scan.nextInt();
        int x, y, x1, y1, ans = 0;
        int[][] field = new int[Y][X];
        for (int i = 0; i < A; i ++){
            x = scan.nextInt();
            y = scan.nextInt();
            x1 = scan.nextInt();
            y1 = scan.nextInt();
            for (int r = y; r <= y1; r ++){
                for (int c = x; c <= x1; c ++){
                    if (field[Y - r][c - 1] != 1) ans ++;
                    field[Y - r][c - 1] = 1;
                }
            }
        }
        System.out.println(ans);
    }
}