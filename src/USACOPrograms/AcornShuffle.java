package USACOPrograms;
/*
Harry the squirrel wants to perform a party trick of shuffling his acorns.
He wants the other forest animals to guess the acorns’ original positions after the shuffles.
He will have N (1 <= N <= 100) acorns and shuffle them 3 times in a row.
The initial position of the acorns will be marked as position 1, position 2, position 3...etc. for the first acorn, second acorn, third acorn, etc. up to N.

When a shuffle is performed, the acorns will be moved from their previous position (i) to the new position (a_i).
Each i is in range (1...N). All acorns will move to the new position after a shuffle. There are no overlapping new positions.
For example, two acorns will not be moved to the same position.

Each acorn has a unique 7-digit ID number.
Given the new position of each acorn after 3 shuffles, calculate the acorns’ original position.

INPUT FORMAT
Line 1: N (number of acorns)
Line 2: N integers of the acorns’ positions (a1, a2,..aN);
        For example, the acorn at that index would move to the position given at that index in the next shuffle,
        If the input was {4, 1, 2, 3}, the acorn at index 0/position 1 would become the fourth acorn/index 3 in the next shuffle
Line 3: The acorns’ positions after 3 shuffles have been performed, followed by their ID numbers.

OUTPUT FORMAT
N lines consisting of the acorns’ ID number per line. Each line represents the position of the acorns.
For example, the first line is position 1.

SAMPLE INPUT
4
4 2 1 3
3725622 4710563 3982712 5482619

SAMPLE OUTPUT
3725622
4710563
3982712
5482619

Explanation:

The output after each shuffle:

original positions        : 3725622    4710563    3982712    5482619    => expected output
after the first shuffle   : 3982712    4710563    5482619    3725622
after the second shuffle  : 5482619    4710563    3725622    3982712
after the third shuffle   : 3725622    4710563    3982712    5482619    => the given input
 */
import java.util.*;
public class AcornShuffle{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] pos = new int[N];
        int[] ID = new int[N];
        int[] Initial_ID = new int[N];
        for (int i = 0; i < N; i ++) pos[i] = scan.nextInt();
        for (int i = 0; i < N; i ++) ID[i] = scan.nextInt();
        for (int i = 0; i < 3; i ++){
            for (int a = 0; a < N; a ++){
                Initial_ID[a] = ID[pos[a] - 1];
            }
            System.arraycopy(Initial_ID, 0, ID, 0, N);
        }
        for (int i = 0; i < N; i++) System.out.println(Initial_ID[i]);
    }
}
