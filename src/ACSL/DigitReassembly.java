package ACSL;

/*
PROBLEM: Given a number less than 1050, answer various questions about the number.

INPUT: There will be 5 lines of input. Each will contain a positive integer less than 10^50.

OUTPUT: For each line of input, answer the corresponding question below:

1. For Input Line #1, how many digits are in the number?
2. For Input Line #2, what is the sum of all of the digits in the number?
3. For Input Line #3, what is the sum of the digits at the odd locations
(the leftmost digit is Location #1)?
4. For Input Line #4, how many times does the digit 4 appear?
5. For Input Line #5, what is the middle digit? (If the length of the number, N, is even,
find the N/2 number (again, the leftmost digit is the 1st one).

SAMPLE INPUT (http://www.datafiles.acsl.org/2019/contest1/jr-sample-input.txt):
1325678945
987654
456160
143295823976154
123456

SAMPLE OUTPUT:
1. 10
2. 39
3. 16
4. 2
5. 3
 */

import java.util.*;
public class DigitReassembly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //question 1
        long num1 = scan.nextLong();
        int lengthOfNum = Long.toString(num1).length();
        System.out.println("There are " + lengthOfNum + " digits in the number.");

        //question 2
        long num2 =  scan.nextLong(), sum = 0, digit;
        while (num2 > 0){
            digit = num2%10;
            sum += digit;
            num2/=10;
        }
        System.out.println(sum);

        //question 3
        long num3 = scan.nextLong();
        int sum1 = 0, digit1, count1 = 1;
        while (num3 > 0){
            digit1 = (int) (num3%(Math.pow(10,(Long.toString(num3).length()-count1))));
            count1++;
            if (count1%2 == 0)
                sum1 += digit1;
            num3/=10;
        }
        System.out.println(sum1);

        //question 4
        int num4 = scan.nextInt(), count = 0;
        String Num4 = String.valueOf(num4);
        for (int i = 0; i < Num4.length(); i ++){
            if (Num4.charAt(i) == '4')
                count++;
        }
        System.out.println(count);

        //question 5
        int num5 = scan.nextInt(), midnum;
        String Num5 = Integer.toString(num5);
        if (Num5.length()%2 == 0)
            midnum = Num5.charAt(Num5.length()/2);
        else
            midnum = Num5.charAt(Num5.length()/2 - 1);
        System.out.println(midnum);
    }
}
