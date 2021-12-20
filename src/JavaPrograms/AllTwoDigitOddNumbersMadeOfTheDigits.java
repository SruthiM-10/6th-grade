package JavaPrograms;

//write a program that prints all two-digit odd numbers composed of the digits: 0,1,2,3,4,5,6

public class AllTwoDigitOddNumbersMadeOfTheDigits {

//Solution 1 with nested while loops
    public static void main(String[] args) {
        int[] digits = {0, 1, 2, 3, 4, 5, 6};
        int tensDigit = 1;
        int onesDigit = 1;
        while (tensDigit <= 6) {
            while (onesDigit <= 6) {
                int twoDigitNumber = digits[tensDigit] * 10 + onesDigit;
                System.out.println(twoDigitNumber);
                onesDigit += 2;
            }
            tensDigit += 1;
            onesDigit = 1;
        }
    }

//Solution 2 with nested for loops
    public static void Solution2(){
        for(int tensDigit = 1; tensDigit <= 6; tensDigit ++){
            for(int onesDigit = 1; onesDigit < 7; onesDigit += 2){
                System.out.println(10*tensDigit + onesDigit);
            }
        }
    }
}

