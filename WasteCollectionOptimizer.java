public class WasteCollectionOptimizer {
 import java.util.Scanner;

public class WasteCollectionOptimizer {

    // 3c) Method to calculate total waste collected from two points
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 3a) Data Types Example
        int vehicleNumber = 101;
        double wasteCollected = 120.5;
        int collectionPoints = 8;
        char vehicleStatus = 'A';

        System.out.println("=== Vehicle Details ===");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected (kg): " + wasteCollected);
        System.out.println("Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);
        System.out.println();

        // 3b) If-Else Condition
        System.out.print("Enter waste collected in kg: ");
        double inputWaste = scanner.nextDouble();

        if (inputWaste >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }
        System.out.println();

        // 3c) Methods Implementation
        System.out.print("Enter waste for Point 1: ");
        double p1 = scanner.nextDouble();
        System.out.print("Enter waste for Point 2: ");
        double p2 = scanner.nextDouble();

        double total = calculateTotalWaste(p1, p2);
        System.out.println("Total waste collected: " + total + " kg");

        scanner.close();
    }
}   
}
