public class Activity {
    private String name;
    private double emissionFactor; // kg CO2 per unit
    private double quantity;

    public Activity(String name, double emissionFactor, double quantity) {
        this.name = name;
        this.emissionFactor = emissionFactor;
        this.quantity = quantity;
    }

    public double calculateFootprint() {
        return emissionFactor * quantity;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }
}
