package com.formulacalculator.calculations;

public class Triangle {
    public float calculateTriangleLength(float side1, float side2, float side3) {
        return side1 + side2 + side3;
    }

    public float calculateTriangleArea(float base, float height) {
        return (base * height) / 2;
    }
}
