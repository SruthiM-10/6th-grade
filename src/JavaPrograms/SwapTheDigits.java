package JavaPrograms;

/*
Swap two digits of a given integer N. The user will give N first and two digit positions to swap.
Digit positions are from the right side. N has at most 9 non-zero digits. Note that you cannot use strings.

For the sample input, the output 123486759 is obtained by swapping the second and the fifth digits of 123456789 from the right.
 */

import java.util.*;
public class SwapTheDigits{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), digPos1 = scan.nextInt(), digPos2 = scan.nextInt();
        int power1 = 1, power2 = 1, testnum;
        for (int i = 1; i <= digPos1; i++){
            power1 *= 10;
        }
        testnum = N;
        testnum = testnum % power1;
        digPos1 = testnum / (power1 / 10) ;
        for (int i = 1; i <= digPos2; i++){
            power2 *= 10;
        }
        testnum = N;
        testnum = testnum % power2;
        digPos2 = testnum / (power2/10);
        N = N - (digPos1 * (power1/10)) - (digPos2 * (power2/10));
        N = N + (digPos2 * (power1/10)) + (digPos1 * (power2/10));
        System.out.println(N);
    }
}
