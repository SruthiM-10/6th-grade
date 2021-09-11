package JavaPrograms;

//Find all prime numbers less than the given number.

import java.util.*;
import java.lang.*;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String prime = "true";
        for (int i = 2; i < num; i++){
            for (int n = 2; n < i; n++){
                if (i % n == 0) {
                    prime = "false";
                    break;
                }
            }
            if (prime.equals("true"))
                System.out.println(i);
            else
                prime = "true";
        }
        if (num <= 2){
            System.out.println("none");
        }
    }
}