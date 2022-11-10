package org.practice.task1;

public class Main {
    public static void main(String[] args) {
        long kmPerSec = 299792;
        long kmPerHour = kmPerSec * 360;
        long kmPerDay = kmPerHour * 24;
        System.out.println("In one hour = " + kmPerHour);
        System.out.println("In one day = " + kmPerDay);
    }
}
