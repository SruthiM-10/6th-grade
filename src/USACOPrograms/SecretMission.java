package USACOPrograms;
/*
Farmer John is being sent on a secret mission with one of his cows.
However, Farmer John has not been told which cow to bring; instead, he is given a code with the following rules:
The name of the cow (in uppercase letters) and the code should be transformed into a number,
which is the product of all the letters in the string mod 47, where “A” is 1 and “Z” is 26.
For example, BESSIE’s number would be (2 * 5 * 19 * 19 * 9 * 5) % 47 = 18.
The cow will accompany Farmer John on the mission if the cow’s number equals the code’s number.
Given the name of a cow and a code, determine if the cow should accompany Farmer John on the mission, printing “GO”
if the numbers are equal or “STAY” if they aren’t.

Examples:

Input         Output
------        ------
BESSIE         STAY
ABC

------        ------
USACO           GO
ALPHASTAR

INPUT FORMAT
* Line 1: A string consisting of only 1 to 10 uppercase characters that is the name of the cow.
* Line 2: A string consisting of only 1 to 10 uppercase characters that is the code.

OUTPUT FORMAT
* Line 1: A single line with the word “GO” if the cow should go on the mission or the word “STAY” otherwise.

SAMPLE INPUT:
BESSIE
FBHS

SAMPLE OUTPUT:
GO
 */
import java.util.*;
public class SecretMission{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine(), str2 = scan.nextLine();
        int num1 = 1, num2 = 1;
        for (int i = 0; i < str1.length(); i ++){
            num1 *= str1.charAt(i) - 'A' + 1;
            num1 %= 47;
        }
        for (int i = 0; i < str2.length(); i ++){
            num2 *= str2.charAt(i) - 'A' + 1;
            num2 %= 47;
        }
        if (num1 == num2) System.out.println("GO");
        else System.out.println("STAY");
    }
}
