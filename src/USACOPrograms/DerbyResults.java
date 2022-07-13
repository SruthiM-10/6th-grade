package USACOPrograms;
/*
The Derby Race has concluded! The horses’ times have been posted.
There are N (1 <= N <= 5,000) horse participants.
Their race results are posted in Hours (0 <= Hours <= 99), Minutes (0 <= Minutes <= 59), and Seconds (0 <= Seconds <= 59).
Please help out the race coordinators by sorting the race results into ascending order (shortest to longest).

An example would be if there were 5 horses and below are their times:
1:12:35
1:05:41
0:58:34
1:45:23
0:49:22

The sorted times would be as follows:
0:49:22
0:58:34
1:05:41
1:12:35
1:45:23

INPUT FORMAT
Line 1: An integer N (number of horses)
Lines 2..N+1: Line i+1 contains horse_i’s times as 3 integers separated by space (Hours, Minutes, Seconds)

OUTPUT FORMAT
Lines 1-N: Each line contains 3 space-separated integers indicating each horse’s time

SAMPLE INPUT
5
1 12 35
1 5 41
0 58 34
1 45 23
0 49 22

SAMPLE OUTPUT
0 49 22
0 58 34
1 5 41
1 12 35
1 45 23
 */
import java.util.*;
public class DerbyResults{
    static class Times{
        int hrs;
        int min;
        int sec;
    }
    static class comp implements Comparator<Times>{
        public int compare(Times a, Times b){
            if (a.hrs != b.hrs) return a.hrs - b.hrs;
            else if(a.min != b.min) return a.min - b.min;
            return a.sec - b.sec;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Times[] t = new Times[N];
        for (int i = 0; i < N; i ++){
            t[i] = new Times();
            t[i].hrs = scan.nextInt();
            t[i].min = scan.nextInt();
            t[i].sec = scan.nextInt();
        }
        Arrays.sort(t, new comp());
        for (int i = 0; i < N; i ++){
            System.out.println(t[i].hrs + " " + t[i].min + " " + t[i].sec);
        }
        scan.close();
    }
    public static void Solution2(){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int hr, min, sec;
        int[] times = new int[N];
        for (int i = 0; i < N; i ++){
            hr = scan.nextInt();
            min = scan.nextInt();
            sec = scan.nextInt();
            times[i] = hr * 60 * 60 + min * 60 + sec;
        }
        Arrays.sort(times);
        for (int i = 0; i < N; i ++){
            hr = times[i]/3600;
            min = (times[i]%3600)/60;
            sec = times[i] - hr*3600 - min*60;
            System.out.println(hr + " " + min + " " + sec);
        }
    }
}