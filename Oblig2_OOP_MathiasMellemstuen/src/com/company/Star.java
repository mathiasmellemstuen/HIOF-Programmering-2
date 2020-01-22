package com.company;

public class Star extends CelestialBody {

    protected double effectiveTemp;

    public void setEffectiveTemp(double effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }
    public double getEffectiveTemp() {
        return effectiveTemp;
    }

    @Override
    public String toString() {
        
        String description = super.toString() + " " + name +  " har en temperatur på: " + effectiveTemp + " grader celcius. ";
        return description;
    }

    public Star(String name, double radius, double mass, double effectiveTemp) {

        super(name,radius,mass);
        this.effectiveTemp = effectiveTemp;
    }
}