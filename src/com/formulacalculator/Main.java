package com.formulacalculator;

import com.formulacalculator.calculations.Circle;
import com.formulacalculator.calculations.Rectangle;
import com.formulacalculator.calculations.Square;
import com.formulacalculator.calculations.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        System.out.println(circle.calculateCircleArea(8));
        System.out.println(circle.calculateCircleLength(4));
        System.out.println("");
        System.out.println(square.calculateSquareArea(5));
        System.out.println(square.calculateSquarePerimeter(5));
        System.out.println("");
        System.out.println(triangle.calculateTriangleArea(10, 20));
        System.out.println(triangle.calculateTriangleLength(20, 10, 10));
        System.out.println("");
        System.out.println(rectangle.calculateRectangleArea(5, 5));
        System.out.println(rectangle.calculateRectanglePerimeter(5, 5));


    }
}
