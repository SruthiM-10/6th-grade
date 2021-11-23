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

        //Solution 1
        int[] nNumbers = new int[n];
        ArrayList<Integer> outputArray = new ArrayList<>();
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

        //Solution 2 without nested loops and using the strategy inverse indexing
        int number;
        int[] NcounterArray = new int[2001];
        int[] McounterArray = new int[2001];
        for (int i = 0; i < n; i ++){
            number = scan.nextInt();
            number += 1000;
            NcounterArray[number] ++;
        }
        int m2 = scan.nextInt();
        for (int i = 0; i < m2; i ++){
            number = scan.nextInt();
            number += 1000;
            McounterArray[number] ++;
        }
        for (int i = 0; i < 2001; i ++){
            if ((McounterArray[i] > 0) && (NcounterArray[i] > 0))
                System.out.print(i - 1000 + " ");
        }
    }
}
