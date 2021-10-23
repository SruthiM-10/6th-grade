package USACOPrograms;

/*
Bessie hangs this bracelet on the wall at a point N units (1≤N≤L−1) from the left of the bracelet.
For all intents and purposes, gravity pulls both sides of the bracelet perfectly downwards.
Each of the tokens dangles vertically downwards off of the attachment point to the bracelet.

Bessie has an open bracelet of length L (1≤L≤32768). On this bracelet are C special tokens (1≤C≤512).
Each of these tokens dangles on a string of length Si, off a point on the bracelet Pi units from the left (1≤Si≤25, 0≤Pi≤L).

Determine how far each token hangs from the attachment point (top of the bracelet where it is being hung).

Sample Bracelet:

                        1 1 1 1 1 1 1
    0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6
    +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
            |         |             |
            |         |             |
            |         |             *
            *         |
                      |
                      |
                      *
Sample Bracelet being hung at position 5:

Hang   Bracelet         Bracelet
dist.  location         location
  0      5         +        5    <---- nail is here
  1      4        + +       6
  2      3      | + +       7
  3      2      | + +       8              D
  4      1      | + +       9              O
  5      0      * + + |    10              W
  6                 + |    11              N
  7                 + |    12              |
  8                 + |    13              |
  9                 + |    14              V
 10                 + |    15
 11                 + *    16
 12                     |
 13                     |
 14                     *
INPUT FORMAT
Line 1: The three space-separated integers L, C, and N, in that order.
Lines 2..C+1: Line i+1 describes the i-th token with two space-separated integers: Si and Pi
OUTPUT FORMAT
Lines 1..C: Line i contains the total hanging distance from the attachment point to the i-th special token.
SAMPLE INPUT
16 3 5
4 4
7 9
3 16
SAMPLE OUTPUT
5
11
14
 */

import java.util.*;
public class DroopingDown {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int LengthOfBracelet = scan.nextInt(), NumberOfTokens =scan.nextInt(),PositionOfNail = scan.nextInt();
        for (int i = 1; i <= NumberOfTokens; i++){
            int S = scan.nextInt(), P = scan.nextInt();
            if (P < PositionOfNail){
                int T = (PositionOfNail - P) + S;
                System.out.println(T);
            }
            else{
                int T = (P - PositionOfNail) + S;
                System.out.println(T);
            }
        }
    }
}