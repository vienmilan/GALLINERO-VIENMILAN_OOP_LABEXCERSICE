class Submarine extends WaterTransport {
    private double maxDepthMeters;

    public Submarine(String make, String model, int year, String fuelType, double maxDepthMeters) {
        super(make, model, year, fuelType, "propeller");
        this.maxDepthMeters = maxDepthMeters;
    }

    public void dive() {
        System.out.println("The submarine is diving to a depth of " + this.maxDepthMeters + " meters.");
    }
}
