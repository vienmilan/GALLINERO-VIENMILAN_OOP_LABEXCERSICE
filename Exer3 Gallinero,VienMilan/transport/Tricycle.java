class Tricycle extends LandTransport {
    private final int seatingCapacity;

    public Tricycle(String make, String model, int year, String fuelType, int seatingCapacity) {
        super(make, model, year, "gasoline", 3);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void move() {
        System.out.println("The tricycle is puttering along the road.");
    }
}
