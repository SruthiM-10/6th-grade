package USACOPrograms;
/*
Farmer John recently bought some new fertilizers for one of his M (1 <= M <= 50) fields.
He applies a different fertilizer to each of his fields. Unfortunately, he learns that one fertilizer is bad.
For that reason some of his N (1 <= N <= 50) cows are getting sick.
However, Farmer John doesn't remember which fertilizer he used in which field.
He also does not know which fertilizer is bad. He just knows there is one bad field that makes cows sick.
Farmer John decides to watch the cows graze for a day to try to figure out which fields are making them sick.
Given detailed information about which cows grazed on which field at what time, and which cows got sick at what time,
determine the minimum number of cows that he will have to bring to the local cattle physician to guarantee that all sick cows are treated.
It is possible for the cows to get sick after Farmer John stops watching them, as long as they have grazed on the bad field.

INPUT FORMAT
The first line of the input contains four space-separated integers N, M, D, and S.
The next D lines (1 <= D <= 1000) contain three space-separated integers p (1 <= p <= N), m (1 <= m <= M), and t (1 <= t <= 100),
showing that at time t, cow p was grazing on field m.
The next S lines (1 <= S <= N) contain two space-separated integers p (1 <= p <= N) and t (1 <= t <= 100),
indicating that cow p gets sick at time t.
Each cow can only get sick once, and each cow only gets sick from a field that they grazed on at a strictly earlier time.

OUTPUT FORMAT
A single integer denoting the minimum number of cows he would need to take to the cattle physician to make sure that all sick cows are treated.

SAMPLE INPUT
4 4 10 2
1 1 1
2 2 6
3 1 5
4 1 7
1 3 8
3 2 4
1 3 5
4 2 7
3 4 2
1 4 3
1 4
3 7

SAMPLE OUTPUT
3

There are 4 cows and 4 fields. Cow 1 got sick at time 4, cow 3 got sick at time 7, while the other two cows did not get sick while Farmer John was watching (even though they might have gotten sick afterwards).

For field 1, cows 1 and 3 got sick after grazing on this field, so it could contain the new fertilizer. If it does, then cow 4 would also get sick after Farmer John stops watching, so there could be 3 sick cows.

For field 2, even though cow 3 grazed on this field and got sick, cow 1 did not graze on this field and still got sick, so it could not have contained the new fertilizer.

For field 3, cow 1 was the only cow that grazed on this field, but cow 1 got sick before grazing on this field, so this could not have caused cow 1 to get sick. In addition, cow 3 did not graze on this field and got sick. Thus, this field does not contain the new fertilizer.

For field 4, cows 1 and 3 got sick after grazing on this field, so it could contain the new fertilizer. If it does, then there would be 2 sick cows.

Therefore, Farmer John needs to take 3 cows to the cattle physician; if field 1 had the new fertilizer, then cows 1, 3, and 4 would have gotten sick.
 */
import java.util.*;
public class FertilizerFever{
    static class Cows{
        int[] fields = new int[50];
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), M = scan.nextInt(), D = scan.nextInt(), S = scan.nextInt();
        int ans = 0;
        Cows[] cows = new Cows[N];
        for (int i = 0; i < N; i ++) cows[i] = new Cows();
        for (int i = 0; i < D; i ++){
            int p = scan.nextInt(), m = scan.nextInt(), t = scan.nextInt();
            if (cows[p - 1].fields[m - 1] == 0 || cows[p - 1].fields[m - 1] > t) cows[p-1].fields[m - 1] = t;
        }
        int[] s = new int[S * 2];
        for (int i = 0; i < S; i ++){
            s[2 * i] = scan.nextInt();
            s[2 * i + 1] = scan.nextInt();
        }
        boolean flag;
        int counter;
        for (int a = 0; a < M; a ++){
            counter = 0;
            flag = true;
            for (int i = 0; i < S; i ++){
                if (cows[s[2 * i] - 1].fields[a] >= s[2 * i + 1] || cows[s[2 * i] - 1].fields[a] == 0){flag = false; break; }
            }
            if (flag){
                for (int i = 0; i < N; i ++){
                    if (cows[i].fields[a] != 0) counter ++;
                }
                ans = Math.max(counter, ans);
            }
        }
        System.out.println(ans);
    }
}