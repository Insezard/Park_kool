package org.practice.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount gallon and sack: ");
        int amount = scanner.nextInt();

        double strike = 72.73;
        double stacks = -1280.46;

        for (int i = 0; i < amount; i++) {
            strike += strike;
            stacks += stacks;

            System.out.println("Gallon: " + strike + ", sack: " + stacks);
        }
    }
}
