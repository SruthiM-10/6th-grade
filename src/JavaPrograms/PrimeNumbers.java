package JavaPrograms;

//Find all prime numbers less than the given number.

import java.util.*;
import java.lang.*;
public class PrimeNumbers{
// Solution 1
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
// Solution 2 - more efficient method
    public static void Solution2 (){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.print("2 ");
        for (int num = 3; num < N; num += 2){
            boolean prime = true;
            for (int primeTest = 2; primeTest <= Math.sqrt(num); primeTest ++) {
                if (num % primeTest == 0){
                    prime = false;
                    break;
                }
            }
            if (prime) System.out.print(num + " ");
        }
        if (N <= 2) System.out.print("none");
    }
}