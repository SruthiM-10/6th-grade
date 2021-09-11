package JavaPrograms;

/*
Write a program that reads two numbers: N and M.
Then, your program will print a figure on the screen with N number of rows and M number of columns. See the example below:

Sample Input: 3 4
Sample output: 1 1 1 1
               2 2 2 2
               3 3 3 3
 */
import java.util.*;
public class NAndM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt();
        for (int i = 1; i <= n; i++){
            for (int i2 = 1; i2 <= m; i2 ++ ){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
