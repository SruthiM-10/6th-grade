package JavaPrograms;

/*
Write a program which prints the output below when 4 and 7 are given as input. The program reads two numbers; N and M from keyboard.

For example:

Input	Result
4 7     1 2 3 4 5 6 7
        2 3 4 5 6 7 8
        3 4 5 6 7 8 9
        4 5 6 7 8 9 10
 */

import java.util.*;
public class NRowsAndMColumns {
    public static void main(String[] arguments){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt(), startingNumber = 1;
        while (startingNumber <= n){
            for (int i = startingNumber; i < m; i++)
                System.out.print(i+" ");
            System.out.println(m);
            m ++;
            startingNumber ++;
        }
    }
}
