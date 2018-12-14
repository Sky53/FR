package reLern.mathlern;

import java.util.Date;

public class Main {
//    protected int count0 = 0;
//    protected int count1 = 0;
//    protected int count2 = 0;
//    protected int count3 = 0;
//    protected int count4 = 0;


    public static void main(String[] args) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        Date datesrart = new Date();

        for (int i = 0; i <= 1000_000_000; i++) {
            int n = ((int) (Math.random() * 5));
            //System.out.println("Сгенерированое чичло:  - " + n );
            switch (n) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                case 3:
                    count3++;
                    break;
                case 4:
                    count4++;
                    break;
            }

        }
        Date datestop = new Date();
        System.out.println("Count_0 - " + count0);
        System.out.println("Count_1 - " + count1);
        System.out.println("Count_2 - " + count2);
        System.out.println("Count_3 - " + count3);
        System.out.println("Count_4 - " + count4);
        System.out.println();
        int summ = count0 + count1 +count2 + count3 + count4;
        System.out.println(summ);
        long time;
        time = datestop.getTime() - datesrart.getTime();
        System.out.println(time);
    }
}
