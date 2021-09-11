package JavaPrograms;

//write a program that prints all two-digit odd numbers composed of the digits: 0,1,2,3,4,5,6

public class AllTwoDigitOddNumbersMadeOfTheDigits {
    public static void main(String[] args) {
        int[] digits = {0, 1, 2, 3, 4, 5};
        int tensDigit = 1;
        int onesDigit = 1;
        while (tensDigit <= 5) {
            while (onesDigit <= 5) {
                if (onesDigit == tensDigit)
                    onesDigit += 2;
                int twoDigitNumber = digits[tensDigit] * 10 + onesDigit;
                System.out.println(twoDigitNumber);
                onesDigit += 2;
            }
            tensDigit += 1;
            onesDigit = 1;
        }
    }
}

