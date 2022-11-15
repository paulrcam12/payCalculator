package com.paulrcam.domain;

import java.util.List;

public class Employee {



    private String name;
    private List<String> timesWorked;

    private double totalHours;

    public Employee(String name, List<String> timesWorked) {
        this.name = name;
        this.timesWorked = timesWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTimesWorked() {
        return timesWorked;
    }

    public void setTimesWorked(List<String> timesWorked) {
        this.timesWorked = timesWorked;
    }

    public double getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", timesWorked=" + timesWorked +
                ", totalHours=" + totalHours +'}';
    }
}
