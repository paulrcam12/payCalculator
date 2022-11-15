package com.paulrcam.application;

import com.paulrcam.domain.Employee;
import com.paulrcam.domain.Schedule;
import com.paulrcam.domain.Shift;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class Calculate {

    /** SOLID Principle: Single Responsibility Application
     *  Each class should have only one purpose
     *  and not be filled with excessive functionality
     */

    private static String[] MIDWEEK_DAYS = {"MO", "TU", "WE", "TH", "FR"};
    private static String[] WEEKEND_DAYS = {"SA", "SU"};
    private static List<Shift> SHIFTS = List.of(
            new Shift("EARLY_MORNING", LocalTime.parse("00:00", DateTimeFormatter.ISO_TIME), LocalTime.parse("09:00", DateTimeFormatter.ISO_TIME)),
            new Shift("DAY", LocalTime.parse("09:01", DateTimeFormatter.ISO_TIME), LocalTime.parse("18:00", DateTimeFormatter.ISO_TIME)),
            new Shift("NIGHT", LocalTime.parse("18:01", DateTimeFormatter.ISO_TIME), LocalTime.parse("23:59", DateTimeFormatter.ISO_TIME)));


    Employee employee;



    public Calculate(Employee employee) {
    this.employee = employee;

    }



    public Double calcTotalPrice(){


        Double totalPay=0.0;

        for (String hourWorkedString: employee.getTimesWorked()) {



            String day= hourWorkedString.substring(0,2);
            String hours= hourWorkedString.substring(2);


            Schedule schedule= calcSchedule(day, hours);

            totalPay= totalPay+schedule.getPay();

        }



    return totalPay;
    }

    public Schedule calcSchedule(String day, String hourWorkedString){

        String shiftReal="";
        Double hoursElapsed=-1.0;
        String typeOfDay= null;
        Double valueHour=-1.0;
        Double pay=-1.0;


        if (Arrays.asList(MIDWEEK_DAYS).contains(day)) {
            typeOfDay="MIDWEEK";

        } else if (Arrays.asList(WEEKEND_DAYS).contains(day)) {

            typeOfDay="WEEKEND";
        }

        String sinceHourString = hourWorkedString.split("-")[0];
        String toHourString = hourWorkedString.split("-")[1];


        LocalTime hourSince = LocalTime.parse(sinceHourString, DateTimeFormatter.ISO_TIME);
        LocalTime hourTo = LocalTime.parse(toHourString, DateTimeFormatter.ISO_TIME);


        for (Shift shift : SHIFTS) {


            String shiftSince = "sc";
            String shiftTo = "st";

            if (hourSince.isAfter(shift.getHourSince()) && hourSince.isBefore(shift.getHourTo())) {
                shiftSince = shift.getShift();
            } else {
                new Exception("No existe hora");
            }
            if (hourTo.isAfter(shift.getHourSince()) && hourSince.isBefore(shift.getHourTo())) {

                shiftTo = shift.getShift();

            }



            if (shiftSince.equals(shiftTo)) {
                shiftReal = shift.getShift();
                Duration timeElapsed = Duration.between(hourSince, hourTo);
                hoursElapsed = Double.valueOf(timeElapsed.getSeconds() / 3600);


                if (shiftReal.equals("EARLY_MORNING")) {
                    if (typeOfDay.equals("MIDWEEK")) {
                        valueHour = 25.00;
                    } else if (typeOfDay.equals("WEEKEND")) {
                        valueHour = 30.00;

                    }
                } else if (shiftReal.equals("DAY")) {
                    if (typeOfDay.equals("MIDWEEK")) {

                        valueHour = 15.00;
                    } else if (typeOfDay.equals("WEEKEND")) {

                        valueHour = 20.00;
                    }
                } else if (shiftReal.equals("NIGHT")) {
                    if (typeOfDay.equals("MIDWEEK")) {

                        valueHour = 20.00;
                    } else if (typeOfDay.equals("WEEKEND")) {

                        valueHour = 25.00;
                    }
                }


            } else {
                new Exception("No se pueden escribir rangos tan grandes");
            }


        }

        pay = hoursElapsed* valueHour;


        Schedule schedule= new Schedule();

        schedule.setDay(day);
        schedule.setShift(shiftReal);
        schedule.setTypeOfDay(typeOfDay);
        schedule.setHourWorkedString(hourWorkedString);
        schedule.setHoursElapsed(hoursElapsed);
        schedule.setValueHour(valueHour);
        schedule.setPay(pay);


        return schedule;
    }



}
