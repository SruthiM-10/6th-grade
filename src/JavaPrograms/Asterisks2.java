package JavaPrograms;
import java.util.*;

/*
Write a program for each case that reads a number n from the keyboard and prints the demanded shape of asterisks as shown below.
Note that you CANNOT use nested loops, strings or character arrays.

For example:

Input	Result
5       8
*       *
**      **
***     ***
**      ****
*       ****
        ***
        **
        *


 */

public class Asterisks2{
//Solution 1
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), counter = 0, asterisks = 0, midnumber = n / 2;
        while(counter < midnumber){
            if (asterisks <= counter) {
                System.out.print("*");
                asterisks ++;
            }
            else {
                asterisks = 0;
                System.out.println();
                counter++;
            }
        }
        counter = 0;
        asterisks = 0;
        if (n % 2 == 0) midnumber --;
        while(counter <= midnumber){
            if(asterisks <= midnumber - counter) {
                System.out.print("*");
                asterisks ++;
            }
            else{
                asterisks = 0;
                System.out.println();
                counter ++;
            }
        }
    }
//Solution2
    public static void Solution2() {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), counter = 1, asterisks = 1, prevAsterisks = 1;
        double midnumber, n = N + 0.0;
            if(n % 2 == 0) midnumber = n/2;
            else midnumber = n/2 + 0.5;
            while(counter <= n){
            if(asterisks <= counter && counter < midnumber){
            System.out.print("*");
                asterisks ++;
            }
            else if ((counter == midnumber || (counter == midnumber + 1 && midnumber == n / 2)) && asterisks <= midnumber){
                System.out.print("*");
                asterisks ++;
            }
            else if(counter > midnumber && asterisks <= prevAsterisks - 1){
                System.out.print("*");
                asterisks ++;
            }
            else {
                prevAsterisks = asterisks - 1;
                asterisks = 1;
                System.out.println();
                counter++;
            }
        }
    }
}