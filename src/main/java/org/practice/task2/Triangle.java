package org.practice.task2;

import java.util.Objects;

public class Triangle {
    private Point A;
    private Point B;
    private Point C;

    public Triangle(Point a, Point b, Point c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }

    public Point getA() {
        return A;
    }

    public void setA(Point a) {
        this.A = a;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point b) {
        this.B = b;
    }

    public Point getC() {
        return C;
    }

    public void setC(Point c) {
        this.C = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(A, triangle.A) && Objects.equals(B, triangle.B) && Objects.equals(C, triangle.C);
    }

    @Override
    public int hashCode() {
        return Objects.hash(A, B, C);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + A +
                ", b=" + B +
                ", c=" + C +
                '}';
    }
}
