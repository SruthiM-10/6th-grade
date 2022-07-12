package USACOPrograms;
/*
The cows enjoy mooing at the barn because their moos echo back, although sometimes not completely. Bessie, ever the excellent
secretary, has been recording the exact wording of the moo as it goes out and returns.
She is curious as to just how much overlap there is.

You are given two lines of input (letters from the set a..z, total length in the range 1..80).
Each has the wording of a moo on it.
Determine the greatest number of characters of overlap between one string and the other.
A string is an overlap between two other strings if it is a prefix of one string and a suffix of the otherstring.

By way of example, consider two moos:
     moyooyoxyzooo
     yzoooqyasdfljkamo

The last part of the first string overlaps 'yzooo' with the first part of the second string.
The last part of the second string overlaps 'mo' with the first part of the first string.
The largest overlap is 'yzooo' whose length is 5.

PROBLEM NAME: echo

INPUT FORMAT:
* Lines 1..2: Each line has the text of a moo or its echo

SAMPLE INPUT:
abcxxxxabcxabcd
abcdxabcxxxxabcx

OUTPUT FORMAT:
* Line 1: A single line with a single integer that is the length of
        the longest overlap between the front of one string and end of
        the other.

SAMPLE OUTPUT:
11

OUTPUT DETAILS:
'abcxxxxabcx' is a prefix of the first string and a suffix of the second
string.
 */
import java.util.*;
public class Echo{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine(), s2 = scan.nextLine();
        int length, largest = 0;
        for (int i = 1; i < s1.length(); i ++){
            length = 0;
            for (int b = 0; b < s2.length() - 1; b ++){
                if (i + b < s1.length() && s2.charAt(b) == s1.charAt(i + b)){
                    length ++;
                }
                else if(length > largest){
                    largest = length;
                    break;
                }
            }
        }
        int largest_2 = Integer.MIN_VALUE;
        for (int i = 1; i < s2.length(); i ++){
            length = 0;
            for (int b = 0; b < s1.length() - 1; b ++){
                if (i + b < s2.length() && s1.charAt(b) == s2.charAt(i + b)){
                    length ++;
                }
                else if(length > largest_2){
                    largest_2 = length;
                    break;
                }
            }
        }
        largest = Math.max(largest_2, largest);
        System.out.println(largest);
    }
}