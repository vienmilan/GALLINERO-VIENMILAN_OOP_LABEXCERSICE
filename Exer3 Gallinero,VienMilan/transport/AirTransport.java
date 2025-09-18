class AirTransport extends Transportation {
    private int numberOfEngines;

    public AirTransport(String make, String model, int year, String fuelType, int numberOfEngines) {
        super(make, model, year, fuelType);
        this.numberOfEngines = numberOfEngines;
    }

    @Override
    public void move() {
        System.out.println("The aircraft is flying using its " + this.numberOfEngines + " engines.");
    }
}
