package JavaPrograms;

/*
Given four integers, check if the sum of any three equals to the remaining one. If there are more than one solutions, output only one of them.
The order of the numbers in the output has to be same as in the input. If there are no solutions, output nothing.
 */

import java.util.*;
public class SumOfThree{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt(), num4 = scan.nextInt();
        if (num1 + num2 + num3 == num4)
            System.out.println(num1+" + "+num2+" + "+num3+" = "+num4);
        else if (num1 + num2 + num4 == num3)
            System.out.println(num1+" + "+num2+" + "+num4+" = "+num3);
        else if (num1 + num3 + num4 == num2)
            System.out.println(num1+" + "+num3+" + "+num4+" = "+num2);
        else if (num4 + num2 + num3 == num1)
            System.out.println(num2+" + "+num3+" + "+num4+" = "+num1);
    }
}
