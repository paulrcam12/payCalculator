package com.paulrcam;

import com.paulrcam.domain.Employee;
import com.paulrcam.operations.Calculate;
import com.paulrcam.operations.ParseData;

import java.io.IOException;


public class main {

    public static String INPUT_FILE = "/inputs/rene13112022.txt";
    //public static String INPUT_FILE = "/inputs/test1.txt";
    //public static String INPUT_FILE = "/inputs/astrid13112022.txt";


    public static void main(String[] args) throws IOException {


        ParseData parseData= new ParseData();
        Employee employee= parseData.txtToEmployee(INPUT_FILE);

        Calculate calculate= new Calculate();

        Double pay= calculate.calcTotalPrice(employee.getTimesWorked());

        System.out.println("The amount to pay "+employee.getName()+" is "+pay+" USD.");

    }
}
