package JavaPrograms;

/*
Write a program that reads numbers from the input, and outputs the number in the middle.
The program stops when the user enters 0.
It is guaranteed that the user inputs odd number of numbers, and there are at most 21 numbers (including 0).
 */

import java.util.*;

public class MiddleNumber{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(), counter = 1;
        int[] array = new int[21];
        array[0] = num;
        for (int i = 1; num != 0; i ++){
            num = scan.nextInt();
            array[i] = num;
            counter ++;
        }
        System.out.println(array[counter/2]);
    }
}
