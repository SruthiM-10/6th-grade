package JavaPrograms;

// Reverse the given number.
// For example, if 2341 is inputted, the output should be 1432. The output is one integer.

import java.util.*;
public class ReverseNum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(), digit, reverseNum = 0;
        while (num != 0){
            digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num = num/10;
        }
        /*  Another Solution is:

        int num = scan.nextInt(), counter = 10, digit, power = 1, reverseNum = 0, previousDigit = 0;
         while (power < num){
             power *= 10;
         }
         int power2 = power;
         power /= 10;
         while (counter <= power2){
             digit = num % counter - previousDigit;
             while (digit>10)
                 digit /= 10;
             reverseNum += digit * power;
             power /= 10;
             previousDigit = num % counter;
             counter *= 10;
         }
         */
        System.out.println(reverseNum);
    }
}
