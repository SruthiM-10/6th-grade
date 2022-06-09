package USACOPrograms;

import java.util.*;
public class Doodle{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A = 2, B = 3, C = 3, oc;
        String[][] doodle = new String[A][B];
        for (int r = 0; r < A; r ++){
                for (int c = 0; c < B*C; c ++){
                    oc = c;
                    if (c == 0) {
                        doodle[r][c] = scan.nextLine();
                        doodle[r] = doodle[r][c].split("");
                    }
                    if (c >= B) {
                        c = c % B;
                        if (c > 0)
                            c--;
                    }
                    for (int i = 0; i < C; i ++) System.out.print(doodle[r][c]);
                }
                System.out.println();
        }
    }
}
