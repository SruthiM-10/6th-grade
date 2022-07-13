package USACOPrograms;
/*
Harry wants to buy some acorns from the farmers’ market.
He’s been saving all his seeds to exchange for fresh acorns.
He wants to get the best value for his seeds.
He has decided that he will only buy 3 acorns out of the N (3 <= N <= 25,000) offered at the farmers’ market.

Harry has a system that rates how delicious each acorn is.
The acorns at the market have D_i (0 <= D_i <= 1,000,000) for deliciousness and have a price tag of P_i (0 < P_i <= 100,000,000).
Harry has enough seeds to buy any 3 acorns that he picks.

Harry wants to maximize the sum of his Taste-Price-Metric.
This ratio is calculated as D_i/P_i -- deliciousness divided by price for each of the 3 acorns that Harry picks.
Help Harry decide which acorns he should get.

For example assume that the farmers’ market offers 6 different acorns for Harry:

i    Deliciousness   Price   Taste-Price-Metric
-    -------------   -----   -------------------
1       34             738        0.04607...
2      674             267        2.52434...
3      252             124        2.03225...
4       94              78        1.20512...
5      662             947        0.69904…
6      362             563        0.64298...

Harry would pick acorn 2 (TPM = 2.52), acorn 3 (TPM = 2.03), and acorn 4 (TPM = 1.20).

INPUT FORMAT
Line 1: A single integer: N
Line 2..N+1: Line i+1 contains two space-separated integers: D_i and P_i

OUTPUT FORMAT
Line 1: The total price that Harry will need to pay for his acorns
Lines 2..4: The 1-based index of the acorns that Harry should buy, one per line in descending order sorted by the Taste-Price-Metric.

SAMPLE INPUT
6
34 738
674 267
252 124
94 78
662 947
362 563

SAMPLE OUTPUT
469
2
3
4
 */
import java.util.*;
public class AcornShopping{
    static class Acorns{
        int d;
        int price;
        int pos;
        double TDM;
    }
    static class comp implements Comparator<Acorns>{
        public int compare (Acorns a, Acorns b){
            if (b.TDM > a.TDM) return 1;
            else if (b.TDM == a.TDM) return 0;
            return -1;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Acorns[] a = new Acorns[N];
        for (int i = 0; i < N; i ++){
            a[i] = new Acorns();
            a[i].d = scan.nextInt();
            a[i].price = scan.nextInt();
            a[i].pos = i + 1;
            a[i].TDM = (double) a[i].d / a[i].price;
        }
        Arrays.sort(a, new comp());
        int sum = 0;
        for (int i = 0; i < 3; i ++) sum += a[i].price;
        System.out.println(sum);
        for (int i = 0; i < 3; i ++){
            System.out.println(a[i].pos);
        }
    }
}
