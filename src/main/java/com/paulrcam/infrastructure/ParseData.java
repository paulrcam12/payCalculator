package com.paulrcam.infrastructure;

import com.paulrcam.domain.Employee;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class ParseData {


    public Employee txtToEmployee(String inputPath) throws IOException {

        InputStream inputStream = ParseData.class.getResourceAsStream(inputPath);

        HandlingFiles handlingFiles = new HandlingFiles();
        String line = handlingFiles.readFromInputStream(inputStream);

        String[] lineSeparated = line.split("=");
        String name = lineSeparated[0];
        String timesString = lineSeparated[1];


        String[] hoursWorkedArray = timesString.split(",");

        List<String> hoursWorked = Arrays.asList(hoursWorkedArray);

        Employee employee = new Employee(name, hoursWorked);


        return employee;
    }



}
