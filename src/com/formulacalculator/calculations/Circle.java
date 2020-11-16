package com.formulacalculator.calculations;

public class Circle {
    private float pi = 3.14f;

    public float calculateCircleLength(float radius) {
        return (pi * pi) * radius;
    }
    public float calculateCircleArea(float diameter) {
        return pi * (diameter * diameter);
    }
}
