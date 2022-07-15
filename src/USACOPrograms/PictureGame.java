package USACOPrograms;
/*
Harry is teaching baby bunnies how to read by giving them a set of N (1 <= N <= 100) leaflets.
Each leaflet has a word and an image on each side.
For example, a leaflet might have the word “bunny” and a picture of a bunny next to it on one side,
and the word “squirrel” and a picture of a squirrel on the other side.
When the leaflets are layed down,N words are shown, and by flipping the leaflets over, a different set of N words can be seen.

Harry, determined to help the bunnies with their spelling, decides to make clay blocks, each engraved with a single letter of the alphabet.
Harry wants to make enough clay blocks of each letter so that regardless of which set of N words are visible,
the bunnies can spell the words out with the clay blocks.

For example, if N = 3 and the words “leaf”, “tree”, and “bird” were facing up,
the bunnies would need at least one ‘a’ block, one ‘b’ block, one ‘d’ block, three ‘e’ blocks, one ‘f’ block, one ‘i’ block, one ‘l’ block, two ‘r’ blocks, and one ‘t’ block. .

Calculate the minimum number of clay blocks for each letter of the alphabet that
Harry needs to provide so that the bunnies can spell N visible words.

INPUT FORMAT
Line 1 contains a single integer, N.
The next N lines each contain 2 words separated by a space, indicating the one word on the hidden side and one word on the visible side.
Each word is a string of at most 10 lowercase letters.

OUTPUT FORMAT
Output 26 lines.
The ith line should indicate the number of blocks needed for the i th letter of the alphabet,
so line 1 should indicate how many ‘a’s are needed, line 2 should indicate how many ‘b’s are needed, and so on and so forth.

SAMPLE INPUT
3
leaf green
root tree
bird fly

SAMPLE OUTPUT
1
1
0
1
4
2
1
0
1
0
0
2
0
1
2
0
0
3
0
1
0
0
0
0
1
0
 */
import java.util.*;
public class PictureGame{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] a = new int[26];
        String s, s1;
        for (int i = 0; i < N; i ++){
            s = scan.next();
            s1 = scan.next();
            int[] rep = new int[26];
            int[] rep1 = new int[26];
            for (int l = 0; l < s.length(); l ++){
                rep[s.charAt(l) - 'a'] ++;
            }
            for (int l = 0; l < s1.length(); l ++){
                rep1[s1.charAt(l) - 'a'] ++;
            }
            for (int b = 0; b < 26; b ++){
                a[b] += Math.max(rep[b], rep1[b]);
            }
        }
        for (int i = 0; i < 26; i ++) System.out.println(a[i]);
    }
}
