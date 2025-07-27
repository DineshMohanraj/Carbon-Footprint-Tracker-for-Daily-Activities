import java.util.ArrayList;
import java.util.List;
public class Tracker {
    

    private List<Activity> activities;

    public Tracker() {
        activities = new ArrayList<>();
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public double calculateTotalFootprint() {
        double total = 0;
        for (Activity a : activities) {
            total += a.calculateFootprint();
        }
        return total;
    }

    public void showReport() {
        System.out.println("\n--- Daily Carbon Footprint Report ---");
        for (Activity a : activities) {
            System.out.printf("%s (%.2f units): %.2f kg CO2\n",
                a.getName(), a.getQuantity(), a.calculateFootprint());
        }
        System.out.printf("Total CO2 Emission: %.2f kg\n", calculateTotalFootprint());
    }
}


