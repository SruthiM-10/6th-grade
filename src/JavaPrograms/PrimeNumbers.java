package JavaPrograms;

//Find all prime numbers less than the given number.

import java.util.*;
public class PrimeNumbers{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), prime = 0;
        for (int num = 2; num < N; num ++){
            for (int primeTest = 2; primeTest < num; primeTest ++) {
                if (num % primeTest == 0){
                    prime = 1;
                    break;
                }
            }
            if (prime == 0)
                System.out.print(num + " ");
            prime = 0;
        }
        if (N <= 2)
            System.out.print("none");
    }
}