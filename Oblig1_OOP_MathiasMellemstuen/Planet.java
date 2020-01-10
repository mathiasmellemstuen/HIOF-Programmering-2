public class Planet {

    private int id; //Id på planeten. Dette er det samme som index i listen over planeter. 
    private String name; 
    private double radius;
    private double gravity; 
    
    // Getter / setters til name, radius, gravity, id. 
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

    //Constructor. Alle variabler til planeten må settes i konstruktoren som parametere. 
    public Planet(int _id, String _name, double _radius, double _gravity) {
        id = _id; 
        name = _name; 
        radius = _radius; 
        gravity = _gravity; 
    }

    /*
    
    Kan ha flere constructorer sålenge argumentene er annerledes. Passer derimot ikke i denne sammenhengen. 

    public Planet() {

    }

    */
}