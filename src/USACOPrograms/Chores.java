package USACOPrograms;

/*
Farmer John wants to pick some of his N (1 <= N <= 2,300) cows to do chores. To pick cows, he has a list with L (1 <= L <= 10) integers ranging from 1 to N. To apply this list, he lines up the cows in a circle, starting from cow 1, selects the L_1th cow, and removes it from the circle (so it can start doing chores). Then, starting at the next cow, he counts for L_2 cows to choose the next cow. This list is also circular, so Farmer John will wrap around to the beginning of the cow circle or the list if he reaches the end. He repeats this process until there is only one cow remaining. Determine which cow is not chosen.

For example, say there are 8 cows and the list is {5, 3}.

Starting at cow 1, Farmer John counts 5 cows and chooses cow 5 and removes it from the circle.
Then he counts 3 more cows and chooses cow 8.
He then wraps back to the beginning of the list and counts 5 cows, choosing cow 6 because cow 5 has been removed from the circle.
Then he counts 3 cows to eliminate cow 2, counts 5 cows to eliminate cow 3,
Counts 3 cows to eliminate cow 1 and finally counts 5 cows to eliminate cow 4. Cow 7 is the last remaining cow and thus doesn't have to do chores.

INPUT FORMAT

* Line 1: Two space-separated integers: N and L

* Line 2: L space-separated integers in the range 1...N that make up the list

OUTPUT FORMAT

* Line 1: A single integer that is the number of the cow remaining

SAMPLE INPUT

8 2
5 3
SAMPLE OUTPUT

7
 */
import java.util.*;
public class Chores{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int L = scan.nextInt(), pos = 0, i = 0, l;
        int[] cowCircle = new int[N];
        int[] list = new int[L];
        for (int x = 0; x < L; x ++){ list[x] = scan.nextInt(); }
        for (int y = 1; y <= N; y ++){ cowCircle[y-1] = y; }
        for (int v = 0; v < N-1; v ++){
            l = list[i];
            for(int u = 0; u < l-1; ){
                pos ++;
                pos %= N;
                if (cowCircle[pos] != 0) u ++;
            }
            cowCircle[pos] = 0;
            i ++;
            i %= L;
        }
        for (int w = 0; w < cowCircle.length; w ++){ if(cowCircle[w] != 0) System.out.println(cowCircle[w]); }
    }
    public static void Solution2() {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int L = scan.nextInt(), pos = -1, i = 0, l, count;
        int[] cowCircle = new int[N];
        int[] list = new int[L];
        for (int x = 0; x < L; x ++){ list[x] = scan.nextInt(); }
        for (int y = 1; y <= N; y ++){ cowCircle[y-1] = y; }
        while (N > 1) {
            count = 0;
            l = list[i];
            while (count < l){
                for (int z = pos+1; z < cowCircle.length; z ++){
                    if (cowCircle[z] != 0) count ++;
                    pos = z;
                    if (count == l) break;
                }
                if (count < l) pos = -1;
            }
            cowCircle[pos] = 0;
            N--;
            i ++;
            if (i > L - 1) i = 0;
        }
        for (int w = 0; w < cowCircle.length; w ++){ if(cowCircle[w] != 0) System.out.println(cowCircle[w]); }
    }
}