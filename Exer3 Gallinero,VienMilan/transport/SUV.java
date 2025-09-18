class SUV extends LandTransport {
    private final int seatingCapacity;

    public SUV(String make, String model, int year, String fuelType, int seatingCapacity) {
        super(make, model, year, fuelType, 4);
        this.seatingCapacity = seatingCapacity;
    }

    public void transportPassengers() {
        System.out.println("The SUV can transport up to " + this.seatingCapacity + " passengers.");
    }
}
