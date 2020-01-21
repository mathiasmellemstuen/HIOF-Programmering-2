public class Planet {

    private int id; //Id på planeten. Dette er det samme som index i listen over planeter. 
    private String name; 
    private double radius;
    private double gravity; 
    
    // Getter / setters til name, radius, gravity, id. 
    public void SetId(int id) {
        this.id = id; 
    }

    public int getId() {
        return id; 
    }

    public void setName(String name) {
        this.name = name; 
    }

    public String getName() {
        return name; 
    }

    public void setRadius(double radius) {
        this.radius = radius; 
    }

    public double getRadius() {
        return radius; 
    }

    public void setGravity(double gravity) {
        this.radius = gravity; 
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

    //Constructor. Alle variabler til planeten må settes i konstruktoren som parametere. 
    public Planet(int id, String name, double radius, double gravity) {
        this.id = id; 
        this.name = name; 
        this.radius = radius; 
        this.gravity = gravity; 
    }

    /*
    
    Kan ha flere constructorer sålenge argumentene er annerledes. Passer derimot ikke i denne sammenhengen. 

    public Planet() {

    }

    */
}