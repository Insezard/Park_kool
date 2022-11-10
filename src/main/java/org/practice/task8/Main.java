package org.practice.task8;

import org.practice.function.Function;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Double, Double> table = new HashMap<>();
        double sumOfSquare = 0;

        for (double x = 0; x < 20; x += 0.1) {
            double y = Function.function18(x);
            table.put(x, y);
        }

        table.forEach((k, v) -> System.out.println("X = " + k + " Y = " + v));

        for (double value : table.values()) {
            if (value > 0) {
                sumOfSquare += Math.pow(value, 2);
            }
        }

        System.out.println("Sum of all positive values of the function y = " + sumOfSquare);

        double minValue = Collections.min(table.entrySet(), Comparator.comparingDouble(Map.Entry::getValue)).getKey();

        System.out.println("Min value = " + minValue);
    }
}
