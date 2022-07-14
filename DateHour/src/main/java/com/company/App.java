package com.company;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class App {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();
        c.set(Calendar.HOUR_OF_DAY, 12);
        c.set(Calendar.MINUTE, 58);
        c.set(Calendar.SECOND, 15);
        Date d = c.getTime();

        /*
        System.out.println("Start point: " + d.toString());
        System.out.println("Nearest whole minute: " + toNearestWholeMinute(d));
        System.out.println("Nearest whole hour: " + toNearestWholeHour(d));
        System.out.println("\n-------------------\n");
        LocalDateTime localValue = LocalDateTime.now();
        System.out.println(localValue);
        localValue = localValue.plus(1, ChronoUnit.HOURS);
        System.out.println(localValue);

        localValue.getMinute();
        */

        LocalDateTime customValue = LocalDateTime.of(2021,1, 1, 23, 30, 36);
        LocalDateTime customValue2 = LocalDateTime.of(2021,1, 1, 0, 30, 31);
        //System.out.println(customValue);
        //System.out.println(toTheNearestWholeHourOfCurrentDay(customValue));

        //System.out.println(toTheNearestWholeHourOfCurrentDay(customValue2));
        //System.out.println(customValue.getSecond());

        //String date = new SimpleDateFormat("MM-yyyy").format(LocalDateTime.now());  doesnt work
        String date = DateTimeFormatter.ofPattern("MM/yyyy").format(LocalDateTime.now());
        System.out.println(date);

        OffsetDateTime currentDateTime = OffsetDateTime.now();
        OffsetDateTime maxdays = currentDateTime.withDayOfMonth(currentDateTime.getMonth().maxLength());




    }

    static LocalDateTime toTheNearestWholeHourOfCurrentDay(LocalDateTime value){
        LocalDateTime response = value;
        if(value.getHour() < 23){
            response = LocalDateTime.of(value.getYear(), value.getMonthValue(), value.getDayOfMonth(), value.getHour() + 1, 0, 0);
        }
        return response;
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

    static Date toNearestWholeMinute(Date d) {
        Calendar c = new GregorianCalendar();
        c.setTime(d);

        if (c.get(Calendar.SECOND) >= 30)
            c.add(Calendar.MINUTE, 1);

        c.set(Calendar.SECOND, 0);

        return c.getTime();
    }
}
