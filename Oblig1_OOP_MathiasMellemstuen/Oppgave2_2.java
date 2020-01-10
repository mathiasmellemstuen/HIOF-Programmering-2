import java.util.Scanner;

public class Oppgave2_2 {

    public static double moonToEarthPercentage = 0.17;
    public static double CalculateMoonWeightFromEarthWeight(double yourEarthWeight) {

        return yourEarthWeight * moonToEarthPercentage; 
    }

    public static void main(String[] args) {
        
        System.out.println("Skriv inn din vekt på jorden (kg): ");

        Scanner scanner = new Scanner(System.in);
        double userWeight = scanner.nextDouble();
        scanner.close();

        double weight = CalculateMoonWeightFromEarthWeight(userWeight);
        System.out.println("Din vekt på månen vil være: " + weight + " kg.");

    }
}