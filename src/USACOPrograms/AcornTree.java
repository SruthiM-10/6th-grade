package USACOPrograms;
/*
Harry currently has N (1≤N≤20,000) acorns, each with a height of Hi (1≤Hi≤10,000).
The total height of all his acorns added together is S.
He has found a tree that has a trunk height of B (1≤B≤S≤2,000,000,007).
In order for Harry to reach the top of the tree, he has to stack all of his acorns so that their total height is no less than the height of the trunk.
Since Harry wants to save as many acorns as possible, calculate the least number of acorns needed for Harry to reach the top of the tree.

INPUT FORMAT
Line 1: Two integers N and B separated by a space
Lines 2 - N+1: Line i+1 is a single integer of H_i

OUTPUT FORMAT
Line 1: A single integer of the fewest number of acorns needed for Harry to reach the top of the tree.

SAMPLE INPUT
5 20
5
6
3
7
11

SAMPLE OUTPUT
3

Explanation:
There are 5 acorns. The tree trunk’s height is 20. The acorns are of height 5, 6, 3, 7, and 11.
The acorns used are 7+11+3 (There may be more than one correct way).
 */
import java.util.*;
public class AcornTree{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), h = scan.nextInt(), height = 0;
        int[] acorns = new int[N];
        for (int i = 0; i < N; i ++){
            acorns[i] = scan.nextInt();
        }
        for (int i = 0; i < N - 1; i ++){
            for (int comp = 0; comp < N - 1 - i; comp ++){
                if (acorns[comp] > acorns[comp + 1]){
                    int temp = acorns[comp];
                    acorns[comp] = acorns[comp+1];
                    acorns[comp + 1] = temp;
                }
            }
        }
        for (int i = N - 1; i >= 0; i --){
            height += acorns[i];
            if (height >= h){ System.out.println(N - i); break; }
        }
    }
}
