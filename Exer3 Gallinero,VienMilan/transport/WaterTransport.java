class WaterTransport extends Transportation {
    private String propulsion;

    public WaterTransport(String make, String model, int year, String fuelType, String propulsion) {
        super(make, model, year, fuelType);
        this.propulsion = propulsion;
    }

    @Override
    public void move() {
        System.out.println("The water vessel is sailing with its " + this.propulsion + " propulsion.");
    }
}
