package org.practice.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter letter D or K or L or N or T: ");
        City city1 = new City("Dnipro", 1003460);
        City city2 = new City("Kyiv", 4567989);
        City city3 = new City("London", 6563289);
        City city4 = new City("New-York", 8542289);
        City city5 = new City("Tokio", 9567989);

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();


        switch (choice) {
            case "D" ->
                    System.out.println("City = " + city1.getName() + ", population = " + city1.getPopulation());
            case "K" ->
                    System.out.println("City = " + city2.getName() + ", population = " + city2.getPopulation());
            case "L" ->
                    System.out.println("City = " + city3.getName() + ", population = " + city3.getPopulation());
            case "N" ->
                    System.out.println("City = " + city4.getName() + ", population = " + city4.getPopulation());
            case "T" ->
                    System.out.println("City = " + city5.getName() + ", population = " + city5.getPopulation());
        }

        if (choice.equals("D")) {
            System.out.println("City = " + city1.getName() + ", population = " + city1.getPopulation());
        } else if (choice.equals("K")) {
            System.out.println("City = " + city2.getName() + ", population = " + city2.getPopulation());
        } else if (choice.equals("L")) {
            System.out.println("City = " + city3.getName() + ", population = " + city3.getPopulation());
        } else if (choice.equals("N")) {
            System.out.println("City = " + city4.getName() + ", population = " + city4.getPopulation());
        } else if (choice.equals("T")) {
            System.out.println("City = " + city5.getName() + ", population = " + city5.getPopulation());
        }
    }
}

