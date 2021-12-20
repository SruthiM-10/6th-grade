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

        //Solution 1
        int n = scan.nextInt(), number;
        int[] counterArray = new int[1001];
        for (int i = 0; i < n; i ++){
            number = scan.nextInt();
            counterArray[number] ++;
        }
        for (int i = 0; i < 1001; i ++){
            if (counterArray[i] > 1)
                System.out.println(i);
        }

        //Solution 2
        int n2 = scan.nextInt(), counter;
        int[] numbers = new int[n2];
        for (int i = 0; i < n2; i ++){ numbers[i] = scan.nextInt(); }
        for (int num = 1; num < 1001; num ++){
            counter = 0;
            for(int i = 0; i < n2; i ++){
                if (numbers[i] == num)
                    counter ++;
            }
            if (counter > 1)
                System.out.println(num);
        }

        //Solution 3
        int[] array = new int[N];
        int[] outputArray = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        int l = 0;
        for (int i = 0; i < N; i++) {
            for (int r = i + 1; r < N; r++) {
                if ((array[r] == array[i]) && (checkExists(N, outputArray, array[r]) == 0)) {
                    outputArray[l] = array[r];
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


