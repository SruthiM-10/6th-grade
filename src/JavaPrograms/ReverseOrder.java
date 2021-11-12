package JavaPrograms;

/*
Write a program that reads N then N numbers from the input where N<=20.
Then it writes these numbers to the screen in reverse order.
 */

import java.util.*;

public class ReverseOrder {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++){
            array[i] = scan.nextInt();
        }
        for (int i = N-1; i >= 0; i -= 1){
            System.out.println(array[i]);
        }
    }
}
