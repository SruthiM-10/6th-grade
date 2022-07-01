package USACOPrograms;
/*
Josh, a fan of modern architecture, has constructed a new arena in the shape of a perfect circle. T
he arena's interior consists of a ring of n rooms, numbered 1...n clockwise around the perimeter of the arena (3 <= n <= 1,000).
Each room has doors to its two adjacent rooms as well as a door to the arena's exterior.

Josh wants exactly r_i people to end up in each room i  (1 <= r_i <= 100).
He intends to unlock the exterior door of a single room, allowing people to enter through that door.
This is in order to allow people into the arena in an orderly fashion.
Each person then walks clockwise  through the rooms until they reach a suitable destination.
Josh wants to unlock the exterior door, which will require everyone to walk a minimum total distance.
Please determine the minimum total distance people will need to walk, if Josh chooses the best such door to unlock.
The distance walked by one person is the number of interior doors through which they pass.

INPUT FORMAT: The first line of input contains n. Each of the remaining n lines contain r_1...r_n.

OUTPUT FORMAT: Please write out the minimum total amount of distance the people collectively need to travel.

SAMPLE INPUT
5
8
9
1
2
3
SAMPLE OUTPUT: 29
In this example, Josh will let people enter the arena through the door of the room that requires 8 people.
 */
import java.util.*;
public class Arena{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), counter, dist, smallest = Integer.MAX_VALUE - 1;
        int[] rooms = new int[n];
        for (int a = 0; a < n; a ++){ rooms[a] = scan.nextInt(); }
        for (int a = 0; a < n; a ++){
            dist = 0;
            counter = 1;
            for (int b = a + 1; counter < n; b ++){
                b %= n;
                dist += counter * rooms[b];
                counter ++;
            }
            smallest = Math.min(smallest, dist);
        }
        System.out.println(smallest);
    }
    public static void Solution2(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), dist = 0, smallest, sum = 0;
        int[] rooms = new int[n];
        for (int a = 0; a < n; a ++){
            rooms[a] = scan.nextInt();
            dist += rooms[a] * a;
            sum += rooms[a];
        }
        smallest = dist;
        for (int a = 1; a < n; a ++){
            dist = dist - sum + rooms[a-1]*n;
            smallest = Math.min(smallest,dist);
        }
        System.out.println(smallest);
    }
}
