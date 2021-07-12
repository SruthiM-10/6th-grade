package USACOPrograms;

import java.util.*;

/*
Counting Beads
==============

Bessie has spilled her collection of N (1 <= N <= 80) blue and orange
cowbeads (represented as 1s and 0s, respectively, in the human world) on
the floor. She cleans up the mess by arranging the beads into a long line.
She then counts the number of times a blue bead is next to an orange bead
and vice versa, but is not sure if she is correct. Write a program to
validate Bessie's count.

PROBLEM NAME: countbead

INPUT FORMAT:

* Line 1: A single integer: N

* Line 2: Line 2 contains N integers, each of which is 0 or 1

SAMPLE INPUT:

6
1 0 0 1 1 1

INPUT DETAILS:

There are six beads in total: the first bead in the line is a blue bead,
followed by two orange beads, and finally by three blue beads.

OUTPUT FORMAT:

* Line 1: A single integer describing the number of occurrences that a
        blue bead is next to an orange bead and vice versa.

SAMPLE OUTPUT:

2

OUTPUT DETAILS:

There are two times in the line that two differently colored beads are next
to each other.
 */

public class countBead{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int counter = 1;
        int countOfDifferentBeads = 0;
        int beads = scan.nextInt();
        int previousBead;
        previousBead = beads;
        int beads2;
        while (counter != n){
            beads2 = scan.nextInt();
            if (previousBead != beads2)
                countOfDifferentBeads++;
            counter++;
            previousBead = beads2;
        }
        System.out.println(countOfDifferentBeads);

    }
}
