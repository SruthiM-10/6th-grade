package USACOPrograms;
/*
Harry the squirrel is storing N (N <= 1000) acorns for winter.
He likes his acorns to be similar in size, so he will not include two acorns if their size difference is more than X
This means that he will keep them if the difference is equal to X.
Given X, calculate the maximum number of acorns that Harry can store in his nest.

INPUT FORMAT:
The first line of the input file contains N and X (0 <= X <= 10,000).
The next N lines each contain an integer giving the size of one of the acorns.
All sizes are positive and not bigger than 10,000.

OUTPUT FORMAT
Output a single positive integer that indicates the maximum number of acorns that Harry will have in his nest for winter.

SAMPLE INPUT
6 2
2
6
3
4
1
4

SAMPLE OUTPUT
4

Explanation:
Harry can store at most 4 acorns with the sizes 2, 3, 4, 4. In this case notice that the size difference is at most 2.
 */
import java.util.*;
public class Acorns{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int maxDiff = scan.nextInt(), maxAcorns, largest = 0;
        int[] sizes = new int[N];
        for (int i = 0; i < N; i ++){
            sizes[i] = scan.nextInt();
        }
        Arrays.sort(sizes);
        for (int mini = 0; mini < N; mini ++){
            maxAcorns = 0;
            for (int i = mini; i < N; i ++){
                if (sizes[i] - sizes[mini] <= maxDiff)
                    maxAcorns ++;
            }
            if (maxAcorns > largest) largest = maxAcorns;
        }
        System.out.println(largest);
    }
}

