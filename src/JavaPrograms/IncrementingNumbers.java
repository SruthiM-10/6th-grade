package JavaPrograms;

import java.util.*;

// Write a program that outputs numbers starting from x + 1 to x + 100 where x is given.

public class IncrementingNumbers {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int counter = 1;
        while (counter <= 100){
            System.out.println(x+counter);
            counter += 1;
        }
    }
}
