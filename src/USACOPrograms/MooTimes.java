package USACOPrograms;
/*
Farmer John’s cows, named Mildred, Elsie, and Bessie, have been playing a game.
While the rules and name of the game are a secret only known to the cows, it is known that the game has a points system.
This is because any time a cow changes points, the cows publish the change to their newspaper, MooTimes.
Sometimes, there will be no change in points as a tie occurs, so no change is published.
The points carry over from game to game, the cows all start with 7 points, and the cows’ points will always be between 0 and 1000.
The point changes in MooTimes look like this:
12 Elsie +6
43 Bessie −3

The first line shows that Elsie gained 6 points on game 12.
The second line shows that Bessie lost 3 points on game 43. At most one cow changes points in a game.
Determine how many times the point leader(s) for the game changes.
A change in the number of cows with the most points also counts as a change in the point leader(s).

INPUT FORMAT
* Line 1: A single integer N representing the points changes published
* Line 2…N+1: A point change as shown in the MooTimes, as formatted above, showing the game played (an integer between 1 and 100), the cow’s name, the point change.

OUTPUT FORMAT
* Line 1: The number of times the point leader(s) change

SAMPLE INPUT
6
16 Bessie +9
2 Bessie +1
7 Elsie +6
12 Mildred -4
3 Mildred +3
10 Elsie -3

SAMPLE OUTPUT
6

Explanation:
The cows all start with 7 points.
In game 2, Bessie gained a point, making her the point leader with 8 points.
In game 3, Mildred gained 3 points, making her the point leader with 10 points.
In game 7, Elsie gained 6 points, making her the point leader with 13 points.
In game 10, Elsie lost 3 points, putting her at 10 points and tying with Mildred, changing the points leaders.
In game 12, Mildred lost 4 points, putting her at 6 points and leaving Elsie as the only leader with 10.
Finally, in game 16, Bessie gains 9 points, making her the point leader with 17 points, for a total of 6 point changes.
 */
import java.util.*;
public class MooTimes{
    static class Games{
        int gameNum;
        String name;
        String sign;
        int change;
    }
    static class comp implements Comparator<Games>{
        public int compare(Games a, Games b){
            return a.gameNum - b.gameNum;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), largest = -1, pointL = 0, numL = 1;
        int l, n;
        Games[] games = new Games[N];
        Integer[] people = new Integer[]{7,7,7};
        for (int i = 0; i < N; i ++){
            games[i] = new Games();
            games[i].gameNum = scan.nextInt();
            games[i].name = scan.next();
            String x = scan.next();
            String[] arr = x.split("");
            games[i].sign = arr[0];
            games[i].change = Integer.parseInt(arr[1]);
        }
        Arrays.sort(games, new comp());
        for (int i = 0; i < N; i ++){
            if (games[i].sign.equals("-"))
                games[i].change *= -1;
            if (games[i].name.equals( "Bessie")) people[0] += games[i].change;
            if (games[i].name.equals("Mildred")) people[1] += games[i].change;
            if (games[i].name.equals("Elsie")) people[2] += games[i].change;
            l = 0;
            n = 0;
            for (int a = 1; a < 3; a ++){
                if (people[a] > people[l]) l = a;
            }
            for (int a = 0; a < 3; a ++){
                if (people[a].equals(Collections.max(Arrays.asList(people)))) n ++;
            }
            if (largest == -1 || !people[l].equals(people[largest]) || numL != n){
                largest = l;
                numL = n;
                pointL ++;
            }
        }
        System.out.println(pointL);
    }
}

