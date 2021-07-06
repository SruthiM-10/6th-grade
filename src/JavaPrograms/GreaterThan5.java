package JavaPrograms;

import java.util.*;

// Write a program that reads numbers and outputs if they are greater than 5. Program will stop when 0 is given.

public class GreaterThan5 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        while (num != 0){
            if (num>5)
                System.out.println(num);
            num = s.nextInt();
        }

    }
}
