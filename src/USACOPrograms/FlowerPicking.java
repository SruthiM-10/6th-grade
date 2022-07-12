package USACOPrograms;
/*
Bessie wants to pick some flowers along Farmer John’s farm.
The farm can be viewed like a number line, with N (1 <= N <= 50000) flowers at positions x1,x2,…xN (−100,000≤xi≤100,000) with Farmer John’s barn at the origin x = 0.
No two flowers are the same distance away from the barn.
Bessie will pick flowers until Farmer John calls her back to the barn, which will happen in T (1≤T≤1,000,000,000) minutes.
Bessie travels one unit of distance every minute.
To choose which flowers to pick, Bessie starts at the barn, and always picks the flower closest to the barn.
This is because she thinks that the flowers closest to the barn are the most beautiful.
Figure out how many flowers Bessie will pick before she returns to the barn.

INPUT FORMAT
* Line 1: Two space-separated integers: T and N
* Lines 2...N + 1: Line i + 1 contains one integer xi representing the location of the ith flower

OUTPUT FORMAT
* Line 1: The number of flowers Bessie will pick

SAMPLE INPUT
30 8
-6
-2
7
14
-17
-5
3
18

SAMPLE OUTPUT
5

Explanation:
Bessie has 30 minutes until Farmer John calls her back to the barn.
There are 8 flowers at positions: -6, -2, 7, 14, -17, -5, 3, 18.
Bessie picks the flowers at positions -2, 3, -5, -6, and 7, which takes her 29 minutes.
If she were to pick another flower at position 14, it would take a total of 36 minutes, which would be too long.
 */
import java.util.*;
public class FlowerPicking{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt(), N = scan.nextInt(), pos, flower = 0;
        int t = 0;
        int[] flowers = new int[N + 1];
        flowers[0] = 0;
        for (int i = 1; i <= N; i ++){
            flowers[i] = scan.nextInt();
        }
        pos = flowers[0];
        int smallest;
        for (int a = 1; a <= N; a ++){
            smallest = a;
            for (int i = a + 1; i <= N; i ++){
                if (Math.abs(flowers[i]) < Math.abs(flowers[smallest])){
                    smallest = i;
                }
            }
            t += Math.abs(flowers[smallest] - pos);
            pos = flowers[smallest];
            flower ++;
            if (t == T) break;
            if (t > T){ flower --; break; }
            int temp = flowers[a];
            flowers[a] = flowers[smallest];
            flowers[smallest] = temp;
        }
        System.out.println(flower);
    }
}