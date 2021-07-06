package JavaPrograms;

import java.util.*;

//Write a program that reads numbers and outputs if they are between 17 and 35 inclusively. Otherwise program stops.

public class Between17and35 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n>=17 && n<=35){
            System.out.println(n);
            n = s.nextInt();
        }
    }
}
