package USACOPrograms;
/*
The cows in Farmer John’s farm have developed a new game called Discow.
In Discow, 26 pairs of cows, labeled A through Z, stand in a circle and throw a frisbee in a straight line back and forth to each other,
with the two cows labelled A passing to each other, the two cows labeled B passing to each other, and so and so forth.
However, sometimes, two frisbees can collide when being thrown, which only happens if the paths of the two frisbees intersect.
Given an arrangement of cows, determine how many pairs of frisbees could collide when thrown.

INPUT FORMAT
A single string with 52 upper-case characters, with each letter A…Z showing up twice, listing the cows in the circle in clockwise order.

OUTPUT FORMAT
The number of pairs of frisbees that could collide with each other.

SAMPLE INPUT

AABBCDEEFFGGYHHIIJJKKLLCMMXNNOOPPQQRRSDSTTUUVVWWXYZZ
SAMPLE OUTPUT
5

Explanation:
Frisbees C and D, C and Y, D and X, D and Y, and D and S could collide.
 */
import java.util.*;
public class Discow{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        int[] pairs = new int[52];
        int ans = 0;
        for (int i = 0; i < 52; i ++){
            for (int b = 0; b < 52; b ++){
                if (a.charAt(i) == a.charAt(b) && i != b){
                    if (i < b){ pairs[(a.charAt(i) - 'A')*2] = i; pairs[(a.charAt(b) - 'A')*2 + 1] = b; }
                    if (b < i){ pairs[(a.charAt(i) - 'A')*2] = b; pairs[(a.charAt(b) - 'A')*2 + 1] = i; }
                    break;
                }
            }
        }
        for (int i = 0; i < 52; i += 2){
            for (int b = 0; b < 52; b += 2){
                if (pairs[i] > pairs[b] && pairs[i+1] > pairs[b+1] && pairs[i] < pairs[b+1])
                    ans ++;
                else if (pairs[i] < pairs[b] && pairs[i+1] < pairs[b+1] && pairs[b] < pairs[i+1]) ans ++;
            }
        }
        ans = ans/2;
        System.out.println(ans);
    }
    public static void Solution2() {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        int ans = 0;
        for (char c = 'A'; c <= 'Z'; c ++){
            int pos1 = -1, pos2 = -1;
            for (int i = 0; i < a.length(); i ++){
                if (a.charAt(i) == c && pos1 == -1){ pos1 = i; }
                else if (a.charAt(i) == c) pos2 = i;
            }
            int[] fr = new int[26];
            for (int i = pos1 + 1; i < pos2; i++){
                fr[a.charAt(i) - 'A'] ++;
            }
            for (int i = 0; i < 26; i ++){
                if(fr[i] == 1) ans ++;
            }
        }
        ans = ans/2;
        System.out.println(ans);
    }
}