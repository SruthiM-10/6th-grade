package USACOPrograms;
/*
Harry the squirrel and all his squirrel friends are gearing up for spring cleaning.
He wants to make it fun by seeing who takes the shortest time to clean their tree and who takes the longest time.
Each of the squirrels will be numbered from 1 to N (1 <= N <= 145).
The squirrels can take multiple sessions to clean their trees; the time between sessions does not count towards their total time.
All the squirrels will have their start times and end times recorded to see who is the fastest squirrel at cleaning.

The Nlines (1 <= Nlines <= 1,458) entries will be recorded into a file.
Each line will have a squirrel number C (1<= C <= N), a keyword (“START” or “STOP”), and
the time as two space-separated integers HH and MM (0 <= HH <= 23; 0 <= MM <= 59).
The squirrels will not clean past midnight (they want to have a good night’s sleep).
Every squirrel’s START entry will have a corresponding STOP entry in the input file.

Calculate the total time each squirrel spends cleaning their tree.

INPUT FORMAT

Line 1: Two space-separated integers: N and Nlines
Lines 2...Nlines+1: Each line has 4 space-separated entities: C, keyword, HH, and MM

OUTPUT FORMAT

Lines 1...N: Line i contains two space-separated integers (HH and MM) that indicates squirrel i’s total cleaning time.

SAMPLE INPUT

2 6
1 START 8 0
2 START 8 45
1 STOP 11 45
2 STOP 12 32
1 START 13 0
1 STOP 14 0
A time record file for 2 squirrels with 6 entries.
Squirrel 1 cleans from 8:00 - 11:45 and 13:00 - 14:00 for a total of 4 hours and 45 mins.
Squirrel 2 cleans from 8:45 - 12:32 for a total of 3 hours and 47 mins.

SAMPLE OUTPUT

4 45
3 47
 */
import java.util.*;
public class SpringCleaning{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt(), E = scan.nextInt();
        int[] times = new int[S];
        int[] sessions = new int[2 * S];
        int C, H, M;
        String key;
        for (int s = 0; s < E; s ++){
            C = scan.nextInt();
            key = scan.next();
            H = scan.nextInt();
            M = scan.nextInt();
            System.out.println(C + " " + key + " " + H + " " + M);
            if (key.equals("START")){
                sessions[(C - 1) * 2] = H;
                sessions[(C - 1) * 2 + 1] = M;
            }
            else if (key.equals("STOP")){
                int diff = (H - sessions[(C - 1) * 2]) * 60 + (M - sessions[(C - 1) * 2 + 1]);
                times[C - 1] += diff;
            }
        }
        for (int i = 0; i < S; i ++){
            int h = times[i] / 60;
            int m = times[i] % 60;
            System.out.println(h + " " + m);
        }
    }
}
