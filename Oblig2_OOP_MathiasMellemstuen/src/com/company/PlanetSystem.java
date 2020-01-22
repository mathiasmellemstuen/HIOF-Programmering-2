package com.company;

import java.util.ArrayList;

public class PlanetSystem {

    private String name;
    private Star centerStar;
    private ArrayList<Planet> planets = new ArrayList<Planet>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Star getCenterStar() {
        return centerStar;
    }
    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }
    public ArrayList<Planet> getAllPlanets() {
        return planets;
    }
    public Planet getPlanet(String name) {

        for(int i = 0; i < planets.size(); i++) {
            Planet p = planets.get(i);

            if(p.getName().equals(name))
                return p;
        }
        return null;
    }
    public Planet getPlanet(int index) {
        if(index < 0 || index >= planets.size())
            return null;

        return planets.get(index);
    }
    public void addPlanet(Planet p) {
        planets.add(p);
    }
    public void addPlanets(ArrayList<Planet> planets) {
        this.planets.addAll(planets);
    }
    public void removeAllPlanets() {
        planets = new ArrayList<Planet>();
    }
    public void removePlanet(int index) {

        if(index < 0 || index >= planets.size())
            return;

        planets.remove(index);
    }
    public void removePlanet(String name) {
        planets.remove(getPlanet(name));
    }

    public String toString() {
        String description =
                "Dette solsystemet har 1 stjerne som heter "
                + centerStar.getName() + " og " + planets.size()
                + (planets.size() == 1 ? " planet." : " planeter.");

        return description;
    }
    public PlanetSystem(String name) {
        this.name = name;
    }

    public PlanetSystem(String name, Star centerStar) {
        this.name = name;
        this.centerStar = centerStar;
    }
    public PlanetSystem(String name, Star centerStar, ArrayList<Planet> planets) {
        this.name = name;
        this.centerStar = centerStar;
        this.planets = planets;
    }

}
