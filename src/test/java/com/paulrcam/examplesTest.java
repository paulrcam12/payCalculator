package com.paulrcam;

import com.paulrcam.domain.Employee;
import com.paulrcam.operations.Calculate;
import com.paulrcam.operations.ParseData;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class examplesTest {

    @Test
    public void reneTotalEqualsTo215() throws IOException {
        String INPUT_FILE = "/inputs/rene13112022.txt";
        ParseData parseData= new ParseData();


        Employee employee= parseData.txtToEmployee(INPUT_FILE);
        Calculate calculate= new Calculate();

        System.out.println(calculate.calcTotalPrice(employee.getTimesWorked()));
        Double pay= calculate.calcTotalPrice(employee.getTimesWorked());
        Double payExpected= 215.0;

        assertEquals(payExpected, pay, 0.001);
    }

    @Test
    public void AstridTotalEqualsTo215() throws IOException {
        String INPUT_FILE = "/inputs/astrid13112022.txt";
        ParseData parseData= new ParseData();


        Employee employee= parseData.txtToEmployee(INPUT_FILE);
        Calculate calculate= new Calculate();

        System.out.println(calculate.calcTotalPrice(employee.getTimesWorked()));
        Double pay= calculate.calcTotalPrice(employee.getTimesWorked());
        Double payExpected= 85.0;

        assertEquals(payExpected, pay, 0.001);
    }

}