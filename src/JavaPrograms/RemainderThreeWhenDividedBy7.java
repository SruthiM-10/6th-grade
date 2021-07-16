package JavaPrograms;

//Write a program that outputs only the numbers that have remainder 3 when divided by 7. The program stops when 0 is entered.

import java.util.*;
public class RemainderThreeWhenDividedBy7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        while (num != 0){
            if (num%7 == 3)
                System.out.println(num);
            num = scan.nextInt();
        }
    }
}
