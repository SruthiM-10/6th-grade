package JavaPrograms;

/*
Write a program that finds a subsequence of a sequence of numbers such that the sum of the subsequence is maximum.
The subsequence has to be contiguous.

You will first read n then n numbers. You just need to output the sum of the subsequence.
There will be maximum 100 numbers, and each number will between -100 and 100 inclusively.

For the sample input the maximum sum subsequence is 2 2 3 1 0 3 1 0 2 -8 5 4.

For example:

Input
20
9 -7 0 11 -99 2 2 3 1 0 3 1 0 2 -8 5 4 -7 3 1

Result
15
 */

import java.util.*;
public class Subsequence{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), sum = 0, sumsIndex = 0;
        int[] sequence = new int[n];
        int[] sums = new int[(n * (n-1))/2 + n];  // n choose 2 + the subsequence consisting only one number
        for (int i = 0; i < n; i ++){ sequence[i] = scan.nextInt(); }
        for (int s = 0; s < n; s ++){
            for (int e = s; e < n; e ++){
                for(int i = s; i <= e; i++){ sum += sequence[i]; }
                sums[sumsIndex] = sum;
                sumsIndex ++;
                sum = 0;
            }
        }
        Arrays.sort(sums);
        System.out.print(sums[sums.length-1]);
    }
}
