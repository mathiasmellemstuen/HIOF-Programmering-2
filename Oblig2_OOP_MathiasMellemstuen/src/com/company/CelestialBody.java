package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CelestialBody {
    
    protected String name;
    protected double radius;
    protected double mass;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getMass() {
        return mass;
    }
    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getSurfaceGravity() {

        double G = 0.00000000006674;
        double radiusInMetersSquared = (radius * 1000) * (radius * 1000);
        return (G * mass) / radiusInMetersSquared;
    }

    public String toString() {
        String description = name + " har en masse på: " + this.mass + " kg og en radius på " + radius + " km.";
        return description;
    }
    public CelestialBody(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }
}
