package JavaPrograms;

/*
Write a program that outputs the intersection of two sets of sizes n < 100 and m < 100.
Each number is between -1000 and 1000 inclusively.
Read n, then read n numbers. Read m, then read m numbers.
 */

import java.util.*;
public class Intersection {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nNumbers = new int[n];
        ArrayList<Integer> outputArray = new ArrayList<Integer>();
        for (int i = 0; i < n; i ++){
            nNumbers[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        int[] mNumbers = new int[m];
        for (int i = 0; i < m; i ++){
            mNumbers[i] = scan.nextInt();
        }
        for( int i = 0; i < m; i ++){
            for (int l  = 0; l < n; l ++){
                if (nNumbers[l] == mNumbers[i] && !outputArray.contains(mNumbers[l]))
                    outputArray.add(mNumbers[l]);
            }
        }
        System.out.println(outputArray);
    }
}
