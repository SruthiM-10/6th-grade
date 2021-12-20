package JavaPrograms;

// write a program that prints all two-digit numbers the can be composed of the digits: 0,1,2,3,4,5
// Output in the following order: 50,51,52,53,54,55,40,41,42,43,....,10,11,12,13,14,15

//Solution 1 with nested while loops
public class AllTwoDigitNumbersMadeOfTheDigits {
    public static void main(String[] args) {
        int[] digits = {0, 1, 2, 3, 4, 5};
        int tensDigit = 5;
        int onesDigit = 0;
        while (tensDigit > 0) {
            while (onesDigit <= 5) {
                int twoDigitNumber = digits[tensDigit] * 10 + onesDigit;
                System.out.println(twoDigitNumber);
                onesDigit++;
            }
            tensDigit -= 1;
            onesDigit = 0;
        }
    }

// Solution 2 with nested for loops
    public static void Solution2(){
        for (int tensDigit = 5; tensDigit > 0; tensDigit--) {
            for (int onesDigit = 0; onesDigit <= 5; onesDigit++) {
                System.out.println(10 * tensDigit + onesDigit);
            }
        }
    }

// Solution 3 with for loops (not nested)
    public static void Solution3(){
        for(int number = 11; number <= 65; number += 2){
            if (number % 10 <= 6){
                System.out.println(number);
            }
        }
    }
}
