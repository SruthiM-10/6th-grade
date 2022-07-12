package USACOPrograms;
/*
Alpha has surveyed his class of N (2≤N≤50,000) students with IDs 1-N with a questionnaire with NQ (1≤NQ≤50) questions (labelled R1…RNQ), each with an integer answer from 1 to 5.

After compiling the results of his questionnaire, Alpha wants to answer a series of simple questions.
For example: "How many students answered 2 to question 3, 4 to question 7, and also 1 to question 8?"
More specifically, Alpha has P (1≤P≤10) questions, and each question has question number Qj (1≤Qj≤NQ) and required answer Aj  (1≤Aj≤5).
Alpha wants you to find the total number of students that answered Aj to Qj for j in the range 1-R.

For example, consider a class of 4 students and a survey of 6 questions; the responses are:

Student  Question
ID       1  2  3  4  5  6
----     ----------------
1        1  1  1  1  1  1
2        1  2  3  4  5  2
3        1  2  1  2  3  3
4        1  1  3  2  2  2
If Alpha asks, "How many students answered 3 to question 3 and 2 to question 4?" the answer would be 1 (just student 4).
If Alpha asks, "How many students answered 1 to question 1 and 2 to question 6?" the answer would be 2 (students 2 and 4).

INPUT FORMAT
* Line 1: Three space-separated integers: N, NQ, and P
* Lines 2..N+1: Line i+1 contains NQ space-separated integers that are the response to the questions for student i: R1…RNQ
* Lines N+2..N+1+P: Line j+N+1 contains two space-separated integers: Qj and Aj

OUTPUT FORMAT
* Line 1: A single integer that is the number of students that fit all of Alpha's requirements

SAMPLE INPUT
4 6 2
1 1 1 1 1 1
1 2 3 4 5 2
1 2 1 2 3 3
1 1 3 2 2 2
1 1
6 2

SAMPLE OUTPUT
2

 */
import java.util.*;
public class Survey{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int students = scan.nextInt(), survey_q = scan.nextInt(), q = scan.nextInt(), correct_q;
        int q_j, a_j, s = 0;
        int[][] responses = new int[students][survey_q];
        int[][] qa = new int[q][2];
        for (int r = 0; r < students; r ++){
            for (int c = 0; c < survey_q; c ++){
                responses[r][c] = scan.nextInt();
            }
        }
        for (int i = 0; i < q; i ++){
            qa[i][0] = scan.nextInt();
            qa[i][1] = scan.nextInt();
        }
        for (int r = 0; r < students; r ++){
            correct_q = 0;
            for (int i = 0; i < q; i ++){
                q_j = qa[i][0];
                a_j = qa[i][1];
                if (responses[r][q_j-1] == a_j) correct_q ++;
            }
            if (correct_q == q) s ++;
        }
        System.out.println(s);
    }
    public static void Solution2(){ //This solution uses boolean values to check whether a student passed Alpha's requirements.
        Scanner scan = new Scanner(System.in);
        int students = scan.nextInt(), survey_q = scan.nextInt(), q = scan.nextInt();
        int q_j, a_j, s = 0;
        int[][] responses = new int[students][survey_q];
        boolean[] status = new boolean[students];
        for (int r = 0; r < students; r ++){
            for (int c = 0; c < survey_q; c ++){
                responses[r][c] = scan.nextInt();
            }
        }
        for (int i = 0; i < students; i ++){
            status[i] = true;
        }
        for (int i = 0; i < q; i ++){
            q_j = scan.nextInt();
            a_j = scan.nextInt();
            for (int r = 0; r < students; r ++){
                if (responses[r][q_j-1] != a_j) status[r] = false;
            }
        }
        for (int i = 0; i < students; i ++){
            if (status[i]) s ++;
        }
        System.out.println(s);
    }
}