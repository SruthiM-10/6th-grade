package USACOPrograms;

/*
Teleportation
=============

One of the farming chores Farmer John dislikes the most is hauling
around lots of cow manure. In order to streamline this process, he
comes up with a brilliant invention: the manure teleporter! Instead
of hauling manure between two points in a cart behind his tractor, he
can use the manure teleporter to instantly transport manure from one
location to another.

Farmer John's farm is built along a single long straight road, so any
location on his farm can be described simply using its position along
this road (effectively a point on the number line). A teleporter is
described by two numbers x and y, where manure brought to location x
can be instantly transported to location y, or vice versa.

Farmer John wants to transport manure from location a to location b,
and he has built a teleporter that might be helpful during this
process (of course, he doesn't need to use the teleporter if it
doesn't help). Please help him determine the minimum amount of total
distance he needs to haul the manure using his tractor.

PROBLEM NAME: teleport

INPUT FORMAT:

The first and only line of input contains four space-separated
integers: a and b, describing the start and end locations, followed
by x and y, describing the teleporter. All positions are integers in
the range 0...100, and they are not necessarily distinct from
each-other.

OUTPUT FORMAT:

Print a single integer giving the minimum distance Farmer John needs
to haul manure in his tractor.

SAMPLE INPUT:

3 10 8 2

SAMPLE OUTPUT:

3

In this example, the best strategy is to haul the manure from
position 3 to position 2, teleport it to position 8, then haul it to
position 10. The total distance requiring the tractor is therefore 1
+ 2 = 3.
 */

import java.util.*;
import java.lang.*;

public class Teleport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt(), x = input.nextInt(), y = input.nextInt();
        int dist1 = Math.abs(b-a) , dist2 = Math.abs(x-a) + Math.abs(b-y) , dist3 = Math.abs(y-a) + Math.abs(b-x);
        int[] farm = {dist1,dist2,dist3};
        Arrays.sort(farm);
        System.out.println(farm[0]);
    }
}
