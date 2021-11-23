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
        int n = scan.nextInt(), number;
        int[] nNumbers = new int[n];
        for (int i = 0; i < n; i ++){
            nNumbers[i] = scan.nextInt();
        }
        //Solution 1 using the Array method sort
        Arrays.sort(nNumbers);
        System.out.println(Arrays.toString(nNumbers));

        //Solution 2 without nested loops and using the strategy inverse indexing
        int[] counterArray = new int[1001];
        for (int i = 0; i < n; i ++){
            number = scan.nextInt();
            counterArray[number] ++;
        }
        for (int i = 0; i < 1001; i ++){
            while (counterArray[i] > 0){
                System.out.println(i);
                counterArray[i] -= 1;
            }
        }
    }
}
