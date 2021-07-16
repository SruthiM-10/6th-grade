package JavaPrograms;

//Given a positive integer n, write a program that applies the following procedure until n becomes 1.
// If n is even, divide n by 2. Otherwise, multiply n by three and add 1 to it.

import java.util.*;
public class ConvertGivenNumberTo1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(n);
        while (n != 1){
            if (n%2 == 0){
                n = n/2;
            }
            else{
                n = 3 * n + 1;
            }
            System.out.println(n);
        }
    }
}
