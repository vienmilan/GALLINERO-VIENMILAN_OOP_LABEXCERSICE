class Airplane extends AirTransport {
    private double wingspanMeters;

    public Airplane(String make, String model, int year, String fuelType, int numberOfEngines, double wingspanMeters) {
        super(make, model, year, fuelType, numberOfEngines);
        this.wingspanMeters = wingspanMeters;
    }

    public void takeOff() {
        System.out.println("The airplane is taking off from the runway. Its wingspan is " + this.wingspanMeters + " meters.");
    }
}
