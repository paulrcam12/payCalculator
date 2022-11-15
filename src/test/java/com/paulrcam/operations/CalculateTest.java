package com.paulrcam.operations;

import com.paulrcam.domain.Schedule;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {
    String inputDay= "";
    String inputHours= "";

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void calculateTimeElapsedOfTwoHoursMonday() {

        inputDay= "MO";
        inputHours= "10:00-12:00";
        Calculate calculate= new Calculate();


        Schedule schedule = calculate.calcSchedule(inputDay, inputHours);
        Double timeElapsed = schedule.getHoursElapsed();
        Double valueHour= schedule.getValueHour();


        assertEquals(timeElapsed, 2.0, 0.001);
        assertEquals(valueHour, 15.0, 0.001);


    }
    @Test
    public void calculateValueOfHoursMonday() {

        inputDay= "MO";
        inputHours= "10:00-12:00";
        Calculate calculate= new Calculate();


        Schedule schedule = calculate.calcSchedule(inputDay, inputHours);
        Double timeElapsed = schedule.getHoursElapsed();
        Double valueHour= schedule.getValueHour();


        assertEquals(timeElapsed, 2.0, 0.001);


    }

    @Test
    public void calculateTimeElapsedOfTwoHoursOnSundayNight() {

        inputDay= "SU";
        inputHours= "20:00-22:00";


        Calculate calculate= new Calculate();


        Schedule schedule = calculate.calcSchedule(inputDay, inputHours);
        Double timeElapsed = schedule.getHoursElapsed();
        Double valueHour= schedule.getValueHour();


        assertEquals(timeElapsed, 2.0, 0.001);

    }
    @Test
    public void calculateValueOfHoursOnSundayNight() {

        inputDay= "SU";
        inputHours= "20:00-22:00";


        Calculate calculate= new Calculate();


        Schedule schedule = calculate.calcSchedule(inputDay, inputHours);
        Double timeElapsed = schedule.getHoursElapsed();
        Double valueHour= schedule.getValueHour();


        assertEquals(valueHour, 25.0, 0.001);

    }
}