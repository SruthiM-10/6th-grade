package ACSL;

/*
PROBLEM: Given string data input representing a mathematical expression, determine the
possible location(s) of the missing parenthesis. Although we show spaces between characters for
readability, the input strings will have no spaces. All operands will be single digits.

Given ( 2 + 3 * 6 + 1. A right parenthesis is missing. It could be correctly placed in several
locations:
( 2 + 3 ) * 6 + 1 Location 5
( 2 + 3 * 6 ) + 1 Location 7
( 2 + 3 * 6 + 1 ) Location 9

INPUT: There will be five lines of input. Each line will contain a string of characters with no
spaces representing a mathematical expression. Each expression will have either a single left or
right parenthesis. The operators used will be: +, −, * and /.

OUTPUT: For each line of input, list all the locations in that expression where the missing left
or right parenthesis can be correctly placed. Note: single digits are never enclosed.

SAMPLE INPUT               SAMPLE OUTPUT

1. ( 2 + 3 * 6 + 1         1. 5, 7, 9
2. 2 – 5 * ( 6 + 1         2. 9
3. 5 + 5 – 2 ) * 5         3. 1, 3
4. 3 * 5 + ( 8 / 4 * 2     4. 9, 11
5. 2 + 8 / 4 * 5 )         5. 1, 3, 5
 */

import java.util.*;

public class ParenthesisPlacement {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i ++) Program();
    }
    public static void Program(){
        Scanner scan = new Scanner(System.in);
        String expression = scan.nextLine(), output = "", direction = "";
        int parenthesis2Index = 0, I = 0;
        for (int i = 0; i < expression.length(); i ++){
            if (expression.charAt(i) == ')') { I = i - 3; parenthesis2Index = 0; direction = "left"; }
            if (expression.charAt(i) == '(') { parenthesis2Index = i + 4; direction = "right"; }
        }
        while (parenthesis2Index <= expression.length() && direction.equals("right")) {
            output += (parenthesis2Index + 1) + ",";
            parenthesis2Index += 2;
        }
        while (parenthesis2Index <= I  && direction.equals("left")){
            output += (parenthesis2Index + 1) + ",";
            parenthesis2Index += 2;
        }
        for (int i = 0; i < output.length()-1; i ++){ System.out.print(output.charAt(i)); }
        System.out.println();
    }
}
