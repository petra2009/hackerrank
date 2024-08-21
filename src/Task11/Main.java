package Task11;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mon = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        Calendar calendar = new GregorianCalendar(year, mon - 1, day);
        DateFormat df = new SimpleDateFormat("EEEE");
        System.out.println(df.format(calendar.getTime()));

    }
}
