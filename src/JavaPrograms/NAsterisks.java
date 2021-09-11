package JavaPrograms;

/*
Read a number N, then read n numbers. Then, in each of N rows, type the amount of asterisks respectively. See example.

Input: 5
       3 6 4 0 5
Output: ***
        ******
        ****

        *****
 */
import java.util.*;
public class NAsterisks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), numberOfAsterisks;
        String string = "";
        for (int i = 1; i <= n; i ++){
            numberOfAsterisks = scan.nextInt();
            string += numberOfAsterisks;
        }
        for (int i = 0; i < n; i ++){
            char c = string.charAt(i);
            for (int a = Character.getNumericValue(c); a > 0; a -= 1 ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
