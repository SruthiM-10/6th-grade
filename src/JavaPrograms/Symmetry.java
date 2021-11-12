package JavaPrograms;

/*
Given N then N numbers (N <= 20) find if the sequence of numbers is symmetric or not. If the sequence of numbers is symmetric, write "symmetric", otherwise write "not symmetric" on the screen.

For example:

Input:
8
15 19 7 21 6 37 18 1
Result:
not symmetric

Input:
7
15 19 7 21 7 19 15
Result:
symmetric
 */

import java.util.*;
public class Symmetry{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i ++){
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < N; i ++){
            if (array[i] != array[N-1-i]){
                System.out.println("not symmetric");
                break;
            }
            else if(i == N-1)
                System.out.println("symmetric");
        }
    }
}
