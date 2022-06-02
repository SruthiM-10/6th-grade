package USACOPrograms;

import java.util.*;
import java.math.*;

public class PaintedSquares{
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int N = scan.nextInt(), M = scan.nextInt(), squares = 0;
        double num;
        if (N % 2 != 0 && M % 2 != 0){
            int row = (N+1)/2-1, column = (M+1)/2-1;
            squares += 1;
            num = 2;
            while (row % 2 != 0 && column % 2 != 0){
                row = (row-1)/2;
                column = (column-1)/2;
                squares = squares + (int)Math.pow(2,num);
                num += 2;
            }
        }
        String s = Integer.toString(squares);
        System.out.println(s);
    }
}
