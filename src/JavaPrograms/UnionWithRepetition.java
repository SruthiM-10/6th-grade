package JavaPrograms;

/*
Write a program that gives a sorted output of numbers given in two sorted arrays in ascending order of sizes n < 100 and m < 100.
The numbers in the array may not be between -1000 and 1000. Read n, then n numbers; read m, then m numbers.
Write the sorted output on screen in ascending order. You cannot use nested loops.
 */

import java.util.*;
public class UnionWithRepetition{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] NArray = new int[n];
        for (int i = 0; i < n; i ++){
            NArray[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        int[] MArray = new int[m];
        for (int i = 0; i < m; i ++){
            MArray[i] = scan.nextInt();
        }
        int i1 = 0, i2 = 0;
        while (i1 < n || i2 < m){
            if (i1 < n && i2 < m){
                if (MArray[i2] < NArray[i1]){
                    System.out.print(MArray[i2] + " ");
                    i2 ++;
                }
                else if(MArray[i2] == NArray[i1]){
                    System.out.print(NArray[i1] + " " + MArray[i2] + " ");
                    i2 ++;
                    i1 ++;
                }
                else{
                    System.out.print(NArray[i1] + " ");
                    i1 ++;
                }
            }
            else if(i1 < n && i2 >= m){
                System.out.print(NArray[i1] + " ");
                i1 ++;
            }
            else{
                System.out.print(MArray[i2] + " ");
                i2 ++;
            }
        }
    }
}
