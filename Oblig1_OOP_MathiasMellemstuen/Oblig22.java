import java.util.Scanner;

public class Oblig22 {

    public static double moonToEarthRatio = 0.17;
    public static double CalculateMoonWeightFromEarthWeight(double yourEarthWeight) {

        return yourEarthWeight - (yourEarthWeight * moonToEarthRatio); 
    }

    public static void main(String[] args) {
        
        System.out.println("Skriv inn din vekt på jorden (kg): ");

        Scanner scanner = new Scanner(System.in);
        String userWeight = scanner.next();
        scanner.close();

        double weight = CalculateMoonWeightFromEarthWeight(Integer.parseInt(userWeight));
        System.out.println("Din vekt på månen vil være: " + weight + " kg.");

    }
}