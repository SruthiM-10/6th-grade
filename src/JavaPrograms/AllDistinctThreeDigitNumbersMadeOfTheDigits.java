package JavaPrograms;

// Find all 3 digit numbers that are composed of the digits: 0,1,2,3,4,5
// Each digit also has to be distinct. For example, 555 and 443 are not valid outputs.

public class AllDistinctThreeDigitNumbersMadeOfTheDigits {
    public static void main(String[] args) {
        for (int hundredsDigit = 1; hundredsDigit < 6; hundredsDigit ++){
            for (int tensDigit = 0; tensDigit < 6; tensDigit ++){
                while (tensDigit == hundredsDigit)
                    tensDigit ++;
                if (tensDigit == 6){
                    break;
                }
                for (int onesDigit = 0; onesDigit < 6; onesDigit ++){
                    while (onesDigit == tensDigit || onesDigit == hundredsDigit)
                        onesDigit ++;
                    if (onesDigit >= 6){
                        break;
                    }
                    int threeDigitNumber = hundredsDigit * 100 + tensDigit * 10 + onesDigit;
                    System.out.println(threeDigitNumber);
                }
            }
        }
    }
}
