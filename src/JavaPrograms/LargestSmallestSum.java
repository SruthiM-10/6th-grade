package JavaPrograms;

/*
Find the largest, the smallest and the sum of the given integers (excluding the 0 at the end). Your program should stop when 0 is given. There are at most 100 numbers, each of which is in the interval [-100, 100] inclusively.

In the example below, 12 is the largest, 1 is the smallest and 41 is the sum of the numbers.

For example:
Input
12 4 5 1 6 5 8 0

Result
12 1 41
 */

import java.util.*;
public class LargestSmallestSum{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(), largest = 0, smallest = num, sum = 0;
        while(num != 0){
            if (num > largest)
                largest = num;
            if (num < smallest)
                smallest = num;
            sum += num;
            num = scan.nextInt();
        }
        System.out.println(largest + " " + smallest + " " + sum);
    }
}
