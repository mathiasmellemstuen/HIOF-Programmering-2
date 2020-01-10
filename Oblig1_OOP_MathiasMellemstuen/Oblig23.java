import java.util.ArrayList;
import java.util.Scanner; 

//Dette er både oppgave 2.3 og bonusoppgavene. 

class Oblig23 {
    
    private static ArrayList<Planet> planetList = new ArrayList<Planet>();
    private static boolean running = true; 

    private static void addNewPlanet(Scanner scanner) {

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
    private static void updatePlanet(Scanner scanner) {
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
    private static void deletePlanet(Scanner scanner) {
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
        
        System.out.println("Liste over alle planeter: ");

        for(int i = 0; i < planetList.size(); i++) {

            planetList.get(i).print();
            System.out.println("");
        }
    }
    private static void printAllActions() {
        System.out.println("\nSkriv inn 1 for å legge til en ny planet.");
        System.out.println("Skriv inn 2 for å oppdatere en planet.");
        System.out.println("Skriv inn 3 for å slette en planet.");
        System.out.println("Skriv inn 4 for å liste alle planeter.");
        System.out.println("Skriv inn 5 for å avslutte. \n");
    }
    private static void chooseAction(Scanner scanner) {

        System.out.print("Kommando (skriv 0 for alle kommandoer): "); 
        int choice = scanner.nextInt(); 
        
        switch(choice) {
            case 0: 
                printAllActions();
            break; 
            case 1: 
                addNewPlanet(scanner); 
            break; 
            case 2: 
                updatePlanet(scanner); 
            break; 
            case 3: 
                deletePlanet(scanner);
            break; 
            case 4: 
                listPlanets();
            break;
            case 5: 
                System.exit(0);
            break; 
            default: 
                System.out.println(choice + " er feil.");
                chooseAction(scanner);
            break; 
        }
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 

        while(running) chooseAction(scanner);
        
        scanner.close(); 

    }
}
class Planet {

    private int id; 
    private String name; 
    private double radius;
    private double gravity; 
    
    public void SetId(int newId) {
        id = newId; 
    }

    public int getId() {
        return id; 
    }

    public void setName(String newName) {
        name = newName; 
    }

    public String getName() {
        return name; 
    }

    public void setRadius(double newRadius) {
        radius = newRadius; 
    }

    public double getRadius() {
        return radius; 
    }

    public void setGravity(double newGravity) {
        gravity = newGravity; 
    }

    public double getGravity() {
        return gravity;
    }

    public void print() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Radius: " + radius + " km");
        System.out.println("Gravity: " + gravity + " m/s²" + "\n");
    }

    public Planet(int _id, String _name, double _radius, double _gravity) {
        id = _id; 
        name = _name; 
        radius = _radius; 
        gravity = _gravity; 
    }
}
