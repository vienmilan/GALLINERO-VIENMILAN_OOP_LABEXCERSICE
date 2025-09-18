class Motorcycle extends LandTransport {
    private boolean isElectric;

    public Motorcycle(String make, String model, int year, String fuelType, boolean isElectric) {
        super(make, model, year, fuelType, 2);
        this.isElectric = isElectric;
    }

    public void popAWheelie() {
        if (!isElectric) {
            System.out.println("The motorcycle pops a wheelie! Vroom!");
        } else {
            System.out.println("The electric motorcycle zips forward silently.");
        }
    }
}
