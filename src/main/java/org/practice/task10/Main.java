package org.practice.task10;

import org.practice.function.Function;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] array = new double[7];
        double y = 0;
        int countOfZeroElements = 0;

        for (int k = 0; k < 7; k++) {
            y = Function.function20(k);
            array[k] = y;
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < args.length; i++) {
            if (array[i] == 0) {
                countOfZeroElements++;
            }
        }

        if (countOfZeroElements == 0) {
            System.out.println("Second zero element does not exist!");
        }
    }
}
