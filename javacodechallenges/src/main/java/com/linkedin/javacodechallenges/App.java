package com.linkedin.javacodechallenges;

import java.time.LocalDate;
import java.time.ZoneId;


public class App 
{
    public static LocalDate calculateHundredDayFromNow(LocalDate today) {
        return today.plusDays(100);
    }

    public static void main( String[] args )
    {
        LocalDate today = LocalDate.now(ZoneId.of("Africa/Johannesburg"));
        System.out.println("100 days from now is... " 
            + calculateHundredDayFromNow(today));
    }
}
