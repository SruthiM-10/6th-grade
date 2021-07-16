package JavaPrograms;

// Write a program that outputs the sum of the squares of the given numbers. The program stops when 0 is entered.

import java.util.*;
public class SumOfTheSquares {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sumOfTheSquares = 0;
        while (num != 0){
            sumOfTheSquares += num * num;
            num = scan.nextInt();
        }
        System.out.println(sumOfTheSquares);
    }
}
