package USACOPrograms;
import java.util.*;

public class WalkingHome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int l = 0; l < T; l++) {
            int N = scan.nextInt();
            int K = scan.nextInt();
            int counter = 0;
            int[][] hay = new int[2][N];
            int[][] field = new int[N][N];
            scan.nextLine();
            for (int i = 0; i < N; i++) {
                String s = scan.nextLine();
                for (int a = 0; a < N; a++) {
                    if (s.charAt(a) == 'H') {
                        hay[1][a]++;
                        hay[0][i]++;
                        field[i][a]++;
                    }

                }
            }
            if (1 <= K) {
                counter = 2;
                if (hay[0][0] > 0 || hay[1][N - 1] > 0) counter--;
                if (hay[1][0] > 0 || hay[0][N - 1] > 0) counter--;
            }
            if (2 <= K) {
                for (int dest1 = 1; dest1 < N - 1; dest1++) {                             //col
                    if (field[0][dest1] > 0) break;
                    if (hay[1][dest1] > 0) continue;
                    for (int check = dest1; check < N - 1; check++) {
                        if (field[N - 1][check] > 0) break;
                        else if (check == N - 2) counter++;
                    }
                }
                for (int dest1 = 1; dest1 < N - 1; dest1++) {                            //row
                    if (field[dest1][0] > 0) break;
                    if (hay[0][dest1] > 0) continue;
                    for (int i = dest1; i < N - 1; i++) {
                        if (field[i][N - 1] > 0) break;
                        else if (i == N - 2) counter++;
                    }
                }
            }
            if (3 <= K) {                        //part where I was wrong in bogus solution
                for(int r = 1; r < N - 1; r ++){
                    for (int c = 1; c < N - 1; c ++){
                        boolean valid = field[r][c] == 0;
                        for(int a = 0; a < N; a++) {
                            if(a <= r && field[a][c] > 0) valid = false;
                            if(a >= r && field[a][N-1] > 0) valid = false;
                            if(a <= c && field[0][a] > 0) valid = false;
                            if(a >= c && field[r][a] > 0) valid = false;
                        }
                        counter += (valid) ? 1 : 0;
                        valid = field[r][c] == 0;
                        for(int a = 0; a < N; a++) {
                            if(a <= r && field[a][0] > 0) valid = false;
                            if(a >= r && field[a][c] > 0) valid = false;
                            if(a <= c && field[r][a] > 0) valid = false;
                            if(a >= c && field[N-1][a] > 0) valid = false;
                        }
                        counter += (valid) ? 1 : 0;
                    }
                }
            }
            System.out.println(counter);
        }
    }
    public static void BogusSolution() {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int l = 0; l < T; l ++){
            int N = scan.nextInt();
            int K = scan.nextInt();
            int counter = 0;
            int[][] hay = new int[2][N];
            int[][] field = new int[N][N];
            scan.nextLine();
            for (int i = 0; i < N; i ++){
                String s = scan.nextLine();
                for (int a = 0; a < N; a ++){
                    if (s.charAt(a) == 'H'){ hay[1][a] ++; hay[0][i] ++; field[i][a] ++;}

                }
            }
            if (1 <= K){
                counter = 2;
                if (hay[0][0] > 0 || hay[1][N-1] > 0) counter --;
                if (hay[1][0] > 0 || hay[0][N-1] > 0) counter --;
            }
            if (2 <= K){
                for (int dest1 = 1; dest1 < N - 1; dest1 ++) {                             //col
                    if (field[0][dest1] > 0) break;
                    if (hay[1][dest1] > 0) continue;
                    for (int check = dest1; check < N - 1; check++){
                        if (field[N-1][check] > 0) break;
                        else if (check == N - 2 ) counter ++;
                    }
                }
                for (int dest1 = 1; dest1 < N - 1; dest1 ++) {                            //row
                    if (field[dest1][0] > 0) break;
                    if (hay[0][dest1] > 0) continue;
                    for (int i = dest1; i < N-1; i ++){
                        if (field[i][N - 1] > 0) break;
                        else if (i == N - 2 ) counter ++;
                    }
                }
            }
            if (3 <= K){
                for (int dest1 = 1; dest1 < N - 1; dest1 ++) {                            //col
                    if (field[0][dest1] > 0) break;
                    for (int dest2 = 1; dest2 < N -1; dest2 ++){
                        if (field[dest2][dest1] > 0) break;
                        for (int i = dest1 + 1; i <= N - 1; i ++){
                            if (field[dest2][i] > 0) break;
                            if (i == N - 1){
                                for (int dest3 = dest2 ; dest3 < N - 1; dest3 ++){
                                    if (field[dest3][i] > 0) break;
                                    if (dest3 == N - 2) counter ++;
                                }
                            }
                        }
                    }
                }
                for (int dest1 = 1; dest1 < N - 1; dest1 ++) {                            //row
                    if (field[dest1][0] > 0) break;
                    for (int dest2 = 1; dest2 < N - 1; dest2 ++){
                        if (field[dest1][dest2] > 0) break;
                        for (int i = dest1 + 1; i <= N - 1; i ++){
                            if (field[i][dest2] > 0) break;
                            if (i == N - 1){
                                for (int dest3 = dest2; dest3 < N - 1; dest3 ++){
                                    if (field[dest3][i] > 0) break;
                                    if (dest3 == N - 2) counter ++;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(counter);
        }
    }
/*
    public static void TestCase(){
        Scanner scan = new Scanner(System.in);
        String s2 = scan.next();
        String[] s1 = s2.split(" ");
        int N = Integer.parseInt(s1[0]);
        int K = Integer.parseInt(s1[1]);
        int counter = 0;
        int[][] hay = new int[2][N];
        int[][] field = new int[N][N];
        scan.nextLine();
        for (int i = 0; i < N; i ++){
            String s = scan.nextLine();
            for (int a = 0; a < N; a ++){
                if (s.charAt(a) == 'H'){ hay[1][a] ++; hay[0][i] ++; field[i][a] ++;}

            }
        }
        int row = 0, col = 0;
        if (K == 1){
            counter = 2;
            if (hay[0][0] > 0 || hay[1][N-1] > 0) counter --;
            if (hay[1][0] > 0 || hay[0][N-1] > 0) counter --;
        }
        if (K == 2){
            for (int dest1 = 1; dest1 < N - 1; dest1 ++) {
                if (field[0][dest1] > 0) break;
                if (hay[1][dest1] > 0) continue;
                for (int i = dest1; i < N-1; i ++){
                    if (field[N-1][i] > 0) break;
                    else if (i == N - 2 ) counter ++;
                }
            }
        }
        if (K == 3){
            for (int dest1 = 1; dest1 < N - 1; dest1 ++) {
                if (field[0][dest1] > 0) break;
                for (int dest2 = 1; dest2 < N -1; dest2 ++){
                    if (field[dest2][dest1] > 0) break;
                    for (int i = dest1 + 1; i < N; i ++){
                        if (field[dest2][i] > 0) break;
                        if (i == N -1) counter ++;
                    }
                }

            }
        }
        System.out.println(counter);
        scan.close();*/
}
