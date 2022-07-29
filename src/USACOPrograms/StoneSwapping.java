package USACOPrograms;
/*
To pass the time, Bessie and Elsie have recently started playing a new game.
The rules of the game are as follows: Elsie takes a bunch of stones and arranges them into an N by N (1 <= N <= 10) grid.
Bessie then memorizes the grid and closes her eyes while Elsie proceeds to rearrange the stones.
Bessie then has to guess which of the following ways Elsie has rearranged the stones:

#1: The arrangement is rotated 90 degrees clockwise.

#2: The arrangement is rotated 180 degrees clockwise.

#3: The arrangement is rotated 270 degrees clockwise.

#4: The arrangement is reflected horizontally (see the sample input).

#5: The arrangement is reflected horizontally and then one of actions #1 to #3 is performed.

#6: No change.

#7: None of the above.

Help Bessie determine how Elsie has rearranged the stones.

INPUT FORMAT

The first line contains a single integer N.
The next N lines each contain a string of N characters each that are either @ or -, representing the original arrangement of the stones.
The final N lines each contain a string of N characters each that are either @ or -, representing the rearrangement of the stones.

OUTPUT FORMAT

A single line containing an integer from 1 to 7 representing the method used to rearrange the stones, as described above.
If multiple methods could have been used, output the method with the smallest number, as listed above.

SAMPLE INPUT

4
--@@
@@--
@@@-
@@-@
@@--
--@@
-@@@
@-@@
SAMPLE OUTPUT

4
The arrangement has been reflected horizontally.
 */
import java.util.*;
public class StoneSwapping{
    public static void main(String[] args){
        int ans = Solution();
        System.out.println(ans);
    }
    public static int Solution(){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String s;
        boolean flag = true;
        String[][] original = new String[N][N];
        String[][] result = new String[N][N];
        for (int r = 0; r < N; r ++){
            s = scan.next();
            original[r] = s.split("");
        }
        for (int r = 0; r < N; r ++){
            s = scan.next();
            result[r] = s.split("");
        }

        //check if it is rotated 90 degrees clockwise
        for (int r = 0; r < N; r ++) {
            for (int r2 = 0; r2 < N; r2 ++){
                if(!result[r2][N - 1 - r].equals(original[r][r2])){ flag = false; break; }
            }
            if (!flag) break;
        }
        if (flag) return 1;

        //check if it is rotated 180 degrees clockwise
        flag = true;
        for (int r = 0; r < N; r ++){
            for (int c = 0; c < N; c ++){
                if(!original[r][c].equals(result[N - 1 - r][N - 1 - c])){ flag = false; break; }
            }
            if (!flag) break;
        }
        if (flag) return 2;

        //check if it is rotated 270 degrees clockwise
        flag = true;
        for (int r = 0; r < N; r ++) {
            for (int c = 0; c < N; c ++){
                if (!original[r][c].equals(result[N - 1 - c][r])) {flag = false; break; }
            }
            if (!flag) break;
        }
        if (flag) return 3;

        //check if it is flipped horizontally
        flag = true;
        for (int r = 0; r < N; r ++){
            for (int c = 0; c < N; c ++){
                if (!original[r][c].equals(result[r][N - 1 - c])) {flag = false; break; }
            }
            if (!flag) break;
        }
        if(flag) return 4;

        //check if it is flipped horizontally then rotated 90, 180, or 270 degrees clockwise
        flag = true;
        for (int r = 0; r < N; r ++){
            for (int c = 0; c < N/2; c ++){
                String temp = original[r][N - 1 - c];
                original[r][N - 1 - c] = original[r][c];
                original[r][c] = temp;
            }
        }
        for (int r = 0; r < N; r ++) {
            for (int r2 = 0; r2 < N; r2 ++){
                if(!result[r2][N - 1 - r].equals(original[r][r2])){ flag = false; break; }
            }
            if (!flag) break;
        }
        if (flag) return 5;
        flag = true;
        for (int r = 0; r < N; r ++){
            for (int c = 0; c < N; c ++){
                if(!original[r][c].equals(result[N - 1 - r][N - 1 - c])){ flag = false; break; }
            }
            if (!flag) break;
        }
        if (flag) return 5;
        flag = true;
        for (int r = 0; r < N; r ++) {
            for (int c = 0; c < N; c ++){
                if (!original[r][c].equals(result[N - 1 - c][r])) {flag = false; break; }
            }
            if (!flag) break;
        }
        if (flag) return 3;

        //check if there is no change
        flag = true;
        for (int r = 0; r < N; r ++){
            for (int c = 0; c < N; c ++){
                if(!original[r][c].equals(result[r][c])) {flag = false; break; }
            }
        }
        if (flag) return 6;
        return 7;
    }
}
