package com.company;

public class Main {

    public static void main(String[] args) {

        PlanetSystem solarSystem = new PlanetSystem("Solar system");

        Star sun = new Star("Sun", 695342, 1.9885E30, 5777);
        solarSystem.setCenterStar(sun);

        Planet mercury = new Planet("Mercury", 2439.7,3.283E23);
        Planet venus = new Planet("Venus", 6051.8, 4.867E24);
        Planet earth = new Planet("Earth", 6371,5.972E24);
        Planet mars = new Planet("Mars", 3389, 6.39E23);
        Planet jupiter = new Planet("Jupiter", 69911, 1.898E27);
        Planet saturn = new Planet("Saturn", 58232, 1.898E27);
        Planet uranus = new Planet("Uranus", 25362, 8.681E25);
        Planet neptune = new Planet("Neptune", 24622, 1.024E26);

        solarSystem.addPlanet(mercury);
        solarSystem.addPlanet(venus);
        solarSystem.addPlanet(earth);
        solarSystem.addPlanet(mars);
        solarSystem.addPlanet(jupiter);
        solarSystem.addPlanet(saturn);
        solarSystem.addPlanet(uranus);
        solarSystem.addPlanet(neptune);

        System.out.println(solarSystem.toString());
        System.out.println(earth.getSurfaceGravity());
        System.out.println(jupiter.getSurfaceGravity());
    }
}