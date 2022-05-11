package com.teb.training.java.se8.date;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUsage {

    public static void main(String[] args) {
        Date dateLoc = new Date();
        long timeLoc = dateLoc.getTime();

        long currentTimeMillisLoc = System.currentTimeMillis();

        GregorianCalendar calendarLoc = new GregorianCalendar();
        long timeInMillisLoc = calendarLoc.getTimeInMillis();

        SimpleDateFormat dateFormatLoc = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String formatLoc = dateFormatLoc.format(calendarLoc.getTime());
        System.out.println(formatLoc);

        LocalDate date2Loc = LocalDate.now();
        LocalDate date3Loc = LocalDate.of(2020,
                                          12,
                                          3)
                                      .plusDays(3);
        LocalDate date4Loc = LocalDate.parse("2020-02-15");
        LocalDate date5Loc = LocalDate.parse("2020*02*15",
                                             DateTimeFormatter.ofPattern("yyyy*MM*dd"));
        LocalDate minusDaysLoc = date2Loc.minusDays(3);

        System.out.println(minusDaysLoc);
        LocalDateTime localDateTimeLoc = LocalDateTime.now();
        LocalDateTime localDateTimeLoc2 = LocalDateTime.of(2010,
                                                           10,
                                                           20,
                                                           14,
                                                           10)
                                                       .plusWeeks(10);

        LocalDateTime localDateTimeLoc3 = LocalDateTime.parse("2020-02-15 13:00:00",
                                                              DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        boolean beforeLoc = localDateTimeLoc2.isBefore(localDateTimeLoc3);

        LocalDateTime atTimeLoc = date5Loc.atTime(LocalTime.of(10,
                                                               13));

        LocalDateTime atStartOfDayLoc = date4Loc.atStartOfDay()
                                                .plusHours(3);
        long epochMilliLoc = atStartOfDayLoc.toInstant(ZoneOffset.UTC)
                                            .toEpochMilli();

        LocalDateTime plusSecondsLoc = localDateTimeLoc.plusWeeks(2)
                                                       .plusDays(3)
                                                       .plusHours(3)
                                                       .plusMinutes(15)
                                                       .plusSeconds(30);
        System.out.println(plusSecondsLoc);
        ZonedDateTime zonedDateTimeLoc = ZonedDateTime.now(ZoneId.of("Europe/Malta"));
        long epochMilliLoc2 = zonedDateTimeLoc.toInstant()
                                              .toEpochMilli();

        DateTimeFormatter dateTimeFormatterLoc = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
        String format2Loc = dateTimeFormatterLoc.format(localDateTimeLoc2);
        System.out.println(format2Loc);

        Duration ofSecondsLoc = Duration.ofSeconds(30);

        Duration ofDaysLoc = Duration.ofDays(3);
        long secondsLoc = Duration.between(localDateTimeLoc2,
                                           localDateTimeLoc3)
                                  .getSeconds();

    }
}
