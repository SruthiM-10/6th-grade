package JavaPrograms;

/*
Write a program that reads n numbers (n <= 20) from the keyboard and puts them in an array.
Then, add all the numbers in the array, and output the sum. First, the user inputs n from the keyboard then the numbers.
 */

import java.util.*;
public class SumOfAllNumbersInArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), sum = 0;
        int[] array = new int[N];
        for (int i = 0; i < N; i ++){
            array[i] = scan.nextInt();
            sum += array[i];
        }
        System.out.println(sum);
    }
}
