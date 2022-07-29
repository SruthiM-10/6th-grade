package USACOPrograms;
/*
Farmer John’s N (1 <= N <= 100) cows all need to be milked today, but Farmer John is only able to milk one cow at a time.
To try to finish quickly, he tells each of the cows to head straight to the barn right after they have finished grazing for the day so he can milk them.
Given the time of arrival for each cow and the amount of time needed to milk each of them,
determine the earliest possible time that Farmer John can finish milking all the cows.

INPUT FORMAT

The first line of the input contains a single integer N.
The next N lines contain two space-separated integers representing the time a cow finishes grazing and the amount of time needed to milk it,
both of which are positive numbers less than 1,000,000.

OUTPUT FORMAT

The earliest time that Farmer John can finish milking all the cows.

SAMPLE INPUT

4
2 3
12 8
6 7
9 2
SAMPLE OUTPUT

23
The first cow arrives for milking at time 2, and is done being milked by time 2 + 3 = 5.
Farmer John is then idle until time 6, when the third cow arrives, and is finished being milked by time 6 + 7 = 13.
Meanwhile, the second and fourth cows, who arrive at times 12 and 9, respectively, wait until the third cow is done being milked.
The fourth cow starts getting milked next, and is finished being milked by time 13 + 2 = 15.
Finally, the second cow gets milked, and finishes getting milked by time 15 + 8 = 23.
 */
import java.util.*;
public class MilkQueue{
    static class Cows{
        int start;
        int time;
    }
    static class compA implements Comparator<Cows>{
        public int compare(Cows a, Cows b){
            return Integer.compare(a.start, b.start);
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt(), ans = 0, pos = 0;
        Solution2();
        Cows[] times = new Cows[N];
        for (int i = 0; i < N; i ++){
            times[i] = new Cows();
            times[i].start = s.nextInt();
            times[i].time = s.nextInt();
        }
        Arrays.sort(times, new compA());
        for (int i = 0; i < N; i ++){
            if (times[i].start > pos){ ans += times[i].start - pos + times[i].time;}
            else ans += times[i].time;
            pos = ans;
        }
        System.out.println(ans);
    }
    public static void Solution2(){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt(), ans = 0, pos = 0;
        int[] start = new int[N];
        int[] times = new int[N];
        for (int i = 0; i < N; i ++){
            start[i] = s.nextInt();
            times[i] = s.nextInt();
        }
        for (int i = 0; i < N; i ++){
            int smallest = 0;
            for (int a = 0; a  < N; a ++){
                if (start[smallest] == 0 && start[a] != 0) smallest = a;
                else if (start[a] < start[smallest] && start[a] != 0) smallest = a;
            }
            if (start[smallest] > pos){ ans += start[smallest] - pos + times[smallest]; }
            else ans += times[smallest];
            start[smallest] = 0;
            pos = ans;
        }
        System.out.println(ans);
    }
}
