import java.util.Scanner; 

//Dette er både oppgave 2.3 og bonusoppgaven. 

class Oblig23 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Skriv inn navn på planeten: ");
        String name = scanner.next();
        
        System.out.println("Skriv inn radius på planeten");
        double radius = scanner.nextDouble();

        System.out.println("Skriv inn gravitasjonen på planeten: ");
        double gravity = scanner.nextDouble(); 

        scanner.close(); 

        Planet planet = new Planet(name, radius, gravity); 
        planet.print(); 
    }
}
class Planet {

    private String name; 
    private double radius;
    private double gravity; 
    
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

        System.out.println("Dette er egenskapene til denne planeten: ");
        System.out.println("Name: " + name);
        System.out.println("Radius: " + radius + " km");
        System.out.println("Gravity: " + gravity + " m/s²");
    }

    public Planet(String _name, double _radius, double _gravity) {
        name = _name; 
        radius = _radius; 
        gravity = _gravity; 
    }
}
