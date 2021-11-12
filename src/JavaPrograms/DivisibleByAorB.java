package JavaPrograms;

/*
Read N then N numbers (N <= 20) from the input and put them into an array.
Then read A and B and write the numbers in the array that are divisible by A or B in the same order.
 */

import java.util.*;
public class DivisibleByAorB{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i ++){
            array[i] = scan.nextInt();
        }
        int A = scan.nextInt(), B = scan.nextInt();
        for (int i = 0; i < N; i ++){
            if ((array[i] % A == 0) || (array[i] % B == 0))
                System.out.println(array[i]);
        }
    }
}
