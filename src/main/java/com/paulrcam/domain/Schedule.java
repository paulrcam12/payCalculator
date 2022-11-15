package com.paulrcam.domain;

public class Schedule {

    private String day;

    private String shift;
    private String typeOfDay;

    private String hourWorkedString;

    private Double hoursElapsed;

    private Double valueHour;

    private Double pay;



    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getTypeOfDay() {
        return typeOfDay;
    }

    public void setTypeOfDay(String typeOfDay) {
        this.typeOfDay = typeOfDay;
    }

    public String getHourWorkedString() {
        return hourWorkedString;
    }

    public void setHourWorkedString(String hourWorkedString) {
        this.hourWorkedString = hourWorkedString;
    }

    public Double getHoursElapsed() {
        return hoursElapsed;
    }

    public void setHoursElapsed(Double hoursElapsed) {
        this.hoursElapsed = hoursElapsed;
    }

    public Double getValueHour() {
        return valueHour;
    }

    public void setValueHour(Double valueHour) {
        this.valueHour = valueHour;
    }

    public Double getPay() {
        return pay;
    }

    public void setPay(Double pay) {
        this.pay = pay;
    }



    @Override
    public String toString() {
        return "Schedule{" +
                "day='" + day + '\'' +
                ", shift='" + shift + '\'' +
                ", typeOfDay='" + typeOfDay + '\'' +
                ", hourWorkedString='" + hourWorkedString + '\'' +
                ", hoursElapsed=" + hoursElapsed +
                ", valueHour=" + valueHour +
                ", pay=" + pay +
                '}';
    }
}
