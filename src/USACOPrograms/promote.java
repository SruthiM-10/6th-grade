package USACOPrograms;

import java.util.*;

public class promote{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int BeforeBronze = s.nextInt(), AfterBronze = s.nextInt();
        int BeforeSilver = s.nextInt(), AfterSilver = s.nextInt();
        int BeforeGold = s.nextInt(), AfterGold = s.nextInt();
        int BeforePlatinum = s.nextInt(), AfterPlatinum = s.nextInt();
        int DB = AfterBronze - BeforeBronze;
        int DS = AfterSilver -BeforeSilver;
        int DG = AfterGold - BeforeGold;
        int DP = AfterPlatinum - BeforePlatinum;
        int BTS, STG, GTP;
        BTS = (DB + DS + DG + DP + BeforeBronze) - AfterBronze;
        System.out.println(BTS);
        STG = (BTS + BeforeSilver) - AfterSilver;
        System.out.println(STG);
        GTP = (STG + BeforeGold) - AfterGold;
        System.out.println(GTP);

    }
}
