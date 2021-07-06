package JavaPrograms;

import java.util.*;

/* Write a program that reads numbers and outputs if they are greater than x (excluding the 0 at the end).
Program will stop when 0 is given. The user will first input the number x.
 */

public class GreaterThanGivenNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt() , num = s.nextInt();
        while (num != 0){
            if (num>x)
                System.out.println(num);
            num = s.nextInt();
        }

    }
}
