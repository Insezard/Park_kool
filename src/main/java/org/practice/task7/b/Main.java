package org.practice.task7.b;

import org.practice.function.Function;

public class Main {
    public static void main(String[] args) {

        double a = 0;
        int amount = 0;
        double x = 1;

        for (int k = 1; k < 10000; k++) {
            amount++;
            a += Math.pow(-1, k) * (((Function.function17(k) * k) * Math.pow(x, k))) / k;

            if (a < -0.0001) {
                System.out.println("Amount of iteration = " + amount);
                System.out.println("Sum A = " + a);
                break;
            }
        }
    }
}
