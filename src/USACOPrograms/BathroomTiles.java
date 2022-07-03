package USACOPrograms;
/*
Sam has removed square tiles that are of integer side-lengths from his bathroom.
Sometimes Sam is tired, and he doesn't remove a tile properly, resulting in 0-sided tile squares.
He has placed all the tiles that he removed into a pile in the corner of the room.

Sam’s sister, May, wants the tiles for her own bathroom.
May decides to carry exactly four tiles to her bathroom and cut them into 1x1 sections in order to fit them to her bathroom.
Her bathroom is made up of N (1 <= N <= 10,000) unit-square sections.

May wants to know how many different ways she can choose four tiles to fit into her bathroom.
If she has a bathroom of size 16, she might carry the tiles in these five different ways:
(2, 2, 2, 2), (4, 0, 0 ,0), (0, 4, 0, 0), (0, 0, 4, 0), (0, 0, 0, 4).
The order of the tiles matters, so (1, 2, 3, 4) is a different way of choosing that (4, 3, 2, 1).

INPUT FORMAT: Line 1: A single integer: N

OUTPUT FORMAT: Line 1: A single integer that is the number of different ways May can choose four tile sections for her bathroom

SAMPLE INPUT: 16
SAMPLE OUTPUT: 5
 */
import java.util.*;
public class BathroomTiles{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), count = 0;
        for (int a = 0; a <= Math.sqrt(N); a ++){
            for (int b = 0; b <= Math.sqrt(N); b ++){
                for (int c = 0; c <= Math.sqrt(N); c ++){
                    int d = (int)(Math.sqrt(N - a*a - b*b - c*c));
                    if (a*a + b*b + c*c + d*d == N) count ++;
                }
            }
        }
        System.out.println(count);
    }
}
