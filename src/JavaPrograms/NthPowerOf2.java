package JavaPrograms;

import java.util.*;

//Write a program that finds the n th power of 2 where n will be given as input and n > 0.

public class NthPowerOf2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int power = 1;
        while (n != 0){
            power = power * 2;
            n -= 1;
        }
        System.out.println(power);
    }
}
