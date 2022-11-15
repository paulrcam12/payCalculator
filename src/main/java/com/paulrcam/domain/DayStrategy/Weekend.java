package com.paulrcam.domain.DayStrategy;
/**
 *
 * PATTERN DESIGN: STRATEGY
 */
public class Weekend implements Day {

    public static final Double VALUE_EARLY_MORNING = 30.0;
    public static final Double VALUE_DAY = 20.0;
    public static final Double VALUE_NIGHT = 25.0;


    @Override
    public Double payValue(String Shift) {

        Double value = -1.0;
        switch (Shift) {
            case "EARLY_MORNING":
                value = VALUE_EARLY_MORNING;

                break;

            case "DAY":

                value = VALUE_DAY;
                break;
            case "NIGHT":

                value = VALUE_NIGHT;

                break;
        }
        return value;
    }
}