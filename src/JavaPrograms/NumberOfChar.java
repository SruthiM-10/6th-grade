package JavaPrograms;

import java.util.*;

/* Given a string "aaabbbcc", compress it, = "a3b3c2" .
Given that output string's length is always smaller than input string, you have do it inplace. No extra space.
 */

public class NumberOfChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a string: ");
        String inputString = scan.nextLine();
        String outputString = "";
        int count = 0;
        for (int i = 0; i < inputString.length(); i++ ){
            if (i != 0 && inputString.charAt(i-1) != inputString.charAt(i)){
                outputString += inputString.charAt(i-1) + Integer.toString(count);
                count = 1;
            }
            else
                count++;
            if(i+1 == inputString.length())
                outputString += inputString.charAt(i) + Integer.toString(count);
        }
        System.out.println(outputString);
    }
}
