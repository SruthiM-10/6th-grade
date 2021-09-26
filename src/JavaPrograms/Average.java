package JavaPrograms;

import java.util.*;
public class Average{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(), prevnum1 = num, prevnum2 = 0, counter = 1;
        while (num != 0){
            if (counter == 1){
                counter = 3;
            }
            else if (counter == 3){
                prevnum2 = num;
                counter = 2;
            }
            else{
                prevnum1 = prevnum2;
                prevnum2 = num;
            }
            num = scan.nextInt();
        }
        System.out.println((double)(prevnum1 + prevnum2)/2);
    }
}
