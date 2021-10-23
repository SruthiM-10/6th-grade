package USACOPrograms;

/*
You are given an integer A and a digit B (0≤A≤45,1≤B≤9).
Determine the smallest integer E in the range A<E≤62 such that the first digit of 2E is B.

For example:

         E         2^E    First digit of 2^E
        ---        ---    ------------------
         2          4            4
         3          8            8
         4         16            1
         5         32            3
         6         64            6      <-- matches B
INPUT FORMAT
The only line in the input contains two space-separated integers A and B
OUTPUT FORMAT
A single integer E as described in the problem. If no such E exists, print 0
SAMPLE INPUT
1 6
SAMPLE OUTPUT
6
 */

import java.util.*;
import java.lang.*;
public class PowersOf2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt(), B = scan.nextInt();
        long powerOf2, firstDigit;
        for (int E = A + 1; E <= 62; E++){
            powerOf2 = (long)Math.pow(2,E);
            while (powerOf2 >= 10){
                powerOf2 /= 10;
            }
            firstDigit = powerOf2;
            if (firstDigit == B){
                System.out.println(E);
                break;
            }
            else if ((E + 1) == (63))
                System.out.println("0");
        }
    }
}
