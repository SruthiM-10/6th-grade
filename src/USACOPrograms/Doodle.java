package USACOPrograms;
/*
Lassie the cow and Millie the cow are doodling together. Lassie is drawing a doodle on a sheet of A x B sketch paper where ( 1 <= A <= 10, 1 <= B <= 10). However, Millie wants to draw a bigger doodle so the doodle has to be exactly C times bigger (1 <= C <= 10) in all directions.

The doodle will consist only of the ‘.’ and ‘X’ characters.

INPUT FORMAT

The input’s first line has A, B, and C, separated by spaces.

OUTPUT FORMAT

You need to output CA lines, each with CB characters, showing the enlarged doodle.

SAMPLE INPUT

2 3 3
XXX
X.X
SAMPLE OUTPUT

XXXXXXXXX
XXXXXXXXX
XXXXXXXXX
XXX...XXX
XXX...XXX
XXX...XXX
 */
import java.util.*;
public class Doodle{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt(), B = scan.nextInt(), C = scan.nextInt();
        String[] list;
        for (int r = 0; r < A; r ++){
            String a = scan.next();
            list = a.split("");
            for (int e = 0; e < C; e ++){
                for (int d = 0; d < B; d ++){
                    for (int i = 0; i < C; i ++) System.out.print(list[d]);
                }
                System.out.println();
            }
        }
    }
}
