package USACOPrograms;
/*
Farmer John has been branding the cows with a serial number ever
since he started the farm. The new cow fad is 'RADAR' brands,
so-called because they read the same forwards and backwards (they
are palindromic). All the cows want their daughters branded in the
new RADAR style.

Each mother wants her daughter's brand to be derived from her own
non-RADAR brand by summing the mother's brand and its reverse.
Sometimes (e.g., 12 + 21 = 33) this yields a RADAR palindrome right
away. Sometimes the process must be repeated several times until
a RADAR brand emerges. Consider the brand '87' that requires four
steps to convert to a RADAR brand:

       Brand  Reverse   Sum
Step 1:   87 +    78 =  165
Step 2:  165 +   561 =  726
Step 3:  726 +   627 = 1353
Step 4: 1353 +  3531 = 4884

Given the mother's brand (a positive integer), determine the number
of steps and ultimate RADAR brand that results from applying the
procedure above. No answer will be greater than two billion.

PROBLEM NAME: radar

INPUT FORMAT:

* Line 1: A single integer, the mother's non-RADAR brand.

SAMPLE INPUT:

87

OUTPUT FORMAT:

* Line 1: Two space-separated integers, respectively: the number of
steps to find the RADAR brand and the ultimate RADAR brand.

SAMPLE OUTPUT:

4 4884
 */
import java.util.*;
public class RADAR{
    public static void main(String[] args){ //string method of reversing the number
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), orig_n, counter = 0;
        String r;
        String N_2;
        boolean flag;
        do{
            flag = true;
            counter ++;
            orig_n = N;
            r = "";
            while (N > 0){
                r += (N % 10);
                N /= 10;
            }
            N = orig_n + Integer.parseInt(r);
            N_2 = N + "";
            for (int i = 0; i < N_2.length()/2; i ++){
                if (N_2.charAt(i) != N_2.charAt(N_2.length() - i - 1)){flag = false; break;}
            }
        }while (flag == false);
        System.out.print(counter + " ");
        System.out.println(N);
        scan.close();
    }
    public static void Solution2(){ //integer method of reversing the number
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), counter = 0, reverseNum = 0, orig_n;
        boolean flag;
        String N_S;
        do{
            flag = true;
            counter ++;
            orig_n = N;
            while (N > 0){
                reverseNum *= 10;
                reverseNum += N % 10;
                N /= 10;
            }
            N = orig_n + reverseNum;
            N_S = N + "";
            for (int i = 0; i < N_S.length()/2; i ++){
                if (N_S.charAt(i) != N_S.charAt(N_S.length() - 1 - i)){flag = false; break; }
            }
        }while (flag == false);
        System.out.println(counter);
        scan.close();
    }
}