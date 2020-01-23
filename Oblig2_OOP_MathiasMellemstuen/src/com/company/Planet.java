package com.company;

public class Planet extends CelestialBody {

    @Override
    public String toString() {
        String description = super.toString();
        return description;
    }

    public Planet(String name, double radius, double mass) {
        super(name,radius,mass);
    }
}