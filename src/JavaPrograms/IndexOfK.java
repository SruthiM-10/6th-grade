package JavaPrograms;

/*
Find the index of the first occurrence of a number K, or -1 if it could
not be found. You will be supplied with a list of N numbers (1 <= N <=
20000).

For example, suppose you were given the following array as input.

2 3 4 4 9 11 12

Searching for 4 should return 2, searching for 9 should return 4, and
searching for 10 should return -1.

INPUT FORMAT:

* Line 1: The integer N.

* Line 2: N sorted integers.

* Line 3: The integer K.

SAMPLE INPUT:

7
2 3 4 4 9 11 12
9

OUTPUT FORMAT:

* Line 1: The index of the first occurrence of K in the supplied array,
        or -1 if not found.

SAMPLE OUTPUT:

4

OUTPUT DETAILS:

The index of 9 is 4.
 */

import java.util.*;
public class IndexOfK {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), ans = -1;
        int[] array = new int[N];
        for (int i = 0; i < N; i ++){
            array[i] = scan.nextInt();
        }
        int K = scan.nextInt();
        for (int i = 0; i < N; i ++){
            if (array[i] == K){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
