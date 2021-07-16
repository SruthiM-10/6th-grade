package JavaPrograms;

/* Write a program that outputs the sum of the first 5 numbers and the last number (the number before 0).
The program terminates when the input is 0 (it is guaranteed that there are at least 5 numbers).
 */

import java.util.*;
public class SumOfFirst5AndLast {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sumOfFirst5Numbers = 0,num = scan.nextInt(),counterForSum = 0,lastNum;
        do{
            if (counterForSum < 5){
                sumOfFirst5Numbers = sumOfFirst5Numbers + num;
            }
            lastNum = num;
            num = scan.nextInt();
            counterForSum++;
        }while (num != 0);
        System.out.println(sumOfFirst5Numbers + lastNum);

    }
}
