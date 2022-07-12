package USACOPrograms;
/*
The cows' slimming diet has left Farmer John with extra hay, so he has decided to hold an auction to reduce his inventory.
He has N (1 <= N <= 1,000) identical lots (each of about 100 bales) of hay;
his potential customers comprise M (1 <= M <= 1,000) other farmers in the area.

Each farmer_i tells Farmer John how much he is willing to pay P_i (1 <= P_i <= 1,000,000) for a lot of hay.
Each of the farmers wishes to purchase a single lot of hay.

To make sure the other farmers do not get jealous of each other,
Farmer John decides that he must sell the lots of hay at a fixed price to each customer who is willing to pay at least that price;
the rest will decline the purchase.

Help Farmer John determine the smallest price he should set on a lot of hay to maximize the amount of money he makes.

PROBLEM NAME: auction

INPUT FORMAT:
* Line 1: Two space-separated integers: N and M
* Lines 2-M+1: Line i+1 contains a single integer: P_i

SAMPLE INPUT:
5 4
2
8
10
7

OUTPUT FORMAT:
* Line 1: Two space-separated integers: the smallest price that Farmer
        John should choose to maximize his revenue and the amount of
        money he takes in.

SAMPLE OUTPUT:
7 21

Explanation:
Farmer John has 5 lots of hay. 4 farmers wish to purchase hay; they will pay 2, 8, 10, and 7, respectively, for a lot of hay.
Farmer John should set the price at 7 so that 3 of the farmers will be willing to pay for a bale of hay, and he will earn 21.
 */
import java.util.*;
public class Auction{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt(), f = scan.nextInt(), largest = 0, price = 0, temp;
        int[] prices = new int[f];
        for (int i = 0; i < f; i ++){
            prices[i] = scan.nextInt();
        }
        for (int i = 0; i < f; i ++){
            int smallest = i;
            for (int b = i + 1; b < f; b ++){
                if (prices[b] < prices[smallest]) smallest = b;
            }
            temp = prices[i];
            prices[i] = prices[smallest];
            prices[smallest] = temp;
            if (prices[i] * (f - i) > largest && h >= (f - i)){
                largest = prices[i] * (f - i);
                price = prices[i];
            }
        }
        System.out.println(price + " " + largest);
    }
}

