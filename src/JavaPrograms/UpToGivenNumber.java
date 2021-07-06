package JavaPrograms;

import java.util.*;

//Write a program that outputs the numbers from 1 to n. The user should give the value of n where n > 0.

public class UpToGivenNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int counter = 1, x = s.nextInt();
        while (counter <= x){
            System.out.println(counter);
            counter += 1;
        }
    }
}
