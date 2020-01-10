//Dette er både oppgave 2.3 og bonusoppgavene.

import java.util.ArrayList;
import java.util.Scanner; 
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;


class Oblig23 {
    
    private static Scanner scanner; 
    private static ArrayList<Planet> planetList = new ArrayList<Planet>();
    private static boolean running = true; 
    private static String planetsFilePath = "Planets.txt"; 

    private static void addNewPlanet() {

        System.out.print("Skriv inn navn på planeten: ");
        String name = scanner.next();
        
        System.out.print("Skriv inn radius på planeten: ");
        double radius = scanner.nextDouble();

        System.out.print("Skriv inn gravitasjonen på planeten: ");
        double gravity = scanner.nextDouble(); 


        Planet planet = new Planet(planetList.size(), name, radius, gravity); 
        planetList.add(planet);
        System.out.println("La til en ny planet: ");
        planet.print(); 
    }
    private static void updatePlanet() {
        System.out.print("\nSkriv inn id på planeten du vil endre på: ");

        int id = scanner.nextInt(); 

        if(id >= planetList.size() && id <= 0) {
            System.out.println("Finner ingen planet med id: " + id);
            return; 
        }

        System.out.print("Skriv inn navn på planeten: ");
        String name = scanner.next();
        
        System.out.print("Skriv inn radius på planeten: ");
        double radius = scanner.nextDouble();

        System.out.print("Skriv inn gravitasjonen på planeten: ");
        double gravity = scanner.nextDouble(); 

        planetList.get(id).setName(name);
        planetList.get(id).setRadius(radius);
        planetList.get(id).setGravity(gravity);

        System.out.println("\nPlaneten er endret.\n");
    }
    private static void deletePlanet() {
        System.out.print("Skriv inn id på planeten: ");

        int id = scanner.nextInt();

        if(id < planetList.size() && id >= 0) {

            planetList.remove(id); 
            System.out.println("Fjernet planet!");
            return; 
        }
        System.out.println("Finner ikke en planet med id: " + id + "\n");
    }

    private static void listPlanets() {
        
        System.out.println("Liste over alle planeter:\n" );

        for(int i = 0; i < planetList.size(); i++) {

            planetList.get(i).print();
            System.out.println("");
        }
    }
    private static void readPlanetFile()  {

        try {

            File file = new File(planetsFilePath); 
    
            Scanner fileScanner = new Scanner(file); 
            
            while(fileScanner.hasNextLine()) {

                String[] splitted = fileScanner.nextLine().split(";"); 

                Planet p = new Planet(planetList.size(),splitted[0],Double.parseDouble(splitted[1]),Double.parseDouble(splitted[2]));
                planetList.add(p); 
            }

            fileScanner.close(); 
            
        } catch(FileNotFoundException e) {
            System.out.println("Eksisterer " + planetsFilePath + " ?");
            System.out.println(e.toString());

            //throw e; 

        } 
    }
    private static void writePlanetFile() {

        try {
            File file = new File(planetsFilePath); 

            FileWriter fileWriter = new FileWriter(file);

            for(int i = 0; i < planetList.size(); i++) {

                Planet p = planetList.get(i); 
                
                fileWriter.write(p.getName() + ";");
                fileWriter.write(p.getRadius() + ";");
                fileWriter.write(p.getGravity() + ";");

                if(planetList.size() > i - 1)
                    fileWriter.write("\n"); 
            }

            fileWriter.flush();
            fileWriter.close();

        } catch(IOException e) {
            System.out.println("Kunne ikke skrive til filen.");
            System.out.println(e.toString());
        }

    }
    private static void printAllActions() {
        System.out.println("\nSkriv inn 1 for å legge til en ny planet.");
        System.out.println("Skriv inn 2 for å oppdatere en planet.");
        System.out.println("Skriv inn 3 for å slette en planet.");
        System.out.println("Skriv inn 4 for å liste alle planeter.");
        System.out.println("Skriv inn 5 for å avslutte. \n");
    }
    private static void chooseAction() {

        System.out.print("Kommando (skriv 0 for alle kommandoer): "); 
        int choice = scanner.nextInt(); 
        
        switch(choice) {
            case 0: 
                printAllActions();
            break; 
            case 1: 
                addNewPlanet(); 
                writePlanetFile();
            break; 
            case 2: 
                updatePlanet(); 
                writePlanetFile();
            break; 
            case 3: 
                deletePlanet();
                writePlanetFile();
            break; 
            case 4: 
                listPlanets();
            break;
            case 5: 
                running = false; // Dette vil gjøre at while loopen i main ikke kjører lenger og programmet lukkes på riktig måte. 
            break; 
            default: 
                System.out.println(choice + " er feil.");
                chooseAction();
            break;
        }
    }
    public static void main(String[] args) {
        
        scanner = new Scanner(System.in); 

        readPlanetFile();

        while(running) chooseAction();
        
        scanner.close(); 

    }
}
