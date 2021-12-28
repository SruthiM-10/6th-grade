package JavaPrograms;

/*
(Adapted from Amicable Numbers - BIO'96)

Two numbers are said to be "amicable" if they are different and the sum of the divisors of each number
(including 1 but excluding the number itself) equals the other number.

For example: 2620 is divisible by 1, 2, 4, 5, 10, 20, 131, 262, 524, 655, and 1310; these add up to 2924.
2924 is divisible by 1, 2, 4, 17, 34, 43, 68, 86, 172, 731, and 1462; these add up to 2620. Therefore 2620 and 2924 are amicable.

Find the amicable numbers between 1 and 10,000. Output each pair in one line, smaller number first then the larger number.
The output should be in increasing order.
 */
public class AmicableNumbers{
    public static void main(String[] args){
        int sum1, sum2, num2;
        for (int num1 = 1; num1 <= 10000; num1 ++){
            sum1 = 0;
            sum2 = 0;
            for (int divisor = 1; divisor <= num1 - 1; divisor ++){
                if (num1 % divisor == 0)
                    sum1 += divisor;
            }
            if (sum1 <= 10000){
                num2 = sum1;
                for (int divisor = 1; divisor <= num2 - 1; divisor ++){
                    if (num2 % divisor == 0)
                        sum2 += divisor;
                }
                if (sum2 <= 10000 && sum2 == num1 && num1 < num2) {
                    System.out.println(num1 + " " + num2);
                }
            }

        }
    }
}

