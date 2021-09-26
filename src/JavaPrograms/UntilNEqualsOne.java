package JavaPrograms;

/*
Given two positive integers N and M (1 < N, M < 1000).
Implement the following process: if N is divisible by M, divide N by M otherwise increase N by 1.
Continue the process until N reaches 1. Output the numbers in the sequence.
 */

import java.util.*;
public class UntilNEqualsOne {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), M = scan.nextInt();
        while (N > 1){
            System.out.print(N + " ");
            if (N % M == 0)
                N = N/M;
            else
                N ++;
        }
        System.out.println("1");
    }
}
