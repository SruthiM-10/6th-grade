package JavaPrograms;
import java.util.*;

/*
Write a program for each case that reads a number n from the keyboard and prints the demanded shape of asterisks as shown below.
Note that you CANNOT use nested loops, strings or character arrays.

For example:

Input	Result
5
            *
           ***
          *****
         *******
        *********

8
            *
           ***
          *****
         *******
        *********
       ***********
      *************
     ***************

 */

public class Asterisks1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), counter = 1, position  = 0;
        int numberOfIterations = (3 * n * n - n) / 2 + n - 1;
        for(int i = 1; i <= numberOfIterations; i ++){
            position ++;
            if (position <= (n - counter))
                System.out.print(" ");
            else if(position <= n - 1 + counter)
                System.out.print("*");
            else{
                position = 0;
                System.out.println();
                counter ++;
            }
        }
    }
}
