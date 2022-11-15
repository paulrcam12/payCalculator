package com.paulrcam.domain;

import java.time.LocalTime;

public class Shift {

    private String Shift;
    private LocalTime hourSince;
    private LocalTime hourTo;


    public Shift(String shift, LocalTime hourSince, LocalTime hourTo) {
        Shift = shift;
        this.hourSince = hourSince;
        this.hourTo = hourTo;
    }

    public String getShift() {
        return Shift;
    }

    public void setShift(String shift) {
        Shift = shift;
    }

    public LocalTime getHourSince() {
        return hourSince;
    }

    public void setHourSince(LocalTime hourSince) {
        this.hourSince = hourSince;
    }

    public LocalTime getHourTo() {
        return hourTo;
    }

    public void setHourTo(LocalTime hourTo) {
        this.hourTo = hourTo;
    }

    @Override
    public String toString() {
        return "Shift{" +
                "Shift='" + Shift + '\'' +
                ", hourSince='" + hourSince + '\'' +
                ", hourTo='" + hourTo + '\'' +
                '}';
    }
}
