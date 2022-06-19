package USACOPrograms;
/*
Emma and the rest of her friends totaling N (2 <= N <= 5,000) have gone for a party. For the people-only part of the dance, two people are chosen as the "Star of the Party". DJ records the X,Y coordinates (0 <= X_i <= 10,000; 0 <= Y_i <= 10,000) of everyone in the dance floor and asks you to determine the indices of the two persons who are farthest apart(which are guaranteed to be unique). The standard cartesian distance is calculated as the square root of the sum of the squares of the row and column coordinate differences.

In a dance with seven people:

 8 | . . . . . . . . . .
 7 | C . . . . . . . . .
 6 | . . . . . . C . . .
 5 | . . C . . . . . . .
 4 | . . . . . . . . . .
 3 | . . C . . . . . . .
 2 | . . . . C C . . C .
 1 | . . . . . . . . . .
 0 +--------------------
   0 1 2 3 4 5 6 7 8 9 10
DJ hopes you would choose the people at 1,7 and 9,2 as farthest apart.

INPUT FORMAT

* Line 1: A single integer: N

* Lines 2..N+1: Line i+1 contains the integer coordinate location of person i: X_i and Y_i

OUTPUT FORMAT

* Line 1: Two sorted integers that are the indices of the two people that are located farthest apart.

SAMPLE INPUT

7
3 5
1 7
5 2
3 3
6 2
9 2
7 6
SAMPLE OUTPUT

2 6
Person #2 and Person #6 are the person numbers of the people from the example in the text.
 */
import java.util.*;
public class DanceParty{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double largest = 0, distance;
        int p1 = 0, p2 = 0;
        int[] people = new int[2*n];
        for (int i = 0; i < 2*n; i ++)
            people[i] = scan.nextInt();
        for (int i = 0; i < 2*n; i += 2){
            for (int z = i+2; z < 2*n; z += 2){
                distance = Math.pow(people[i]-people[z], 2.0) + Math.pow(people[i+1] - people[z+1], 2.0);
                if (distance > largest){
                    largest = distance;
                    p1 = i/2 + 1;
                    p2 = z/2 + 1;
                }
            }
        }
        System.out.print(p1 + " " + p2);
    }
}
