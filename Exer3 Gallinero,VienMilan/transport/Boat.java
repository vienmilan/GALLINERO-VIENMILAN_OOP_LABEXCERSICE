class Boat extends WaterTransport {
    private boolean hasSails;

    public Boat(String make, String model, int year, String fuelType, boolean hasSails) {
        super(make, model, year, fuelType, hasSails ? "sails" : "engine");
        this.hasSails = hasSails;
    }

    public void dropAnchor() {
        System.out.println("The boat has dropped its anchor. Ahoy!");
    }
}
