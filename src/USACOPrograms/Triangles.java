package USACOPrograms;
/*
Farmer John wants to generate a triangle with N (1 <= N <= 20) rows and a first number S (1 <= S <= 9).
Examples of this triangle are:

 N=6, S=4                   N=7, S=8

4 5 7 1 5 1               8 9 2 5 9 5 2
  6 8 2 6 2                 1 3 6 1 6 3
    9 3 7 3                   4 7 2 7 4
      4 8 4                     8 3 8 5
        9 5                       4 9 6
          6                         1 7
                                      8

Determine the rule used to generate the triangles above, and then output a triangle for a given N and S.
There is no whitespace at the beginning of a triangle.

INPUT FORMAT
A line containing two space-separated integers N and S

OUTPUT FORMAT
The triangle generated from the given inputs

SAMPLE INPUT
8 2

SAMPLE OUTPUT
2 3 5 8 3 8 5 3
  4 6 9 4 9 6 4
    7 1 5 1 7 5
      2 6 2 8 6
        7 3 9 7
          4 1 8
            2 9
              1
 */
import java.util.*;
public class Triangles{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), S = scan.nextInt();
        int[][] num = new int[N][N];
        for (int c = 0; c <= N; c ++){
            for (int r = 0; r <= c; r ++){
                num[r][c] = S;
                S ++;
                if (S == 10) S = 1;
            }
        }
        for (int r = 0; r < N; r ++){
            for (int c = 0; c < N; c ++){
                if (num[r][c] == 0) System.out.print(" ");
                else System.out.print(num[r][c] + " ");
            }
            System.out.println();
        }
    }
    public static void Solution2(){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), S = scan.nextInt();
        int size = N * (N + 1) / 2;
        int[] num = new int[size];
        for (int i = 0; i < size; i ++){
            num[i] = S;
            S ++;
            if (S == 10) S = 1;
        }
        int c = 0, counter;
        for (int i = N; i > 0; i --){
            counter = c;
            for (int b = N - i + 1; b <= N; b ++){
                System.out.print(num[counter] + " ");
                counter += b;
            }
            c += N - i + 2;
            System.out.println();
            for (int b = 0; b < N - (i - 1); b ++) System.out.print("  ");
        }
    }
}
