package org.practice.task3.a;

import org.practice.function.Function;

import java.util.Scanner;

public class Calculate {


    public static void branching() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numbers x: ");
        int x = scanner.nextInt();
        System.out.println("Please enter numbers a: ");
        int a = scanner.nextInt();
        System.out.println("Please enter numbers b: ");
        int b = scanner.nextInt();
        System.out.println("Please enter numbers c: ");
        int c = scanner.nextInt();
        System.out.println("Please enter numbers d: ");
        int d = scanner.nextInt();
        double y = 0;

        if (Math.abs(x) < 10) {
            y = Function.function12(x) * Math.tan(x + a) - Math.abs(Math.log10(b + 7));
        } else if (Math.abs(x) >= 10) {
            y = Function.function13(x) * c * 5 * Math.sqrt(Math.pow(x, 2) + Math.pow(d * Math.E, 1.3));
        }

        System.out.println("Y = " + y);
    }
}
