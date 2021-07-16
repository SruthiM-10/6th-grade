package JavaPrograms;

//Write a program that outputs the sum of the first 5 numbers.
// The program terminates when the input is 0 (it is guaranteed that there are at least 5 numbers).

import java.util.*;
public class SumOfFirst5Numbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        for (int i = 1; i < 6; i++){
            if (num != 0){
                sum += num;
                num = scan.nextInt();
            }
        }
        while (num != 0){
            num = scan.nextInt();
        }
        System.out.println(sum);
    }
}
