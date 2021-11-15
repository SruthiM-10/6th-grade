package JavaPrograms;

/*
Write a program that reads n < 100
It will read n numbers that may or may not be distinct, each of which is between 1 and 1000 inclusively.
Then, the program will output the numbers sorted from smallest to largest.
 */

import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nNumbers = new int[n];
        for (int i = 0; i < n; i ++){
            nNumbers[i] = scan.nextInt();
        }
        Arrays.sort(nNumbers);
        System.out.println(Arrays.toString(nNumbers));
    }
}
