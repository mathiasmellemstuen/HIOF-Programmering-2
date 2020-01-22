package com.company;

public class Main {

    public static void main(String[] args) {

        PlanetSystem solarSystem = new PlanetSystem("Solar system");

        Star sun = new Star("Sun", 10.0, 10.0, 12.0);
        solarSystem.setCenterStar(sun);

        Planet earth = new Planet("Jorda", 10.0,20.0);
        Planet merkur = new Planet("Merkur", 20,30);
        solarSystem.addPlanet(earth);
        solarSystem.addPlanet(merkur);

        System.out.println(earth.toString());
        System.out.println(sun.toString());
        System.out.println(solarSystem.toString());
    }
}