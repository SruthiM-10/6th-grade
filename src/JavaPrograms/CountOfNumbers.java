package JavaPrograms;

import java.util.*;

// Write a program that finds the count of the given numbers (excluding the 0 at the end). Program will stop when 0 is given.

public class CountOfNumbers {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int count = 0;
        while (num != 0){
            count++;
            num = s.nextInt();
        }
        System.out.println(count);

    }
}
