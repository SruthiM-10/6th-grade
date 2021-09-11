package JavaPrograms;

// write a program that prints all two-digit numbers the can be composed of the digits: 0,1,2,3,4,5
// Output in the following order: 50,51,52,53,54,55,40,41,42,43,....,10,11,12,13,14,15

public class AllTwoDigitNumbersMadeOfTheDigits {
    public static void main(String[] args) {
        int[] digits = {0,1,2,3,4,5};
        int tensDigit = 5;
        int onesDigit = 0;
        while (tensDigit > 0){
            while (onesDigit <=5) {
                int twoDigitNumber = digits[tensDigit] * 10 + onesDigit;
                System.out.println(twoDigitNumber);
                onesDigit++;
            }
            tensDigit -= 1;
            onesDigit = 0;
        }
    }
}
