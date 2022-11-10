package org.practice.task3.b;

import org.practice.function.Function;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    Please select a job type.
                    1 - type A.
                    2 - type B.
                    3 - type C.
                    """);

            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> {
                    int salaryY = (int) (100 * Math.abs(Function.function12(12) + 50));
                    int tax = (salaryY / 100) * 10;
                    int salaryToPaid = salaryY - tax;

                    System.out.println("Salary type A:" + salaryY);
                    System.out.println("Tax type A:" + tax);
                    System.out.println("Salary to be paid type A: " + salaryToPaid);
                }
                case "2" -> {
                    int salaryY = (int) (150 * Math.abs(Function.function13(12) + 100));
                    int tax = (salaryY / 100) * 15;
                    int salaryToPaid = salaryY - tax;

                    System.out.println("Salary type B:" + salaryY);
                    System.out.println("Tax type B:" + tax);
                    System.out.println("Salary to be paid type B: " + salaryToPaid);
                }
                case "3" -> {
                    int salaryY = (int) (200 * Math.abs(Function.function14(12) + 135));
                    int tax = (salaryY / 100) * 20;
                    int salaryToPaid = salaryY - tax;

                    System.out.println("Salary type C:" + salaryY);
                    System.out.println("Tax type C:" + tax);
                    System.out.println("Salary to be paid type C: " + salaryToPaid);
                }
                default -> {
                    System.out.println("There is no such input!");
                }
            }
        }
    }
}
