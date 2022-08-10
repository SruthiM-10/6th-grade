package USACOPrograms;
/*
Farmer John wants to pass a message to all of his N (1 <= N <= 1,000) cows,
which are all spread across his fields, which can be arranged as a number line with coordinates x_i (1 <= x_i <= 1,000).
Because it would take a lot of time to message all the cows himself, Farmer John wants to let the cows relay the message to one another.
However, Farmer John notices that the cows will only pass the message to the nearest cow, even if the other cow has already received the message.
If multiple cows are the same distance away, then the cow will relay the message to the leftmost of those cows.
Thus, Farmer John wants to notify enough cows such that all his cows receive his message.
Determine the minimum number of cows Farmer John personally needs to relay the message to so that all cows receive his message.

INPUT FORMAT
* Line 1: A single integer N
* Line 2: N space separated integers x_i, representing the location of each cow

OUTPUT FORMAT
e 1: A single integer representing the minimum number of cows Farmer John personally needs to deliver his message to

SAMPLE INPUT
7
4 2 8 11 16 3 24

SAMPLE OUTPUT
2

Explanation:
In this example, Farmer John should pass the message to the cows at positions 4 and 24.
The cow at position 4 will pass the message to the cow at position 3,
who passes it to the cow at position 2 because she is to the left of the cow at position 4.
Cows 2 and 3 will then continue to relay the message to one another.
The cow at position 24 will pass the message to the cow at position 16,
who will pass the message to the cow at position 11,
who will relay the message back and forth to the cow at position 8.
 */
import java.util.*;
public class Messenger{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), ans = 0;
        int[] cows = new int[N];
        for (int i = 0; i < N; i ++) cows[i] = scan.nextInt();
        Arrays.sort(cows);
        String[] directions = new String[N];
        int[] frequency = new int[N];
        //Assigning the directions of the "loops" as the cows relay the message to each other
        directions[0] = "R";
        directions[N - 1] = "L";
        for (int i = 1; i < N - 1; i ++){
            if (cows[i + 1] - cows[i] < cows[i] - cows[i - 1]) directions[i] = "R";
            else directions[i] = "L";
        }
        //Assigning the number of times a cow gets a message
        if (directions[1].equals("L")) frequency[0] = 1;
        if (directions[N - 2].equals("R")) frequency[N - 1] = 1;
        for (int i = 1; i < N - 1; i ++){
            if (directions[i - 1].equals("R")) frequency[i] ++;
            if (directions[i + 1].equals("L")) frequency[i] ++;
        }
        //Counting the number of cows Farmer John needs to personally relay the message
        for (int i = 0; i < N; i ++){
            if (frequency[i] == 0) ans ++; //when no cow every relays the message to cow_i
            if (i < N - 1 && frequency[i] == 1 && frequency[i + 1] == 1){
                if (directions[i].equals("R") && directions[i + 1].equals("L"))
                    ans ++;  //when the only cow that relays the message to cow_i is cow_i+1,
                // and the only cow that relays the message to cow_i+1 is cow_i.
            }
        }
        System.out.println(ans);
    }
}

