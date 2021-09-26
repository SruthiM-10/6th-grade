package JavaPrograms;

import java.util.*;
public class Average{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = 0, prevnum1, prevnum2 = 0;
        do{
            prevnum1 = prevnum2;
            prevnum2 = num;
            num = scan.nextInt();
        }while (num != 0);
        System.out.println((double)(prevnum1 + prevnum2)/2);
        System.out.println(prevnum1 + " " + prevnum2);
    }
}
