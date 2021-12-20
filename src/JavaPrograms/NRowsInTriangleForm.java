package JavaPrograms;

/*
Read variable N from keyboard. Make N rows starting from 1 to N in triangle form. See example for clarity.

Input: 4
Output: 1
        1 2
        1 2 3
        1 2 3 4
 */

import java.util.*;
public class NRowsInTriangleForm {
//Solution 1
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), counter = 1;
        while (counter <= n){
            for (int i = 1; i <= counter; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            counter ++;
        }
    }
//Solution 2 with nested for loops
    public static void Solution2(){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 1; i <= N; i ++){
            for (int t = 1; t <= i; t ++){
                System.out.print(t + " ");
            }
            System.out.println();
        }
    }
}
