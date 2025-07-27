 import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();

        System.out.println("Carbon Footprint Tracker");

        String[] activityTypes = {"Driving (car)", "Electricity usage", "Meat consumption"};
        double[] emissionFactors = {0.271, 0.475, 2.5}; // in kg CO2 per unit

        for (int i = 0; i < activityTypes.length; i++) {
            System.out.print("Enter " + activityTypes[i] + " (units): ");
            double qty = scanner.nextDouble();
            tracker.addActivity(new Activity(activityTypes[i], emissionFactors[i], qty));
        }

        tracker.showReport();
        scanner.close();
    }
}


