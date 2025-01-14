package com.linkedin.javacodechallenges;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void calculateHundredDayFromNow() {
        LocalDate d1 = LocalDate.of(2020, 1, 1);
        assertEquals(LocalDate.of(2020, 4, 10),
            App.calculateHundredDayFromNow(d1));

        LocalDate d2 = LocalDate.of(2025, 1, 14);
        assertEquals(LocalDate.of(2025, 4, 24),
                App.calculateHundredDayFromNow(d2));            
    }
    
}
