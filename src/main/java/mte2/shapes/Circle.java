// Question: Q1 (mte2, gcis124, 2255)
// Package name: shapes
// File name: Circle.java

package mte2.shapes;

public class Circle implements Shape {
    
    private final double radius;
    public Circle(double radius) {    this.radius = radius;    }
    
    @Override
    public double area() {
        return Math.PI * radius;
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }


    public static void main(String[] args) {
        Circle c1 = new Circle(2);

        System.out.println(c1.area());
        System.out.println(c1.perimeter());

    }
}