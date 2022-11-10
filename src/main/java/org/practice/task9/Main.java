package org.practice.task9;

import org.practice.function.Function;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Integer[] years = {1991, 1992, 1993, 1994, 1995, 1996, 1997, 1998, 1999, 2000, 2001};

        Map<Integer, Double> map = new HashMap<>();
        double y = 0;
        double sumOfIncome = 0;
        double sumOfLoss = 0;

        for (int x = 0; x < years.length; x++) {
            y = 100 * Function.function19(x);
            map.put(years[x], y);

            if (y > 0) {
                System.out.println("This year: " + years[x] + " company had income = " + y);
            } else if (y < 0) {
                System.out.println("This year: " + years[x] + " company had loss = " + y);
            } else {
                System.out.println("This year: " + years[x] + " company did not make any profit or loss = " + y);
            }
        }

        for (double sum : map.values()) {
            if (sum > 0) {
                sumOfIncome += sum;
            } else {
                sumOfLoss += sum;
            }
        }

        System.out.println("Sum income = " + sumOfIncome);
        System.out.println("Sum loss = " + sumOfLoss);



        int countYear = (int) map.entrySet().stream().filter(v -> v.getValue() > 0).count();
        System.out.println("Years of income: " + countYear);
    }
}
