package org.practice.task2;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Point(0, 0), new Point(10, 9), new Point(-10, 11));

        double sideA = Math.sqrt(Math.pow(triangle.getA().getX() - triangle.getB().getX(), 2) + Math.pow(triangle.getB().getY() - triangle.getB().getY(), 2));
        double sideB = Math.sqrt(Math.pow(triangle.getB().getX() - triangle.getC().getX(), 2) + Math.pow(triangle.getB().getY() - triangle.getC().getY(), 2));
        double sideC = Math.sqrt(Math.pow(triangle.getC().getX() - triangle.getA().getX(), 2) + Math.pow(triangle.getC().getY() - triangle.getA().getY(), 2));

        double semiP = (sideA + sideB + sideC) / 2;

        int xC = (triangle.getA().getX() + triangle.getC().getX()) / 2;
        int yC = (triangle.getA().getY() + triangle.getA().getY()) / 2;

        Point pointM = new Point(xC, yC);

        double medianTriangle = Math.sqrt(Math.pow(triangle.getB().getX() - pointM.getX(), 2) + Math.pow(triangle.getB().getY() - pointM.getY(), 2));
        System.out.println("Median triangle = " + medianTriangle);

        double bisector = 2 * Math.sqrt(sideA * sideB * sideC * (semiP - sideA)) / sideB + sideC;
        System.out.println("Bisector triangle = " + bisector);
    }
}
