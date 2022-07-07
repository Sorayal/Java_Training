package com;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();
        c.set(Calendar.HOUR_OF_DAY, 12);
        c.set(Calendar.MINUTE, 58);
        c.set(Calendar.SECOND, 15);
        Date d = c.getTime();

        System.out.println("Start point: " + d.toString());
        System.out.println("Nearest whole minute: " + toNearestWholeMinute(d));
        System.out.println("Nearest whole hour: " + toNearestWholeHour(d));

        LocalDateTime customValue = LocalDateTime.of(2021, 1, 1, 23, 30, 36);
        LocalDateTime customValue2 = LocalDateTime.of(2021, 1, 1, 22, 30, 31);

        System.out.println(customValue);
        System.out.println(toNearesWholeHourOfCurrentDay(customValue));


        System.out.println(customValue2);
        System.out.println(toNearesWholeHourOfCurrentDay(customValue2));

    }

    /**
     * Method with LocalDateTime which rounds to fullest hour unless its after 23 o´clock
     *
     * @param value LocalDateTime object
     * @return new LocalDateTime object
     */
    public static LocalDateTime toNearesWholeHourOfCurrentDay(LocalDateTime value) {
        LocalDateTime response = value;
        if (value.getHour() < 23) {
            response = LocalDateTime.of(value.getYear(), value.getMonth(), value.getDayOfMonth(), value.getHour() + 1, 0, 0);
        }
        return response;
    }

    static Date toNearestWholeMinute(Date d) {
        Calendar c = new GregorianCalendar();
        c.setTime(d);

        if (c.get(Calendar.SECOND) >= 30)
            c.add(Calendar.MINUTE, 1);

        c.set(Calendar.SECOND, 0);

        return c.getTime();
    }

    static Date toNearestWholeHour(Date d) {
        Calendar c = new GregorianCalendar();
        c.setTime(d);

        if (c.get(Calendar.MINUTE) >= 30)
            c.add(Calendar.HOUR, 1);

        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);

        return c.getTime();
    }
}