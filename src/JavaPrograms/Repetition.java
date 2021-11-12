package JavaPrograms;

/*
Write a program that reads n < 100 then read n numbers each of which is between 1 and 1000 inclusively.
Then, your program will find the numbers that exist more than once and write them on the screen.
 */

import java.util.*;
public class Repetition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] array = new int[N];
        int[] outputArray = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        int l = 0;
        for (int i = 0; i < N; i++) {
            for (int n = i + 1; n < N; n++) {
                if ((array[n] == array[i]) && (checkExists(N, outputArray, array[n]) == 0)) {
                    outputArray[l] = array[n];
                    l++;
                }
            }
        }
        for (int j : outputArray) {
            if (j != 0)
                System.out.print(j + " ");
        }
    }

    static int checkExists(int N, int[] outputArray, int n) {
        int check = 0;
        for (int k = 0; k < N; k++) {
            if (outputArray[k] == n) {
                check = 1;
                break;
            }
        }
        return check;
    }
}
