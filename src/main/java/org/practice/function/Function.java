package org.practice.function;

public class Function {

    public static double function12(double x) {
        return Math.pow(Math.cos(x), 3) / 2.1 + Math.pow(Math.cos(x), 2) / 1.1 - 8.3 * Math.sin(3 * x + 1);
    }

    public static double function13(double x) {
        return Math.sin(Math.pow(x, 2)) * Math.cos(Math.pow(x, 3)) - Math.sin(x) + 5.2;
    }

    public static double function14(double x) {
        return 2 * Math.sin(x) * Math.sin(2 * x - 1.5) * Math.cos(2 * x + 1.5) - 6;
    }

    public static double function15(double x) {
        return Math.abs(Math.cos(Math.pow(x, 2) - 0.51)) * Math.sin(3 * x - 4) - 4.44;
    }

    public static double function16(double x) {
        return Math.cos(2.1 * x) * Math.sin(Math.abs(x)) / 0.15 - 5.8;
    }

    public static double function17(double x) {
        return Math.abs(Math.cos(2 * Math.pow(x, 3)) + 2 * Math.sin(x / 1.2)) + 10.51 * Math.cos(Math.abs(3 * x));
    }

    public static double function18(double x) {
        return Math.abs(Math.sin(Math.pow(x, 2) / 1.5 - 2)) + 11.73 * Math.cos(1.6 * x - 1);
    }

    public static double function19(double x) {
        return 13.4 * Math.cos(Math.abs(x)) * Math.sin(Math.pow(x, 2) - 2.25);
    }

    public static double function20(double x) {
        return Math.abs(Math.cos(Math.pow(x, 2) - 3.8)) / 4.5 -9.7 * Math.sin(x - 3.1);
    }
}
