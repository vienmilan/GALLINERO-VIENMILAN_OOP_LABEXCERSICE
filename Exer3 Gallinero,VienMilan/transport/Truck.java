class Truck extends LandTransport {
    private final double maxLoadKg;

    public Truck(String make, String model, int year, String fuelType, double maxLoadKg) {
        super(make, model, year, fuelType, 4);
        this.maxLoadKg = maxLoadKg;
    }

    public void carryCargo() {
        System.out.println("The truck is carrying a heavy load of up to " + this.maxLoadKg + " kg.");
    }
}
