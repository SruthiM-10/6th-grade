package USACOPrograms;
import java.util.*;

public class AirCownditioning {
    public static void main(String[] args) { //passes all Test cases with O(N) time complexity
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), counter = 0, count = 0;
        int[] temp_p = new int[N];
        int[] d = new int[N + 2];
        for (int i = 0; i < N; i++) {
            temp_p[i] = scan.nextInt();
        }
        d[0] = 0;
        for (int i = 0; i < N; i++) {
            d[1 + i] = temp_p[i] - scan.nextInt();
        }
        d[N + 1] = 0;
        int[] e = new int[N+1];
        int sum = 0;
        for (int i = 0; i < N + 1; i ++){
            e[i] = Math.abs(d[i + 1] - d[i]);
            sum += e[i];
        }
        System.out.println(sum/2);
    }
    public static void Solution1(){ //This also passes all test cases but could be more time efficient
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), counter = 0, count = 0;
        int[] temp_p = new int[N];
        ArrayList<Integer> d = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            temp_p[i] = scan.nextInt();
        }
        for (int i = 0; i < N; i++) {
            d.add(temp_p[i] - scan.nextInt());
        }
        while (!d.isEmpty()) {                         //When all values are equal to zero
            if (d.get(d.size() - 1) == 0) {             // if last element == 0...
                d.remove(d.size() - 1); // remove it.
                continue;
            }
            boolean positive = d.get(d.size() - 1) > 0;   //whether the last element is positive/negative
            int amtChange = 1;
            int delta = Math.abs(d.get(d.size() - 1));
            while (amtChange < d.size()) {                //finds length
                if (d.get(d.size() - 1 - amtChange) == 0) break;    //"stalls" shouldn't include 0's
                if ((d.get(d.size() - 1 - amtChange) > 0) != positive) break;  //"stalls" should have the same sign
                delta = Math.min(delta, Math.abs(d.get(d.size()-1-amtChange)));  //finding minimum amount that can be subtracted from entire arr
                amtChange++; //length of arr "stalls"
            }
            counter += delta;
            for (int i = 0; i < amtChange; i++) {
                if (d.get(d.size() - 1 - i) > 0)  //from the end, element == positive or not?
                    d.set(d.size() - 1 - i, d.get(d.size() - 1 - i) - delta);
                else
                    d.set(d.size() - 1 - i, d.get(d.size() - 1 - i) + delta);
            }
        }
        System.out.println(counter);
    }
    public static void Solution2(){ //passes all test cases but one (time limit error)
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), counter = 0, count = 0;
        int[] temp_p = new int[N];
        int[] temp_diff = new int[N];
        for (int i = 0; i < N; i++) {
            temp_p[i] = scan.nextInt();
        }
        for (int i = 0; i < N; i++) {
            temp_diff[i] = temp_p[i] - scan.nextInt();
        }
        for (int i = 0; i < N; i++) {
            temp_p[i] = scan.nextInt();
        }
        for (int i = 0; i < N; i++) {
            temp_diff[i] = temp_p[i] - scan.nextInt();
        }
        int i = 0;
        while (count < N) {
            if (i < N) {
                if (temp_diff[i] != 0) {
                    int sign = (int) Math.signum(temp_diff[i]);
                    for (int a = i; a < N && Math.signum(temp_diff[a]) == sign && temp_diff[a] != 0; a++) {
                        temp_diff[a] -= Math.signum(temp_diff[a]);
                    }
                    counter += 1;
                } else {
                    i++;
                    count++;
                }
            }
        }

        System.out.println(counter);
    }
}
