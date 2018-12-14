package JavaRush.DATA;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calend {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2018,9,18);
        Date date = calendar.getTime();
        System.out.println(date);

        GregorianCalendar calendar1 = new GregorianCalendar(2018,Calendar.SEPTEMBER,18);

        Calendar calendar2 = new GregorianCalendar();
        calendar2.set(Calendar.YEAR, 2018);
        calendar2.set(Calendar.MONTH, 8);
//        calendar2.set(Calendar.MONTH, 8);
        calendar2.set(Calendar.DAY_OF_MONTH, 18);
        calendar2.set(Calendar.HOUR_OF_DAY, 18);
        calendar2.set(Calendar.MINUTE, 38);
        calendar2.set(Calendar.SECOND, 28);

        System.out.println(calendar2.getTime());

        calendar2.add(Calendar.MONTH, -2);
        System.out.println(calendar2.getTime());

        calendar.roll(Calendar.MONTH, -2);
        System.out.println(calendar.getTime());

        GregorianCalendar cannes = new GregorianCalendar(216,Calendar.AUGUST,2);
        cannes.set(Calendar.ERA,GregorianCalendar.BC);

        DateFormat dateFormat = new SimpleDateFormat("dd MMMMMMMM yyy GG");
        System.out.println(dateFormat.format(cannes.getTime()));
    }
}
