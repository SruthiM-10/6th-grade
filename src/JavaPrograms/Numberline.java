package JavaPrograms;

/*
Read N then N numbers (N <= 200) from the input and put them into an array.
Then write the numbers out again, but with all the negative numbers moved to the front in the same order.
 */

import java.util.*;
public class Numberline {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), ans = -1;
        int[] array = new int[N];
        for (int i = 0; i < N; i ++){
            array[i] = scan.nextInt();
            if (array[i] < 0)
                System.out.print(array[i] + " ");
        }
        for (int i = 0; i < N; i ++){
            if (array[i] > 0)
                System.out.print(array[i] + " ");
        }
    }
}
