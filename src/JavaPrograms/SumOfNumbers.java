package JavaPrograms;

import java.util.*;

//Write a program that finds the sum of n numbers given. The user should enter n, then the numbers from keyboard.

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),sum = 0;
        do{
            int kNum = s.nextInt();
            sum = sum + kNum;
            n -= 1;
        } while (n != 0);
        System.out.println(sum);
    }
}