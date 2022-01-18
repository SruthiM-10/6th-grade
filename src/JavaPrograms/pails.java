package JavaPrograms;

/*
Milk Pails
==========

Farmer John has received an order for exactly M units of milk (1 <=
M <= 1,000) that he needs to fill right away. Unfortunately, his
fancy milking machine has just become broken, and all he has are
three milk pails of integer sizes X, Y, and M (1 <= X < Y < M). All
three pails are initially empty. Using these three pails, he can
perform any number of the following two types of operations:

- He can fill the smallest pail (of size X) completely to the top
with X units of milk and pour it into the size-M pail, as long as
this will not cause the size-M pail to overflow.

- He can fill the medium-sized pail (of size Y) completely to the
top with Y units of milk and pour it into the size-M pail, as long
as this will not cause the size-M pail to overflow.

Although FJ realizes he may not be able to completely fill the
size-M pail, please help him determine the maximum amount of milk he can
possibly add to this pail.

PROBLEM NAME: pails

INPUT FORMAT:

The first, and only line of input, contains X, Y, and M, separated
by spaces.

OUTPUT FORMAT:

Output the maximum amount of milk FJ can possibly add to the size-M
pail.

SAMPLE INPUT:

17 25 77

SAMPLE OUTPUT:

76

In this example, FJ fills the pail of size 17 three times and the
pail of size 25 once, accumulating a total of 76 units of milk.
 */

import java.util.*;
public class pails{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int check = 1;
        String XYM = scan.nextLine();
        String[] xym = XYM.split(" ");
        for (int m = Integer.parseInt(xym[2]); m >= 1; m --){
            for (int i = 0; i * Integer.parseInt(xym[1]) < m ; i ++) {
                if ((m - (i * Integer.parseInt(xym[1]))) % Integer.parseInt(xym[0]) == 0) {
                    System.out.println(m);
                    check = 0;
                    break;
                }
            }
            if (check == 0) break;
        }
    }
}